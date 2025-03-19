public class Calendario {
    int giorno;
    String mese;
    boolean dataLegale = false;

    public void meseEsiste() {
        //numero di giorni valido?
        if (giorno < 1 || giorno > 31) {
            //per non lasciarla true da una chiamata precedente; v. successivi
            dataLegale = false;
        } else {
            //lo rendo non case sensitive
            switch (mese.toLowerCase()) {
                case "novembre":
                case "aprile":
                case "giugno":
                case "settembre":
                    if (giorno < 31) {
                        dataLegale = true;
                    } else {
                        dataLegale = false;
                    };
                    break;
                case "febbraio":
                    if (giorno < 29) {
                        dataLegale = true;
                    } else {
                        dataLegale = false;
                    };
                    break;
                case "gennaio":
                case "marzo":
                case "maggio":
                case "luglio":
                case "agosto":
                case "ottobre":
                case "dicembre":
                    dataLegale = true;
                    break;
                default:
                    dataLegale = false;
            }
        }
    }

    public void qualeModulo() {
        //invoco la funz in un punto in cui sono già certo della "legalità" del giorno
        meseEsiste();
        if (dataLegale) {
            switch (mese.toLowerCase()) {
                case "gennaio":
                    System.out.println("Corso non ancora avviato");
                    break;
                case "febbraio":
                    if (giorno < 13) {
                        System.out.println("Corso non ancora avviato");
                    } else {
                        System.out.println("Corso Web");
                    };
                    break;
                case "marzo":
                    if (giorno < 5) {
                        System.out.println("Corso web");
                    } else if (giorno == 5) {
                        System.out.println("Lezione DASA");
                    //non ammetto comunque giorni oltre il 31
                    } else if (giorno != 11) {
                        System.out.println("Corso Java");
                    //rimane fuori solo l'11
                    } else {
                        System.out.println("Lezione GitHub");
                    };
                    break;
                case "aprile":
                    if (giorno < 9) {
                        System.out.println("Corso Java");
                    } else if (giorno < 18) {
                        System.out.println("Corso Database");
                    } else if (giorno == 21 || giorno == 25) {
                        System.out.println("Giorno festivo");
                    } else if (giorno < 24) {
                        System.out.println("Corso JDBC");
                    } else {
                        System.out.println("Corso Spring");
                    };
                    break;
                case "maggio":
                    if (giorno == 1) {
                        System.out.println("Giorno festivo");
                    } else if (giorno < 9) {
                        System.out.println("Corso Spring");
                    } else if (giorno < 22) {
                        System.out.println("Project Work");
                    } else if (giorno < 31) {
                        System.out.println("Corso terminato");
                    } else {
                        System.out.println("Corso non presente");
                    };
                    break;
                default:
                    System.out.println("Corso non presente");
            }
        } else {
            System.out.println("Operazione illegale, data non valida");
        }
    }
}
