package Ex_19_OOPS_Part2.Encapsulation;

public class Lab_167 {
    public static void main(String[] args) {

        vwoLogin vl = new vwoLogin("admin","pass123");
        System.out.println(vl.password);
        vl.password = "456";
        System.out.println(vl.password);

        System.out.println("-----------------");

        GoodVwoLogin v2 = new GoodVwoLogin("admin","pwd123");
        //System.out.println(v2.password);
        System.out.println(v2.getUserName());
        System.out.println(v2.getPassword());

        v2.setUserName("Vikash");
        System.out.println(v2.getUserName());

        v2.setPassword("Admin@123", true);
        System.out.println(v2.getPassword());

    }
}

class vwoLogin{
    String userName;
    String password;

    public vwoLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

class GoodVwoLogin{
    private String userName;
    private String password;

    public GoodVwoLogin(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean isAdmin) {
        if (isAdmin){
            this.password = password;
        }
        else {
            System.out.println("You have not allowed to change the Password");
        }
    }
}