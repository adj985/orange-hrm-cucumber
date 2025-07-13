package base;

public class Locator {


    public static final String BUTTON = "//button[normalize-space(.)='%s']";
    public static final String LEFT_MENU_TAB= "//li[contains(@class, 'main-menu-item')]/a[normalize-space(text())='%s']";
    public static final String  TOP_MENU_TAB= "//li[contains(@class, 'nav-tab')]/a[normalize-space(text())='%s']";
    public static final String INPUT="//input[normalize-space(@name)='%s']";
    public static final String PAGE_TITLE="//span[contains(@class, 'topbar-header-breadcrumb')]//*[normalize-space(@text())='%s']";

    public static String parseLocator(String locator, String arg){

        return String.format(locator, arg);
    }
}
