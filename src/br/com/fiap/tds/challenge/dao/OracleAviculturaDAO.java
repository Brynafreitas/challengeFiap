package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Avicultura;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;

public class OracleAviculturaDAO implements AviculturaDAO {
    public void cadastrarAvicultura(Avicultura avicultura) {
        PreparedStatement stmt_abastec = null;
        PreparedStatement stmt_avicultura = null;
        Connection conexao = ChallengeConnectionManager.getInstance().getConnection();
        try {
            // Iniciar transação
            conexao.setAutoCommit(false);

            // Executar insert na primeira tabela
            String insert_abastecimento = "INSERT INTO T_ABASTECIMENTO(id_abastec, id_fabrica, nm_marca, tipo_recurso, nm_fornecedor, dt_registro) values(SEQ_ID_ABASTEC.nextval,?,?,?,?,?)";
            stmt_abastec = conexao.prepareStatement(insert_abastecimento, new String[] { "id_abastec" });

            stmt_abastec.setString(1, avicultura.getIdFabrica());
            stmt_abastec.setString(2, avicultura.getMarca());
            stmt_abastec.setString(3, avicultura.getTipoRecurso());
            stmt_abastec.setString(4, avicultura.getNmFornecedor());
            stmt_abastec.setDate(5, Date.valueOf(avicultura.getDtRegistro()));

            stmt_abastec.executeUpdate();

            // Recuperar valor da chave primária gerada na primeira tabela
            ResultSet generatedKeys = stmt_abastec.getGeneratedKeys();
            int idAbastec = -1;

            if (generatedKeys.next()) {
                idAbastec = generatedKeys.getInt(1);

            }

            // Executar insert na segunda tabela usando o valor da chave primária
            String insert_avicultura = "INSERT INTO T_AVICULTURA(id_abastec, ovo_caipira, livre_gaiola, dt_validade, qt_lotes, vl_unitario, tipo_recurso) values(?,?,?,?,?,?,?)";

            stmt_avicultura = conexao.prepareStatement(insert_avicultura);

            stmt_avicultura.setInt(1, idAbastec);
            stmt_avicultura.setBoolean(2, avicultura.isOvoCaipira());
            stmt_avicultura.setBoolean(3, avicultura.isLivreGaiola());
            stmt_avicultura.setDate(4, Date.valueOf(avicultura.getDtValidade()));
            stmt_avicultura.setInt(5, avicultura.getQtLotes());
            stmt_avicultura.setDouble(6, avicultura.getVlUnitario());
            stmt_avicultura.setString(7, avicultura.getTipoRecurso());
            
            stmt_avicultura.executeUpdate();

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
        }
    }
}