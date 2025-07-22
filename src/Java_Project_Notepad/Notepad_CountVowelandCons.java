package Java_Project_Notepad;

import java.util.Scanner;

public class Notepad_CountVowelandCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String num = sc.nextLine();

        num = num.toLowerCase();

        int vowel =0;
        int consonants =0;

        for(int i =0; i < num.length(); i++){
            char ch =num.charAt(i);

            if(ch >= 'a' && ch<= 'z'){
                if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){

                    vowel++;}
                else{

                    consonants++; }
            }
        }

        System.out.println("Vowel: " + vowel);
        System.out.println("Consonants: " + consonants);

    }
}
