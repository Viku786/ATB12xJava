package Ex_22_Enum;

public class Lab_190_Enum {
    public static void main(String[] args) {

        System.out.println(Locators.page_button.getLocator());
        System.out.println(Lab_191_APIURLS.katalon.getUrl());
    }
}

enum Locators{
    page_button("#btn"),
    page_input("#input1");

    private String Locator;

    Locators(String locator) {
        this.Locator = locator;
    }

     String getLocator() {
        return this.Locator;
    }

}