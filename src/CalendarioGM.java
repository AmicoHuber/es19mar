public class CalendarioGM {
    int giorno;
    String mese;
    boolean giornoLegale = false;
    boolean meseLegale = false;

    public void dataEsiste() {
        //"resetto" rispetto a chiamate precedenti
        giornoLegale = false;
        meseLegale = false;
        //numero di giorni valido
        if (giorno > 0 && giorno < 32) {
            giornoLegale = true;
        } 

        //lo rendo non case sensitive
        //con i giorni tra 0 e 31, li rendo falsi se incompatibili col mese
        switch (mese.toLowerCase()) {
            case "novembre":
            case "aprile":
            case "giugno":
            case "settembre":
                meseLegale = true;
                if (giorno == 31) {
                    giornoLegale = false;
                };
                break;
            case "febbraio":
                if (giorno > 28) {
                    giornoLegale = false;
                };
                break;
            case "gennaio":
            case "marzo":
            case "maggio":
            case "luglio":
            case "agosto":
            case "ottobre":
            case "dicembre":
                meseLegale = true;
                break;
            default:
                meseLegale = false;
        }

    }

    public void qualeModulo() {
        //verifico valori di giornoLegale e meseLegale
        dataEsiste();
        if (giornoLegale && meseLegale) {
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

        } else if (!giornoLegale && !meseLegale) {
            System.out.println("Operazione illegale, giorno e mese non validi");
            //se esco di qui, so che solo uno dei due risulta falso
        } else if (!giornoLegale) {
            System.out.println("Operazione illegale, giorno non valido");
        } else {
            System.out.println("Operazione illegale, mese non valido");
        }
    }
}
