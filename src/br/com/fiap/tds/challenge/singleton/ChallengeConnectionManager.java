package br.com.fiap.tds.challenge.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class ChallengeConnectionManager {

	private static ChallengeConnectionManager instance;
    
    private ChallengeConnectionManager() {}
    
    
    public static ChallengeConnectionManager getInstance() {
    	if(instance == null) {
    		instance = new ChallengeConnectionManager();
    	}
    			
    	return instance;
    }


	public Connection getConnection() {
		
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "USUARIO",
					"SENHA");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}

		
}
