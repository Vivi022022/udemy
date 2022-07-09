package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosDeTeste {
	WebDriver driver;
	
	public void abrirNavegador(String url) {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
		
		
		
	}
	//public void clicarLogin(By elemento) throws InterruptedException {
		//driver.findElement(elemento).click();
		//Thread.sleep(6000);
	//}
	public void clicarLoginApple(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);
	}
	public void idApple(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void clicarAvancar(By elemento) throws InterruptedException {
		driver.findElement(elemento).click();
		Thread.sleep(3000);
	}
	public void preencherSenhaApple(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void clicarContinuar(By elemento)  {
		driver.findElement(elemento).click();
	

	}
}
