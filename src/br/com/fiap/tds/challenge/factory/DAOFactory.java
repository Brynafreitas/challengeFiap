package br.com.fiap.tds.challenge.factory;

import br.com.fiap.tds.challenge.dao.AbastecimentoDAO;
import br.com.fiap.tds.challenge.dao.AviculturaDAO;
import br.com.fiap.tds.challenge.dao.DoacoesDAO;
import br.com.fiap.tds.challenge.dao.FabricaDAO;
import br.com.fiap.tds.challenge.dao.NaturalDAO;
import br.com.fiap.tds.challenge.dao.OracleAbastecimentoDAO;
import br.com.fiap.tds.challenge.dao.OracleAviculturaDAO;
import br.com.fiap.tds.challenge.dao.OracleDoacoesDAO;
import br.com.fiap.tds.challenge.dao.OracleFabricaDAO;
import br.com.fiap.tds.challenge.dao.OracleNaturalDAO;
import br.com.fiap.tds.challenge.dao.OracleUsuarioDAO;
import br.com.fiap.tds.challenge.dao.UsuarioDAO;

public abstract class DAOFactory {
	public static UsuarioDAO getUsuarioDAO() {
		return  new OracleUsuarioDAO();
	}
	public static FabricaDAO getFabricaDAO() {
		return  new OracleFabricaDAO();
}
	public static DoacoesDAO getDoacoesDAO() {
		return  new OracleDoacoesDAO();
}
	public static AbastecimentoDAO getAbastecimentoDAO() {
		return  new OracleAbastecimentoDAO();
}
	public static NaturalDAO getNaturalDAO() {
		return  new OracleNaturalDAO();
}
	public static AviculturaDAO getAviculturaDAO() {
		return new OracleAviculturaDAO();
	}
}
