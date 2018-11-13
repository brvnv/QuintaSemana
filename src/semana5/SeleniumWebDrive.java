package semana5;

/**
*   Escreva 10 metodos do Selenium que façam ações na pagina web da Cognizant
 *  Entre esses métodos tenha pelo menos um método para
 *  -Procurar um elemento por id
 *  -Clicar em um elemento da pagina html
 *  -Usar um elemento WebDriver
 *  -Escrever em um campo de texto
 *
 *  Com esses metodos que você criou, tente abrir a sua timesheet
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ChromeDriver;
public class SeleniumWebDrive{

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\users\\nattskug\\downloads\\chromedriver.exe"); //agora entendi como vari�veis de ambiente poderiam se aplicar em c�digo do primeiro desafio
	WebDriver driver=new ChromeDriver();
	driver.get("https://onecognizant.cognizant.com");
	Thread.sleep(9000);
	System.out.println(driver.getTitle());
    }
}