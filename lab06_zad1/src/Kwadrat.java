public class Kwadrat extends Prostokat{
    public Kwadrat(double wys) {
        super(wys, wys);
    }
    public Kwadrat() {
        super.wys =0;
        super.szer =0;
        super.kolor = "biały";
    }

    public void setWysokosc(double wys){
        this.wys = wys;
        this.szer = wys;
    }
    public Kwadrat(float wys, String kolor) {
        super(wys, wys, kolor);
    }

    String opis(){
        return (super.opis());
    }
}
