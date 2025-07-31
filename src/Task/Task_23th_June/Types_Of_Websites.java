package Task.Task_23th_June;

import java.util.Scanner;

public class Types_Of_Websites {
    public static void main(String[] args) {

        /* 24)  Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
           :- take the Site URL input from the user
           Example Scenarios
            Input: example.com
            Output: The website type is: Commercial website

            Input: example.org
            Output: The website type is: Non-profit organization

            Input: example.edu
            Output: The website type is: Educational institution
         */

        Scanner sc = new Scanner((System.in));

        System.out.println("Please Enter website URL (e.g., example.com): ");
        String url = sc.nextLine().toLowerCase();

        if (url.endsWith(".com")){
            System.out.println("The website type is: Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        }else if (url.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (url.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (url.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        } else {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
