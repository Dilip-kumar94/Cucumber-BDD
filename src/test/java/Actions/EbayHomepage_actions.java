package Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EbayHomepage_actions {
    WebDriver dr;

    public EbayHomepage_actions(WebDriver dr){
        this.dr = dr;
    }

    public void action_click(WebElement we){
        we.click();
    }
    public String action_getText(WebElement we){
       return we.getText();
    }
    public void action_sendKeys(WebElement we, String text){
        we.sendKeys(text);
    }
    public void select_category_byVisibleText(WebElement we,String category){
        Select opt = new Select(we);
        opt.selectByVisibleText(category);
    }
    public boolean verify_product_text(List<WebElement> we,String Searchtext,int no_of_products){
        boolean result=false;
        int count = 1;
        for (WebElement webElement : we) {
            result = webElement.getText().toLowerCase().contains(Searchtext.toLowerCase());
            if(count > no_of_products){
                break;
            }
            count++;
        }
        return result;
    }
    
}
