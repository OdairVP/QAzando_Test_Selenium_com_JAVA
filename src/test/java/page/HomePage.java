package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("https://qazando.com.br/curso.html");
    }

    public void scrollDown() throws InterruptedException {
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
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
//        Assert.assertEquals("O cupom está errado!", "QAZANDO15OFF", texto_cupom);
        // esse Assert é para verificar se realmente estamos no site correto
    }

}
