package br.com.fiap.tds.challenge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Usuario;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;


public class OracleUsuarioDAO implements UsuarioDAO {

	public void cadastrarUsuario(Usuario usuario) {
		PreparedStatement stmt = null;
		Connection	conexao = ChallengeConnectionManager.getInstance().getConnection();
		try {
			String sql = "INSERT INTO T_USUARIO(id_usuario, cd_senha, id_fabrica, nm_marca) values(?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, usuario.getId());
			stmt.setString(2, usuario.getSenha());
			stmt.setString(3, usuario.getIdFabrica());
			stmt.setString(4, usuario.getMarca());
			
			stmt.execute();
			System.out.println("Cadastrado com sucesso");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
