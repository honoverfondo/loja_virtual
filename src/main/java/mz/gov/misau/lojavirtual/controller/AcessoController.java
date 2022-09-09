package mz.gov.misau.lojavirtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import mz.gov.misau.lojavirtual.model.Acesso;
import mz.gov.misau.lojavirtual.service.AcessoService;

@Controller
public class AcessoController {

	@Autowired
	private AcessoService acessoService;
	
	@PostMapping("/salvarAcesso")
	public Acesso SalvarAcesso(Acesso acesso) {
		return acessoService.save(acesso);
	}
}
