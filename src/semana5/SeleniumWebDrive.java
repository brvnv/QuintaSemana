package semana5;

/**
*   Escreva 10 metodos do Selenium que fa√ßam a√ß√µes na pagina web da Cognizant
 *  Entre esses m√©todos tenha pelo menos um m√©todo para
 *  -Procurar um elemento por id
 *  -Clicar em um elemento da pagina html
 *  -Usar um elemento WebDriver
 *  -Escrever em um campo de texto
 *
 *  Com esses metodos que voc√™ criou, tente abrir a sua timesheet
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class SeleniumWebDrive{

	public static void main(String[] args) {
		String driverPath="C:\\users\\lenovo\\downloads\\chromedriver.exe";
		String id="me mude";
		String senha="me mude";
		String projeto="";
		int horasTrabalhadas=8;

		System.out.println("N„o se preocupe, seu timesheet ser· lanÁado a tempo.");
	System.setProperty("webdriver.chrome.driver", driverPath); //agora entendi como vari·veis de ambiente poderiam se aplicar em cÛdigo do primeiro desafio
	ChromeOptions params=new ChromeOptions();
	params.addArguments("--Silent"); //n„o parece estar funcionando
	WebDriver driver=new ChromeDriver(params);
	driver.get("https://onecognizant.cognizant.com");
	if(driver.getTitle().equals("Cognizant Gateway")) foraDaIntranet();
//	else procedeIntranet();
	
	static void foraDaIntranet() {
		System.out.println("Imagino o quanto isto est· atrasado.");
			if(temIdESenha()==false) {
				System.out.println("N„o tenho seu ID nem sua senha. Irei billar seus projetos para mim");
			System.exit(1);
		}
		System.out.println("J· tenho seu id e sua senha, vamos l·");
		//n„o acredito que o eclipse apagou tudo, continuarei amanha
		//usernameCustom
		//PasswordCustom
		//Log-On
	}
    }
}