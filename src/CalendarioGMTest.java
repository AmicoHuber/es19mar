public class CalendarioGMTest {
    public static void main(String[] args) {
        CalendarioGM mioCalendario = new CalendarioGM();

        mioCalendario.giorno = 34;
        mioCalendario.mese = "OtoBRE";
        mioCalendario.qualeModulo();
        System.out.println();

        mioCalendario.giorno = 33;
        mioCalendario.mese = "Luglio";
        mioCalendario.qualeModulo();
        System.out.println();

        mioCalendario.giorno = 21;
        mioCalendario.mese = "aprile";
        mioCalendario.qualeModulo();
        System.out.println();

        mioCalendario.giorno = 31;
        mioCalendario.mese = "mAgGiO";
        mioCalendario.qualeModulo();
        System.out.println();

        mioCalendario.giorno = 14;
        mioCalendario.mese = "Brumaio";
        mioCalendario.qualeModulo();
    }
}
