public class Zodiaco {
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
                //stavolta contempliamo il 29 febbraio
                if (giorno > 29) {
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

    public void qualeSegno() {
        //verifico valori di giornoLegale e meseLegale
        dataEsiste();
        if (giornoLegale && meseLegale) {
            switch (mese.toLowerCase()) {
                case "gennaio":
                    if (giorno < 20) {
                        System.out.println("Capricorno");
                    } else {
                        System.out.println("Acquario");
                    }
                    break;
                case "febbraio":
                    if (giorno < 20) {
                        System.out.println("Acquario");
                    } else {
                        System.out.println("Pesci");
                    };
                    break;
                case "marzo":
                    if (giorno < 21) {
                        System.out.println("Pesci");
                    } else {
                        System.out.println("Ariete");
                    };
                    break;
                case "aprile":
                    if (giorno < 20) {
                        System.out.println("Ariete");
                        } else {
                        System.out.println("Toro");
                    };
                    break;
                case "maggio":
                    if (giorno < 21) {
                        System.out.println("Toro");
                    } else {
                        System.out.println("Gemelli");
                    };
                    break;
                case "giugno":
                    if (giorno < 21) {
                        System.out.println("Gemelli");
                    } else {
                        System.out.println("Cancro");
                    };
                    break;
                case "luglio":
                    if (giorno < 22) {
                        System.out.println("Cancro");
                    } else {
                        System.out.println("Leone");
                    };
                    break;
                case "agosto":
                    if (giorno < 24) {
                        System.out.println("Leone");
                    } else {
                        System.out.println("Vergine");
                    };
                    break;
                case "settembre":
                    if (giorno < 23) {
                        System.out.println("Vergine");
                    } else {
                        System.out.println("Bilancia");
                    };
                    break;
                case "ottobre":
                    if (giorno < 24) {
                        System.out.println("Bilancia");
                    } else {
                        System.out.println("Scorpione");
                    };
                    break;
                case "novembre":
                    if (giorno < 23) {
                        System.out.println("Scorpione");
                    } else {
                        System.out.println("Sagittario");
                    };
                    break;
                case "dicembre":
                    if (giorno < 22) {
                        System.out.println("Sagittario");
                    } else {
                        System.out.println("Capricorno");
                    };
                    break;
                default:
                    System.out.println("Errore");
            }
        } else if (!giornoLegale && !meseLegale) {
            System.out.println("Giorno e mese non validi");
            //se esco di qui, so che solo uno dei due risulta falso
        } else if (!giornoLegale) {
            System.out.println("Giorno non valido");
        } else {
            System.out.println("Mese non valido");
        }
    }
}
