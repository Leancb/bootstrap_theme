package Step;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class codigo {

    private WebDriver navegador;
    private String arg1;

    @Dado("^que acessei a página de teste$")
    public void acessei_a_página_de_teste() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/leandrobrum/bootstrap_theme/chromedriver");
        navegador = new ChromeDriver();
        navegador.get("https://www.grocerycrud.com/demo/bootstrap_theme");
        navegador.manage().window().maximize();


    }

    @Dado("^que acessei a página do segundo teste$")
    public void acessei_a_página_de_teste2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/leandrobrum/bootstrap_theme/chromedriver");
        navegador = new ChromeDriver();
        navegador.get("https://api.github.com/");
        navegador.manage().window().maximize();


    }

    @Dado("^comparar os valores da url$")
    public void comparaValor(){
            String tmp = navegador.findElement(By.cssSelector("body > pre")).getText();
            String tmp2 = tmp.substring(16,39);
            String tmp3 = tmp.substring(66,131);
            System.out.println(tmp2);
        System.out.println(tmp3);

        Assert.assertTrue(tmp2.contains("Requires authentication"));
        Assert.assertTrue(tmp3.contains("https://developer.github.com/v3/users/#get-the-authenticated-user"));




    }


    @Dado("^obter o valor da url$")
    public void obter_valor_url() throws InterruptedException {
        String tmp = navegador.findElement(By.cssSelector("body > pre")).getText();
        String tmp2 = tmp.substring(25, 52);
        navegador.get(tmp2);

    }


    @Dado("^mudei o valor da combo Select version$")
    public void mudei_o_valor_da_combo_Select_version() throws InterruptedException {
        navegador.findElement(By.id("switch-version-select")).click();
        navegador.findElement(By.xpath("//*[@id=\"switch-version-select\"]/option[2]")).click();
    }

    @Dado("^Cliquei no botão Add Customer$")
    public void cliquei_no_botão_Add_Customer() throws InterruptedException {
    navegador.findElement(By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a")).click();
    }

    @Dado("^Preencho o campo name (.*)$")
    public void preencho_o_campo_name_Teste_Stefanini(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-customerName")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo last name (.*)$")
    public void preencho_o_campo_last_name_Teste(String arg1) throws InterruptedException {

        navegador.findElement(By.id("field-contactLastName")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo contactfirstname (.*)$")
    public void preencho_o_campo_contactfirstname_Leandro(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-contactFirstName")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo phone (.*)$")
    public void preencho_o_campo_phone(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-phone")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo address1 (.*)$")
    public void preencho_o_campo_address_Av_Bento(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-addressLine1")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo adrress2 (.*)$")
    public void preencho_o_campo_adrress_Teste_address(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-addressLine2")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo city (.*)$")
    public void preencho_o_campo_city_Porto_Alegre(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-city")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo state (.*)$")
    public void preencho_o_campo_state_RS(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-state")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo postal code (.*)$")
    public void preencho_o_campo_postal_code(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-postalCode")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo country (.*)$")
    public void preencho_o_campo_country_Brasil(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-country")).sendKeys(arg1);
    }

    @Dado("^Preencho o campo employeer (.*)$")
    public void preencho_o_campo_employeer_Fixter(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field_salesRepEmployeeNumber_chosen")).click();
        navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > div > input[type=text]")).sendKeys(arg1);
        navegador.findElement(By.cssSelector("#field_salesRepEmployeeNumber_chosen > div > ul > li")).click();

    }

    @Dado("^Preencho o campo creditlimit (.*)$")
    public void preencho_o_campo_creditlimit_Fixter(String arg1) throws InterruptedException {
        navegador.findElement(By.id("field-creditLimit")).sendKeys(arg1);
    }

    @Quando("^Clico no botão Save$")
    public void clico_no_botão_Save() throws InterruptedException {
        navegador.findElement(By.id("form-button-save")).click();
    }

    @Entao("^fecha a tela$")
    public void fechatela() throws InterruptedException {
        navegador.quit();
    }


    @Entao("^valido a mensagem e fecho o browser$")
    public void valido_a_mensagem_e_fecho_o_browser() throws InterruptedException {
/*
        WebDriver driver = navegador;

        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("report-success")));
*/
        Thread.sleep(2500);

        String tmp = navegador.findElement(By.id("report-success")).getText();

        System.out.println(tmp);

        Assert.assertTrue(tmp.contains("Your data has been successfully stored into the database. Edit Customer or Go back to list"));

        navegador.quit();

    }




}
