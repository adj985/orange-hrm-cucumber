package base;

public class Locators {

    public static final String BUTTON = "//button[normalize-space(.)='%s']";
    public static final String LEFT_MENU_TAB = "//li[contains(@class, 'main-menu-item')]/a[normalize-space(.)='%s']";
    public static final String  TOP_MENU_TAB = "//li[contains(@class, 'nav-tab')]/a[normalize-space(text())='%s']";
    public static final String INPUT = "//input[normalize-space(@name)='%s']";
    public static final String INPUT_BY_LABEL = "//label[text()='%s']/../following-sibling::div//input";
    public static final String RESULT_ROW = "//div[@class='oxd-table-body']//div[contains(@class,'oxd-table-row')]";

}
