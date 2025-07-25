package Ex_16_Arrays;

public class Lab_136_Arrays_Part2 {
    public static void main(String[] args) {

        String[] names = {"Vikash","Viku","Singh"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] name_atb12x = new String[3];
        name_atb12x[0] = "Vikash";
        name_atb12x[1] = "Vicky";
        name_atb12x[2] = "Viku";

        System.out.println(name_atb12x.length);
        System.out.println(name_atb12x[0]);
        System.out.println(name_atb12x[1]);
        System.out.println(name_atb12x[2]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;

    }
}
