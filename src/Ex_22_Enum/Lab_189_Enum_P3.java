package Ex_22_Enum;

public class Lab_189_Enum_P3 {
    public static void main(String[] args) {

        System.out.println(colors.Red.getHexcode());
    }
}

enum colors{
    Red("#FF0000"),
    Green("#008000"),
    Blue("#0000FF"),
    Yellow("#FFFF00");

    private String hexcode;

    colors(String hexcode){
        this.hexcode=hexcode;
    }
    String getHexcode() {
        return this.hexcode;
    }
}