package Task;

import java.util.Scanner;

public class Task05_19thMay_Triangle_classifier {
    public static void main(String[] args) {

        System.out.println("Enter the length of the triangle : ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first side : ");
        int side1 = sc.nextInt();
        System.out.println("Enter Second side : ");
        int side2 = sc.nextInt();
        System.out.println("Enter Third side : ");
        int side3 = sc.nextInt();

        if(side1 + side2 > side3 && side2 +side3 > side1 && side1 + side3 > side2) {

            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                System.out.println("The triangle is Isosceles triangle");
            } else {
                System.out.println("The triangle is Scalene triangle");
            }
        }
        else{
            System.out.println("The Input does not form the triangle");
        }

    }
}
