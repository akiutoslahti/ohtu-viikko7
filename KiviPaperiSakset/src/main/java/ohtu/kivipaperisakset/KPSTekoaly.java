package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPS {

    private final Tekoaly tekoaly = new Tekoaly();

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
