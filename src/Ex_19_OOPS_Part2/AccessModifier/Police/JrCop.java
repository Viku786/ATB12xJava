package Ex_19_OOPS_Part2.AccessModifier.Police;

public class JrCop {
    public static void main(String[] args) {

        Cop jrcop = new Cop(10);
        // System.out.println(jrcop.gun);
        jrcop.canIShoot(); // It is private so, its not able to shoot.
        // For this I make protected to access the shoot method
    }
}
