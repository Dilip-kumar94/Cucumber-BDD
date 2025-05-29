package Elements;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class EbayHompage_Elements {
    private WebDriver dr;
    @FindBy(className="gh-logo") public WebElement ebayLogo;
    @FindBy(linkText="Advanced")  public WebElement advancedLink;
    @FindBy(xpath = "//div[@id='gh-ac-wrap']/input") public WebElement searchBar;
    @FindBy(className="gh-search-categories") public WebElement selectCategory;
    @FindBy(id="gh-search-btn") public WebElement searchButton;
    @FindBy(xpath="//h1[@class='srp-controls__count-heading']/span[2]") public WebElement itemCount;
    @FindBy(xpath = "//div[@class='srp-river-results clearfix'] //div[@class='s-item__title']/span") public List<WebElement> listedProducts;
    @FindBy(className="carousel__playback")public WebElement playCarouselButton;
    @FindBy(xpath ="//div[@Class='vl-banner-multi-cta__main-container']") public List<WebElement> carouselList;
    @FindBy(id="s0-1-0-53-1-2-5-15-0[0]-2-@match-media-0-@ebay-carousel-next") public WebElement nextCarouselButton;
    @FindBy(xpath = "//div[@Class='vl-banner-multi-cta__main-container']/a") public List<WebElement> links_inside_Carousel;
    @FindBy(xpath = "//section[@class='brw-region brw-region--top']/h1") public WebElement result_link;
    public String URL = "http://www.ebay.com";
    public String Expected_AdvancedLink_Title="Advanced Search | eBay";
    public String Expected_HomePage_Title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
    
    public EbayHompage_Elements(WebDriver dr){
        System.out.println("Elements invoked");
        this.dr = dr;
        PageFactory.initElements(dr,this);
    }
}
