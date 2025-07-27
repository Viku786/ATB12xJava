package Ex_19_OOPS_Part2.AccessModifier.Police;

public class Cop {

    private int gun;
    String idCard;

    public Cop (int gun){
        this.gun=gun;
    }

   protected void canIShoot(){
        System.out.println("Yes, You can shoot");
    }
}
