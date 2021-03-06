package br.com.jogestionti.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jogestionti.projeto.dao.CorrentistaDao;
import br.com.jogestionti.projeto.model.Correntista;


@RestController // Monitorar uma URL
public class CorrentistaController {

	@Autowired // Permite com que a interface seja executada com os proecessos CRUD
	private CorrentistaDao dao;
	
	@GetMapping("/correntista") // Permite indicar o nome da página que vocêdeverá executar no endereço da sua URL

	// Criando um método de leitura de dados da nossa tabela 
	public ArrayList<Correntista> recuperarTudo(){
		ArrayList<Correntista> lista;
		lista=(ArrayList<Correntista>)dao.findAll();
		return lista;
	}
}
