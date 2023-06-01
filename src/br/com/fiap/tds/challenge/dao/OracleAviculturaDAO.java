package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Avicultura;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;

public class OracleAviculturaDAO implements AviculturaDAO {
	public void cadastrarAvicultura(Avicultura avicultura) {
		PreparedStatement stmt = null;
		Connection	conexao = ChallengeConnectionManager.getInstance().getConnection();
		try {
			String sql = "INSERT INTO T_AVICULTURA(T_ABASTECIMENTO_ID_ABASTEC, ovo_caipira, livre_gaiola, dt_validade, qt_lotes, vl_unitario, tipo_recurso) values(?,?,?,?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, avicultura.getId());
			stmt.setBoolean(2, avicultura.isOvoCaipira());
			stmt.setBoolean(3, avicultura.isLivreGaiola());
			stmt.setDate(4, Date.valueOf(avicultura.getDtValidade()));
			stmt.setInt(5, avicultura.getQtLotes());
			stmt.setDouble(6, avicultura.getVlUnitario());
			stmt.setString(7, avicultura.getTipoRecurso());
		
			
			stmt.execute();
			System.out.println("Cadastrado com sucesso");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

