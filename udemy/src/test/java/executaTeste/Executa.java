  package executaTeste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.MetodosDeTeste;

public class Executa {
	MetodosDeTeste metodos = new MetodosDeTeste();
	Elementos elementos = new Elementos();

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.udemy.com/join/login-popup/");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		//metodos.clicarLogin(elementos.clicarLogin);
		metodos.clicarLoginApple(elementos.clicarLoginApple);
		metodos.idApple(elementos.idApple, "gg8600832@gmail.com");
		metodos.clicarAvancar(elementos.clicarAvancar);
		metodos.preencherSenhaApple(elementos.preencherSenhaApple, "Biel@123");
		metodos.clicarContinuar(elementos.clicarContinuar);

	}
}
	
	


