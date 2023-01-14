import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","");
        WebDriver d=new ChromeDriver();

        d.navigate().to("https://www.google.com/?hl=ar");

    }
}
