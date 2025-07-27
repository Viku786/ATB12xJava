package Ex_19_OOPS_Part2.AccessModifier.Criminal;

import Ex_19_OOPS_Part2.AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(10);
        //thief.canIShoot(); -> After making private it not get able to access
        //After making protected still not able to access because it works within package
        //System.out.println(thief.gun); -> -> After making private it not get able to access
    }
}
