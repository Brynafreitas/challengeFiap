package br.com.fiap.tds.challenge.test;

import java.time.LocalDate;

import br.com.fiap.tds.challenge.bean.Abastecimento;
import br.com.fiap.tds.challenge.bean.Avicultura;
import br.com.fiap.tds.challenge.bean.Doacoes;
import br.com.fiap.tds.challenge.bean.Fabrica;
import br.com.fiap.tds.challenge.bean.Natural;
import br.com.fiap.tds.challenge.bean.Usuario;
import br.com.fiap.tds.challenge.dao.AbastecimentoDAO;
import br.com.fiap.tds.challenge.dao.AviculturaDAO;
import br.com.fiap.tds.challenge.dao.DoacoesDAO;
import br.com.fiap.tds.challenge.dao.FabricaDAO;
import br.com.fiap.tds.challenge.dao.NaturalDAO;
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
		
		DoacoesDAO dao2 = DAOFactory.getDoacoesDAO();
		Doacoes doacoes1 = new Doacoes();
		
		doacoes1.setId(1);
		doacoes1.setIdFabrica("Fabrica 1");
		doacoes1.setMarca("Heinz");
		doacoes1.setQtRefeicoes(5000);
		doacoes1.setUfDoacao("SP");
		doacoes1.setDtDoacao(LocalDate.of(2023, 05, 30));
		doacoes1.setVlInvestido(3900000);
		dao2.cadastrarDoacoes(doacoes1);
		
		
		AbastecimentoDAO dao3 = DAOFactory.getAbastecimentoDAO();
		Abastecimento abastecimento1 = new Abastecimento();//Nao está permitindo instancionar este Abastecimento :(
		
		
		abastecimento1.setId(1);
		abastecimento1.setIdFabrica("Fabrica 1");
		abastecimento1.setMarca("Heinz");
		abastecimento1.setTipoRecurso("Água");
		abastecimento1.setNmFornecedor("SABESP");
		abastecimento1.setDtRegistro(LocalDate.of(2023, 05, 19));
		dao3.cadastrarAbastecimento(abastecimento1);
		
		
		NaturalDAO dao4 = DAOFactory.getNaturalDAO();
		Natural natural1 = new Natural();
		
		natural1.setId(1);
		natural1.setNmRecurso("Água");
		natural1.setTipoRecurso("Natural");
		natural1.setQtGasta(0);
		natural1.setVlGasto(0);
		dao4.cadastrarNatural(natural1);
		
		AviculturaDAO dao5 = DAOFactory.getAviculturaDAO();
		Avicultura avicultura1 = new Avicultura();
		
		avicultura1.setId(1);
		avicultura1.setOvoCaipira(false);
		avicultura1.setLivreGaiola(false);
		avicultura1.setDtValidade(LocalDate.of(0, 0, 0));
		avicultura1.setQtLotes(0);
		avicultura1.setVlUnitario(0);
		avicultura1.setTipoRecurso(null);
		dao5.cadastrarAvicultura(avicultura1);
		
	}

	
}
