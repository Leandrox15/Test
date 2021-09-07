import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
        public static void main(String[] args) throws InterruptedException  {
              System.setProperty("webdriver.chrome.driver","E:\\InstallationProject\\ProjectTest\\src\\main\\resources\\Drivers\\chromedriver.exe");

              //Initialize Browser
                WebDriver driver = new ChromeDriver();

              //Open Windows
                driver.get("https://parabank.parasoft.com/parabank/index.htm");

              //Credenciasles
                String username = "john";
                String password = "demo";
                String monto    = "100";


              //Localizar ID
            //WebElement usernameInput = driver.findElement(By.id("user-name"));
            //WebElement passwordInput = driver.findElement(By.id("password"));
            //WebElement loginbtn = driver.findElement(By.id("login-button"));


            //Localizar className
            //WebElement loginbtn1 = driver.findElement(By.className("submit-button"));


            //Localizar Name
            //WebElement loginbtn1 = driver.findElement(By.name("login-button"));
            driver.findElement(By.name("username")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();

            //localizar Xpath
            //WebElement producto =driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));

            //Acciones Login
            //sendKeys(username);
            //Thread.sleep(2000);
            //passwordInput.sendKeys(password);
            //Thread.sleep(2000);
            //loginbtn.click();
            //Thread.sleep(1000);

            //Transfer Funds
            driver.findElement(By.xpath("//*[@id=\'leftPanel\']/ul/li[3]/a")).click();
            //Transfer.click();

            driver.findElement(By.xpath("//*[@id=\'fromAccountId\']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]/option[7]")).click();
            //driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click();
            //driver.findElement(By.xpath("//*[@id=\'leftPanel\']/ul/li[3]/a")).click();

            driver.findElement(By.xpath("//*[@id=\'fromAccountId\']")).click();
            //WebElement Fromaccout3 = driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]/option[1]"));
            Thread.sleep(1000);
            driver.findElement(By.id("amount")).sendKeys(monto);

            driver.findElement(By.xpath("//*[@id=\'toAccountId\']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"toAccountId\"]/option[11]")).click();


            driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/form/div[2]/input")).click();

            //WebElement Transferbtn = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input"));


        }


}
