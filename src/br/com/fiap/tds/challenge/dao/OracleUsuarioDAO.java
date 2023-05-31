package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Usuario;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;


public class OracleUsuarioDAO implements UsuarioDAO {

	@Override
	public void cadastarUsuario(Usuario usuario) {
		PreparedStatement stmt = null;
		Connection	conexao = ChallengeConnectionManager.getInstance().getConnection();
		try {
			String sql = "INSERT INTO ";
			stmt = conexao.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
