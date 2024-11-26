package test_022_generics_01;

public class Fahrzeug<F extends Buerger, B> {

    B beiFahrer;
    F fahrer;

    public void setBeiFahrer(B beiFahrer) {
        this.beiFahrer = beiFahrer;
    }
    
    public B getBeiFahrer() {
        return beiFahrer;
    }
    
    public void setFahrer(F fahrer) {
        this.fahrer = fahrer;
    }
    
    public void mitnehmen(Fahrzeug<?, ? extends B> f) {
        beiFahrer = f.getBeiFahrer();
    }
    
    public void uebergeben(Fahrzeug<?, ? super B> f) {
        f.setBeiFahrer(beiFahrer);
    }
}
