package br.com.fiap.tds.challenge.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.tds.challenge.bean.Doacoes;
import br.com.fiap.tds.challenge.singleton.ChallengeConnectionManager;

public class OracleDoacoesDAO implements DoacoesDAO {
	
	public void cadastrarDoacoes(Doacoes doacoes) {
		PreparedStatement stmt = null;
		Connection	conexao = ChallengeConnectionManager.getInstance().getConnection();
		try {
			String sql = "INSERT INTO T_DOACOES(id_doacao, T_FABRICA_ID_FABRICA, T_FABRICA_NM_MARCA, qt_refeicoes, uf_doacao, dt_doacao, vl_investido) values(?,?,?,?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, doacoes.getId());
			stmt.setString(2, doacoes.getIdFabrica());
			stmt.setString(3, doacoes.getMarca());
			stmt.setInt(4, doacoes.getQtRefeicoes());
			stmt.setString(5, doacoes.getUfDoacao());
			stmt.setDate(6, Date.valueOf(doacoes.getDtDoacao()));
			stmt.setDouble(7, doacoes.getVlInvestido());
		
			
			stmt.execute();
			System.out.println("Cadastrado com sucesso");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

