package br.com.fiap.tds.challenge.test;

import br.com.fiap.tds.challenge.bean.Fabrica;
import br.com.fiap.tds.challenge.bean.Usuario;
import br.com.fiap.tds.challenge.dao.FabricaDAO;
import br.com.fiap.tds.challenge.dao.UsuarioDAO;
import br.com.fiap.tds.challenge.factory.DAOFactory;

public class TesteDaoFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaDAO dao = DAOFactory.getFabricaDAO();
		Fabrica heinz = new Fabrica();
		
		heinz.setId("Fabrica 1");
		heinz.setMarca("Heinz");
		heinz.setUf("SP");
		
		dao.cadastrarFabrica(heinz);
		
		UsuarioDAO dao1 = DAOFactory.getUsuarioDAO();
		Usuario usuario1 = new Usuario();
		
		usuario1.setId("RM25631");
		usuario1.setSenha("89123");
		usuario1.setIdFabrica("Fabrica 1");
		usuario1.setMarca("Heinz");
		
		dao1.cadastrarUsuario(usuario1);
		
	}

	
}
