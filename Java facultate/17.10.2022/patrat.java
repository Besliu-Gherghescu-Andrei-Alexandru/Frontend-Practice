public class patrat{
    private int a;
    public patrat(int a){
        this.a=a;
    }
    public int get(){
        return a;
    }
    public void set(int a){
        this.a=a;
    }
    public void afisare(){
        System.out.println("latura="+a);
    }
    public int arie(){
        return a*a;
    }
    public double diagonala(){
        return a*Math.sqrt(2);
    }
    public int perimetru(){
        return 4*a;
    }


    
}