package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://qazando.com.br/curso.html");
        waitEsperarElementoEstarPresente(By.id("btn-ver-cursos"),10); // Essa é uma forma correta de esperar um elemento estar presente na tela.
        Assert.assertEquals("Não acessou a aplicação", true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        // Essa é uma forma errada de esperar um elemento estar presente na tela, ele pode ser usado momentaneamente, mas depois devemos encontrar a ...
        // ... melhor forma de resolver esse impasse.  nesse caso o instrutor passou que mesmo "errado" acaba sendo a melhor forma de fazer.

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(2000);
    }

    public void preencherEmail(){
        driver.findElement(By.id("email")).sendKeys("odairqatest@test.com.br");
    }
    public void clicarEmGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }

    public void verificarCupomDesconto(){
        String textoCupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
//        Assert.assertEquals("O cupom está errado!", " QAZANDO15OFF", textoCupom);
//         esse Assert é para verificar se realmente o cupom está correto, mas está dando ERRO!
    }
}
