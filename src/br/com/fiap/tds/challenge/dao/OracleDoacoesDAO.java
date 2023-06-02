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
			String sql = "INSERT INTO T_DOACOES(id_doacao, id_fabrica, nm_marca, qt_refeicoes, uf_doacao, dt_doacao, vl_investido) values(SEQ_ID_DOACAO.nextval,?,?,?,?,?,?)";
			stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, doacoes.getIdFabrica());
			stmt.setString(2, doacoes.getMarca());
			stmt.setInt(3, doacoes.getQtRefeicoes());
			stmt.setString(4, doacoes.getUfDoacao());
			stmt.setDate(5, Date.valueOf(doacoes.getDtDoacao()));
			stmt.setDouble(6, doacoes.getVlInvestido());
		
			
			stmt.execute();
			System.out.println("Cadastrado com sucesso");
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

