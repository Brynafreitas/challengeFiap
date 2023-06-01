package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Fabrica;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;

public class OracleFabricaDAO implements FabricaDAO {
	@Override
	public void cadastrarFabrica(Fabrica fabrica) {
		
		PreparedStatement stmt = null;
		Connection	conexao = ChallengeConnectionManager.getInstance().getConnection();
		try {
			String sql = "INSERT INTO T_FABRICA(id_fabrica, nm_marca, uf_fabrica) values(?,?,?)";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, fabrica.getId());
			stmt.setString(2, fabrica.getMarca());
			stmt.setString(3, fabrica.getUf());
			
			stmt.execute();
			System.out.println("Cadastrado com sucesso");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

