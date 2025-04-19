import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
    public static void main(String[] args){
//        Invoking browser. Classes-ChromeDriver, Firefox etc -> implements methods of WebDriver interface and have their own methods
//        ChromeDriver driver = new ChromeDriver(); //This can call methods that are not in WebDriver and present in chromeDriver, which will fail if we want to use Firefox or other browsers
        //Interface
        WebDriver driver = new ChromeDriver(); //This line makes sure that only the methods present in the WebDriver interface can be used
        driver.close();
    }
}
