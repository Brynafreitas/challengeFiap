package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Natural;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;

public class OracleNaturalDAO implements NaturalDAO {

    public void cadastrarNatural(Natural natural) {
        PreparedStatement stmt_abastec = null;
        PreparedStatement stmt_natural = null;
        Connection conexao = ChallengeConnectionManager.getInstance().getConnection();

        try {
            // Iniciar transação
            conexao.setAutoCommit(false);

            // Executar insert na primeira tabela
            String insert_abastecimento = "INSERT INTO T_ABASTECIMENTO(id_abastec, id_fabrica, nm_marca, tipo_recurso, nm_fornecedor, dt_registro) values(SEQ_ID_ABASTEC.nextval,?,?,?,?,?)";
            stmt_abastec = conexao.prepareStatement(insert_abastecimento, new String[] { "id_abastec" });

            stmt_abastec.setString(1, natural.getIdFabrica());
            stmt_abastec.setString(2, natural.getMarca());
            stmt_abastec.setString(3, natural.getTipoRecurso());
            stmt_abastec.setString(4, natural.getNmFornecedor());
            stmt_abastec.setDate(5, Date.valueOf(natural.getDtRegistro()));

            stmt_abastec.executeUpdate();

            // Recuperar valor da chave primária gerada na primeira tabela
            ResultSet generatedKeys = stmt_abastec.getGeneratedKeys();
            int idAbastec = -1;

            if (generatedKeys.next()) {
                idAbastec = generatedKeys.getInt(1);
            }

            // Executar insert na segunda tabela usando o valor da chave primária
            String insert_natural = "INSERT INTO T_NATURAL(id_abastec, nm_recurso, tipo_recurso, qt_gasta, vl_gasto) values(?,?,?,?,?)";

            stmt_natural = conexao.prepareStatement(insert_natural);
            stmt_natural.setInt(1, idAbastec);
            stmt_natural.setString(2, natural.getNmRecurso());
            stmt_natural.setString(3, natural.getTipoRecurso());
            stmt_natural.setDouble(4, natural.getQtGasta());
            stmt_natural.setDouble(5, natural.getVlGasto());
            stmt_natural.executeUpdate();

            // Finalizar transação
            conexao.commit();

            System.out.println("Cadastrado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
            // Em caso de erro, desfaz as operações realizadas
            if (conexao != null) {
                try {
                    conexao.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } finally {
            // Fechar os statements e a conexão
            if (stmt_abastec != null) {
                try {
                    stmt_abastec.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt_natural != null) {
                try {
                    stmt_natural.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
