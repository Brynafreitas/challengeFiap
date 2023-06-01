package br.com.fiap.tds.challenge.factory;

import br.com.fiap.tds.challenge.dao.FabricaDAO;
import br.com.fiap.tds.challenge.dao.OracleFabricaDAO;
import br.com.fiap.tds.challenge.dao.OracleUsuarioDAO;
import br.com.fiap.tds.challenge.dao.UsuarioDAO;

public abstract class DAOFactory {
	public static UsuarioDAO getUsuarioDAO() {
		return  new OracleUsuarioDAO();
	}
	public static FabricaDAO getFabricaDAO() {
		return  new OracleFabricaDAO();
}
}