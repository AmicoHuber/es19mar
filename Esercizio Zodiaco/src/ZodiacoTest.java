public class ZodiacoTest {
    public static void main(String[] args) {
        Zodiaco mioZodiaco = new Zodiaco();

        mioZodiaco.giorno = 34;
        mioZodiaco.mese = "OtoBRE";
        mioZodiaco.qualeSegno();
        System.out.println();

        mioZodiaco.giorno = 33;
        mioZodiaco.mese = "Luglio";
        mioZodiaco.qualeSegno();
        System.out.println();

        mioZodiaco.giorno = 21;
        mioZodiaco.mese = "aprile";
        mioZodiaco.qualeSegno();
        System.out.println();

        mioZodiaco.giorno = 31;
        mioZodiaco.mese = "mAgGiO";
        mioZodiaco.qualeSegno();
        System.out.println();

        mioZodiaco.giorno = 14;
        mioZodiaco.mese = "Brumaio";
        mioZodiaco.qualeSegno();
    }
}
