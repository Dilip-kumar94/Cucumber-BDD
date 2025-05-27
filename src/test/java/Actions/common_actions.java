package Actions;

import org.openqa.selenium.WebDriver;

import steps.Common_steps;

public class common_actions {

    WebDriver dr;
    public common_actions(Common_steps cs){
        System.out.println("Common Actions invoked");
        this.dr = cs.getDriver();
    }

    public String getURLValue(){
        return dr.getCurrentUrl();
    }

    public void navigatetoURL(String url){
        dr.get(url);
    }

    public String currentPageTitle(){
        return dr.getTitle();
    }

}
