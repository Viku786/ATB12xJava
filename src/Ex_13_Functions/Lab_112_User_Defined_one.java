package Ex_13_Functions;

public class Lab_112_User_Defined_one {
    public static void main(String[] args) {

        int r1 = Sum_of_Two_Number(3,4);
        int r2 = Sum_of_Two_Number(45,67);
        System.out.println(r1);
        System.out.println(r2);

    }


    static int Sum_of_Two_Number(int first , int second){
        return first+second;
    }
}
