public class Punkt {
    private double x,y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj(){
        this.x=0;
        this.y=0;
    }
    public void opis(){
        System.out.println("x: "+x+" y: "+y);
    }
    public Punkt(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Punkt(){
        this.x=0;
        this.y=0;
    }
}
