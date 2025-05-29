package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayAdvancedPage_Elements {
    private WebDriver dr;
    @FindBy(xpath = "//input[@id='_nkw']") public WebElement keyword;
    @FindBy(id = "s0-1-17-4[0]-7[1]-_in_kw") public WebElement keyword_options;
    @FindBy(xpath = "//input[@id='_ex_kw']") public WebElement exclude_keyword;
    @FindBy(id = "s0-1-17-4[0]-7[3]-_sacat") public WebElement category;
    @FindBy(xpath = "//div[@class='field adv-keywords__btn-help']/*[@class='btn btn--primary']")public WebElement searchButton;
    @FindBy(xpath = "//div[@class='adv-form__title large-section-title']") public WebElement titleheading;
    @FindBy(xpath = "//input[@id='s0-1-17-5[1]-[0]-LH_TitleDesc']") public WebElement checkbox_title;
    @FindBy(xpath = "//input[@id='s0-1-17-5[1]-[1]-LH_Complete']") public WebElement checkbox_complete;
    @FindBy(xpath = "//input[@id='s0-1-17-5[1]-[2]-LH_Sold]") public WebElement checkbox_sold;
    @FindBy(xpath = "//input[@id='s0-1-17-5[2]-[0]-']") public WebElement checkbox_price;
    @FindBy(xpath = "//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox']") public WebElement text_minprice;
    @FindBy(xpath = "//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox']") public WebElement text_maxprice;
    @FindBy(xpath = "//input[@id='s0-1-17-6[3]-[0]-LH_BO']") public WebElement radio_acceptoffers;
    @FindBy(xpath = "//input[@id='s0-1-17-6[3]-[1]-LH_Auction']") public WebElement radio_auction;
    @FindBy(xpath = "//input[@id='s0-1-17-6[3]-[2]-LH_BIN']") public WebElement radio_Buy_it_now;  
    @FindBy(xpath = "//input[@id='s0-1-17-6[3]-[3]-LH_CAds']") public WebElement radio_classified_ads;
    @FindBy(xpath = "//input[@id='s0-1-17-6[4]-[0]-LH_ItemCondition']") public WebElement radio_new;
    @FindBy(xpath = "//input[@id='s0-1-17-6[4]-[1]-LH_ItemCondition']") public WebElement radio_used;
    @FindBy(xpath = "//input[@id='s0-1-17-6[4]-[2]-LH_ItemCondition']") public WebElement radio_notspecified;
    @FindBy(linkText = "Find items") public WebElement a_finditems;
    @FindBy(linkText = "By seller") public WebElement a_byseller;
    @FindBy(linkText = "By item number") public WebElement a_by_item_number;
    @FindBy(linkText = "Items in stores")public WebElement a_by_item_stores;
    @FindBy(linkText = "Find stores")public WebElement a_by_find_stores;
}
