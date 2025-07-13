package base;

public class Locator {

    public static String parseLocator(String locator, String arg){
        return String.format(locator, arg);
    }
}
