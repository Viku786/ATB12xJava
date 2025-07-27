package Ex_19_OOPS_Part2.Poly.Method_OverRiding;

public class RealExample {
    public static void main(String[] args) {
        TC_Chrome t = new TC_Chrome();
        t.openBrowser();
    }
}

class CommonToAllTC{
    void openBrowser(){
        System.out.println("Open the browser");
    }
}

class TC_Chrome extends CommonToAllTC{
    @Override
    void openBrowser() {
        System.out.println("Starting the chrome");
    }
}