package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Natural;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;

public class OracleNaturalDAO implements NaturalDAO {
	public void cadastrarNatural(Natural natural) {
		PreparedStatement stmt = null;
		Connection	conexao = ChallengeConnectionManager.getInstance().getConnection();
		try {
			String sql = "INSERT INTO T_NATURAL(T_ABASTECIMENTO_ID_ABASTEC, nm_recurso, tipo_recurso, qt_gasta, vl_gasto) values(?,?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, natural.getId());
			stmt.setString(2, natural.getNmRecurso());
			stmt.setString(3, natural.getTipoRecurso());
			stmt.setDouble(4, natural.getQtGasta());
			stmt.setDouble(5, natural.getVlGasto());
			
			stmt.execute();
			System.out.println("Cadastrado com sucesso");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	}

