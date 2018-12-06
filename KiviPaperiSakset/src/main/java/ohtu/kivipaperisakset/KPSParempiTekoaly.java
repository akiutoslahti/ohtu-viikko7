package ohtu.kivipaperisakset;

public class KPSParempiTekoaly extends KPS {

    private TekoalyParannettu tekoaly = new TekoalyParannettu(20);

    @Override
    public String ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    @Override
    public String tokanSiirto() {
        String tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        return tokanSiirto;
    }

}
