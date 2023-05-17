package util;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class ComponentsComponentesStep {
    private WebDriver driver;

    public void inicializa() {
        String chromedriver = System.getProperty("user.dir")
                + "/driver/chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromedriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void encerraBrowser() {
        driver.close();
    }

    public void acessarCampoDeTreinamento() {
        driver.get("file:///" + System.getProperty("user.dir") + "/html/componentes.html");
    }

    private WebElement getTextField() {
        return driver.findElement(By.id("elementosForm:nome"));
    }

    private WebElement getTextArea() {
        return driver.findElement(By.id("elementosForm:sugestoes"));
    }

    private WebElement getRadioButton() {
        return driver.findElement(By.id("elementosForm:sexo:0"));
    }

    private WebElement getCheckbox() {
        return driver.findElement(By.id("elementosForm:comidaFavorita:2"));
    }

    public void testTextField() {
        String textToTest = "Batatinha";
        WebElement inputNome = getTextField();
        inputNome.sendKeys(textToTest);
    }

    public void validateTextField() {
        String valueNome = getTextField().getAttribute("value");
        Assert.assertEquals("Batatinha", valueNome);
    }

    public void testTextArea() {
        String textToTest = "Batatinha\nBatatinha";
        WebElement textAreaSugestoes = getTextArea();
        textAreaSugestoes.sendKeys(textToTest);
    }

    public void validateTextArea() {
        String valueSugestao = getTextArea().getAttribute("value");
        Assert.assertEquals("Batatinha\nBatatinha", valueSugestao);
    }

    public void testRadioButton() {
        WebElement radioSexo = getRadioButton();
        radioSexo.click();
    }

    public void validateRadioButton() {
        WebElement radioSexo = getRadioButton();
        Assert.assertTrue(radioSexo.isSelected());
    }

    public void testCheckbox() {
        WebElement checkboxComidaFavorita = getCheckbox();
        checkboxComidaFavorita.click();
    }

    public void validateChckbox() {
        WebElement checkboxComidaFavorita = getCheckbox();
        Assert.assertTrue(checkboxComidaFavorita.isSelected());
    }
}