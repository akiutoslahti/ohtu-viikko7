package ohtu.kivipaperisakset;

public class KPSRakentaja {
    
    public static KPS luoKaksinPeli() {
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPS luoYksinPeli() {
        return new KPSTekoaly();
    }
    
    public static KPS luoPahaYksinPeli() {
        return new KPSParempiTekoaly();
    }
    
}
