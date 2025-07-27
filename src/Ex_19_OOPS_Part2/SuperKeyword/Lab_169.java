package Ex_19_OOPS_Part2.SuperKeyword;

public class Lab_169 {
}

class baseClass{
    private String browser;

    public baseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser , boolean isAdmin) {
        if (isAdmin){
            this.browser = browser;
        }
        else {
            System.out.println("Change browser not allowed , Not a Admin");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser!");
    }
    void openBrowser(String browserName){
        System.out.println("Open Browser -> "+browserName);
    }
    void closeBrowser(){
        System.out.println("Close Browser!");
    }

    void bhk3(){}
}

class TestCase1 extends baseClass{

    public void tc(){ }

    public TestCase1(String browser){
        super(browser);
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();
        super.bhk3();

        this.tc();
    }
}
