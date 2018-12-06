package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPS {

    @Override
    public String ekanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    @Override
    public String tokanSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }

}
