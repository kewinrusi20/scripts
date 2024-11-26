package test_022_generics_01;

public class Gotham {

    public static void main(String[] args) {
        var robin = new Robin();
        var batman = new Batman();
        var alfred = new Alfred();
        
        var pepper = new Pepper();
        var ironman = new Ironman();
        var dobermann = new Dobermann();
        
        var batmobil = new Batmobil();
        batmobil.setFahrer(batman);
        batmobil.setBeiFahrer(dobermann);

        var anzug = new Anzug();
        anzug.setFahrer(ironman);
        anzug.setBeiFahrer(robin);
        
        var strassenbahn = new Fahrzeug<Buerger, Object[]>();
        strassenbahn.setFahrer(pepper);
        strassenbahn.setBeiFahrer(new Object[] { batman, ironman });
        
        var hundetransport = new Fahrzeug<Batman, Dobermann>();
        var dobi1 = new Dobermann();
        hundetransport.setFahrer(batman);
        hundetransport.setBeiFahrer(dobi1);
        
        var suhemop = new Fahrzeug<Superheld, Superheld>();
        suhemop.setFahrer(batman);
        suhemop.setBeiFahrer(ironman);
        
        var pingumobil = new Fahrzeug<Buerger, Object>();
        pingumobil.setFahrer(pepper);
        pingumobil.setBeiFahrer(dobermann);
        
        pingumobil.mitnehmen(suhemop);
        
    }
}
