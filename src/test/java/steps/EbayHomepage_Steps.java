package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;

import Actions.EbayHomepage_actions;
import Actions.common_actions;
import Elements.EbayHompage_Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHomepage_Steps {

    private WebDriver dr;  
    common_actions commonActions;
    EbayHomepage_actions HomeActions;
    EbayHompage_Elements HomeElements;


    public EbayHomepage_Steps(Common_steps cs){
        this.dr = cs.getDriver();
        System.out.println(dr.getClass());
        commonActions = new common_actions(cs);
        HomeActions = new EbayHomepage_actions(this.dr);
        System.out.println((dr));
        HomeElements = new EbayHompage_Elements(this.dr);
    }

    @Given("I am in ebay homepage")
    public void i_am_in_ebay_homepage() {
        commonActions.navigatetoURL(HomeElements.URL);
    }
    @When("I click the advanced search link")
    public void i_click_the_advanced_search_link() {
        HomeActions.action_click(HomeElements.advancedLink);
    }
    @Then("I navigated to the advanced search page")
    public void i_navigated_to_the_advanced_search_page() {
        if (!(commonActions.currentPageTitle().equals(HomeElements.Expected_AdvancedLink_Title))){
            fail("Title is incorrect");
        }
    }
    @When("I click the EBay Logo")
    public void i_click_the_e_bay_logo() {
        HomeActions.action_click(HomeElements.ebayLogo);
    }
    @Then("I navigated to the Ebay Homepage")
    public void i_navigated_to_the_ebay_homepage() {
        if (!(commonActions.currentPageTitle().equals(HomeElements.Expected_HomePage_Title))){
            fail("Title is incorrect");
        }
    }
    @When("I enter the {string}")
    public void i_enter_the(String product) {
        HomeActions.action_sendKeys(HomeElements.searchBar, product);
    }
    @When("I select the {string}")
    public void i_select_the(String category) {
        HomeActions.select_category_byVisibleText(HomeElements.selectCategory, category);
    }
    @When("click the search button")
    public void click_the_search_button() {
        HomeActions.action_click(HomeElements.searchButton);
    }
    @Then("I get the relevant {string} for the search")
    public void i_get_the_relevant_for_the_search(String product) {
        if(!(HomeActions.action_getText(HomeElements.itemCount).toLowerCase().endsWith(product.toLowerCase()))){
            fail("Product not matching");
        }
    }
    @Then("have multiple {string} listed")
    public void have_multiple_listed(String product) {
        if (!HomeActions.verify_product_text(HomeElements.listedProducts,product, 5)){
            fail("In-correct products listed");
        }
    }
}
