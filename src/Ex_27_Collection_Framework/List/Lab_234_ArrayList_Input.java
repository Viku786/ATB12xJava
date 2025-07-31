package Ex_27_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_234_ArrayList_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List list = new ArrayList<>();

        List<String> names = new ArrayList<>();

        String continueInput = "Y";
        while (continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter the name: ");
            String name = sc.next();
            names.add(name);
            sc.nextLine();

            System.out.println("Do you want to enter another name Y/N : ");
            continueInput = sc.nextLine();
        }

        for (String name : names){
            System.out.println(name);
        }

        sc.close();
    }
}
