package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Abastecimento;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;

public class OracleAbastecimentoDAO implements AbastecimentoDAO {
	public void cadastrarAbastecimento(Abastecimento abastecimento) {
		PreparedStatement stmt = null;
		Connection	conexao = ChallengeConnectionManager.getInstance().getConnection();
		try {
			String sql = "INSERT INTO T_ABASTECIMENTO(id_abastec, T_FABRICA_ID_FABRICA, T_FABRICA_NM_MARCA, tipo_recurso, nm_fornecedor, dt_registro) values(?,?,?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, abastecimento.getId());
			stmt.setString(2, abastecimento.getIdFabrica());
			stmt.setString(3, abastecimento.getMarca());
			stmt.setString(4, abastecimento.getTipoRecurso());
			stmt.setString(5, abastecimento.getNmFornecedor());
			stmt.setDate(6, Date.valueOf(abastecimento.getDtRegistro()));
		
			
			stmt.execute();
			System.out.println("Cadastrado com sucesso");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

