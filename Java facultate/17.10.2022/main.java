import java.util.Scanner;

public class main {
    public static void main(String[] args){
        patrat p = new patrat(2);
        int rezultat = p.arie();
        System.out.println("aria=" + rezultat);
        System.out.println("latura=");
        try (Scanner sc = new Scanner(System.in)) {
            int nr = sc.nextInt();
            patrat p2 = new patrat(nr);
            rezultat = p2.arie();
            System.out.println("aria2=" + rezultat);
            double d = p2.diagonala();
            System.out.println("diagonala=" + d);
            System.out.println("perimetru="+rezultat);
        }

    }

}