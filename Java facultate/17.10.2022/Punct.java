public class Punct {
    private int x;
    private int y;
    public Punct(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){return x;}
    public void setX(int x){this.x=x;};
    public int getY(){return y;}
    public void setY(int y){this.y=y;};
    public void afisare(){
        System.out.println("x="+x+"y="+y);
    }
    public double distanta_0(){
        double d=Math.sqrt(x*x+y*y);
        return d;
    }
    double distanta (Punct p){
//(thix.x,this.y)-----(p.x,p.y)
double d=Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
return d;
    }
}
