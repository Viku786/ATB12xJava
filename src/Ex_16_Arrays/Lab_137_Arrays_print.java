package Ex_16_Arrays;

public class Lab_137_Arrays_print {
    public static void main(String[] args) {

        int[] marks = {87,89,98,97,80,99};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("--------------");

        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("------ Enhanced For Loop -------");

        for(int mark : marks){
            System.out.println(mark);
        }

    }
}
