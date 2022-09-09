package mz.gov.misau.lojavirtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import mz.gov.misau.lojavirtual.model.Acesso;
import mz.gov.misau.lojavirtual.repository.AcessoRepository;
import mz.gov.misau.lojavirtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualApplication.class)
class LojaVirtualApplicationTests {

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private AcessoRepository acessoRepository;

	@Test
	public void testCadastroAcesso() {
		Acesso acesso = new Acesso();
		acesso.setDescricao("ROLE_ADMIN");
		acessoService.save(acesso);
	}

}
