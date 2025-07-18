package Ex_09_Switch;

import java.util.Scanner;

public class Lab072_Real_Switch_Automation {
    public static void main(String[] args) {

        //Web Automation
        //I will ask the user to give me the input from the browser which he wants to
        //Use to I will use the Automation in that browser

        //String browser = args[0];

        System.out.println("Enter the Browser : ");
        Scanner sc= new Scanner(System.in);
        String browser = sc.next();
        browser = browser.toLowerCase(); //lower(CHROME , Chrome, CHrome) == chrome

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("----------");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Starting the firefox");
                break;

            case "edge":
                System.out.println("Starting the edge");
                break;

            default:
                System.out.println("I have no idea which browser this");
                break;

        }
    }
}
