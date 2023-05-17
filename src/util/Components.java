package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

public class Components {
    private WebDriver driver;


    public void inicializa() {
        String chromedriver = System.getProperty("user.dir")
                + "/driver/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void acessarCampoDeTreinamento() {
        driver.get("file:///" + System.getProperty("user.dir") + "/html/componentes.html");
    }

    public void acessarGoogle() {
        driver.get("https://www.google.com.br/");
    }

    public void pesquisarGoogle() {
        driver.findElement(By.name("q")).sendKeys("Manoel gomes");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    public void resultadoPesquisa() {
        driver.findElement(By.id("res")).isDisplayed();
        Assert.assertTrue(driver.getTitle().contains("Manoel"));

    }

    public void clicaImg() {
        WebElement imagensLink = driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a/span"));
        imagensLink.click();


    }

    public void escreverBatatinha() {
        driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");

    }

}