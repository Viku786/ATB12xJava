package Ex_22_Enum;

public class Lab_188_Enum_P2 {
    public static void main(String[] args) {

        System.out.println(URLS.Katalon);
        if (URLS.Katalon.equals("Katalon")){
            System.out.println("I wany to work on it");
        }
    }
}

enum URLS{
    google,RestAssured,Katalon,vwo
}