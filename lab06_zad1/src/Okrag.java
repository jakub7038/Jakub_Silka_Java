public class Okrag extends Figura{
    double r;

    double getPowierzchnia(){
        return this.r*Math.PI;
    }

    double getSrednica(){
        return this.r*2;
    }

    public void setPromien(double r){
        this.r = r;
    }

    double getPromien(){
        return r;
    }

    boolean wSrodku(Punkt p1){
        if(r*r>Math.pow((p1.getX()-super.punkt.getX()),2)-Math.pow((p1.getY()-super.punkt.getY()),2))return false;
        return true;
    }

    Okrag (){
        r=0;
        punkt = new Punkt(0,0);
    };
    Okrag(double r, Punkt punkt){
        this.r = r;
        super.punkt = punkt;
    }
}
