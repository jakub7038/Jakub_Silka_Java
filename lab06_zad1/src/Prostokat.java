
class Prostokat extends Figura{
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}

    double getPowierzchnia() {
        return (szer * wys);
    }

	void przesun(float x, float y){
		super.punkt.setX(super.punkt.getX()+x);
		super.punkt.setY(super.punkt.getY()+y);
	}
    
    Prostokat(float wys,float szer, String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
	}
	Prostokat(){
		this.wys = 0;
		this.szer = 0;
		super.kolor = "kolor";
	}

	String opis(){
		return ("powierzchnia: "+getPowierzchnia()+" "+getClass());
	}
}