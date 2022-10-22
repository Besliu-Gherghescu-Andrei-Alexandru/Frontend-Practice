public class Linie {
    public Punct a;
    public Punct b;

    public Linie(Punct a, Punct b) {
        this.a = a;
        this.b = b;
    }

    public double lungime() {
        return Math.sqrt((a.getX()-b.getX())*(a.getY()-b.getY()));
    }
}

class TestLinie {
    public static void main(String[] args) {
        Linie lin = new Linie(new Punct(5, 7), new Punct(8, 11));
        double lung = lin.lungime();
        System.out.println("lungime=" + lung);
    }
}
