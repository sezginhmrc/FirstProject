package day54;

public class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening FireFox browser");
    }
    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url+" using FireFox Browser");
    }
    @Override
    public void maximize() {
        System.out.println("Maxmizing FireFox Browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Closing Firefox Browser");
    }
}
