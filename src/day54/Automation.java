package day54;

public class Automation {

    public static void main(String[] args) {

        WebDriver c1 = new ChromeDriver();
        c1.openBrowser();
        c1.navigateTo("wwww.cyberteckschool.com");
        c1.maximize();
        c1.closeBrowser();

        // reassigned c1 beacuse c1 is Webdriver (Super class)
        // ChromeDriver and FireFox driver is (Sub classes
        // No inhertiance no Polymorphisim !

        c1 = new FirefoxDriver();
        c1.openBrowser();
        c1.navigateTo("www.selenium.com");
        c1.maximize();
        c1.closeBrowser();








    }
}

// Explain w1 objecT !! interview question
//referring your sub type to super type
