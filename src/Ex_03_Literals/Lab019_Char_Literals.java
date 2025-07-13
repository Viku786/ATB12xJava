package Ex_03_Literals;

public class Lab019_Char_Literals {
    public static void main(String[] args) {
        char c='a'; // A to Z, a to z, !@#$%^&*(
        //char c1="a"; (string - bunch of char

        char c2='B';
        char c3='@';
        char c4='_';
        char c5='%';
        char c6='*';
        char c7='#';
        char c8=' ';// blank space

        //Escape char
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("Vikash Singh");
        System.out.println("Vikash "+new_line+"Singh");
        System.out.println("Vikash "+tab_line+"Singh");
        System.out.println("Vikash"+back_space+"Singh");
        System.out.println("Vikash"+carriage_return+"Singh");
        System.out.println("Vikash\nSingh");




    }
}