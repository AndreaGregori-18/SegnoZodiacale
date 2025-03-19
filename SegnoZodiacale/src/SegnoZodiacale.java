public class SegnoZodiacale {
    
    public int giorno;
    public String mese;

    public void mesi() {

        switch (mese) {
            case "gennaio", "marzo", "maggio", "luglio", "agosto", "ottobre", "dicembre":
                if(giorno < 1 || giorno > 31) {
                    System.out.println("Giorno inserito non valido");
                }
                break;

            case "febbraio":
                if(giorno < 1 || giorno > 28) {
                    System.out.println("Giorno inserito non valido");   
                }
                break;

            case "aprile", "giugno", "settembre", "novembre":
                 if (giorno < 1 || giorno > 30) {
                    System.out.println("Giorno inserito non valido");
                }
                break;

            default:
                System.out.println("Mese o giorno inserito non valido");
        }

    }

    public void segniZodiacali() {

        if(mese.equals("dicembre") && giorno >= 22 && giorno <= 31 || mese.equals("gennaio") && giorno >= 1 && giorno <= 19) {
            System.out.println("Capricorno");

        } else if(mese.equals("gennaio") && giorno >= 20 && giorno <= 31 || mese.equals("febbraio") && giorno >= 1 && giorno <= 18) {
            System.out.println("Acquario");

        } else if(mese.equals("febbraio") && giorno >= 19 && giorno <= 28 || mese.equals("marzo") && giorno >= 1 && giorno <= 20) {
            System.out.println("Pesci");

        } else if(mese.equals("marzo") && giorno >= 21 && giorno <= 31 || mese.equals("aprile") && giorno >= 1 && giorno <= 19) {
            System.out.println("Ariete");

        } else if(mese.equals("aprile") && giorno >= 20 && giorno <= 30 || mese.equals("maggio") && giorno >= 1 && giorno <= 20) {
            System.out.println("Toro");

        } else if(mese.equals("maggio") && giorno >= 21 && giorno <= 31 || mese.equals("giugno") && giorno >= 1 && giorno <= 20) {
            System.out.println("Gemelli");

        } else if(mese.equals("giugno") && giorno >= 21 && giorno <= 30 || mese.equals("luglio") && giorno >= 1 && giorno <= 22) {
            System.out.println("Cancro");

        } else if(mese.equals("luglio") && giorno >= 23 && giorno <= 31 || mese.equals("agosto") && giorno >= 1 && giorno <= 22) {
            System.out.println("Leone");

        } else if(mese.equals("agosto") && giorno >= 23 && giorno <= 31 || mese.equals("settembre") && giorno >= 1 && giorno <= 22) {
            System.out.println("Vergine");

        } else if(mese.equals("settembre") && giorno >= 23 && giorno <= 30 || mese.equals("ottobre") && giorno >= 1 && giorno <= 22) {
            System.out.println("Bilancia");

        } else if(mese.equals("ottobre") && giorno >= 23 && giorno <= 31 || mese.equals("novembre") && giorno >= 1 && giorno <= 21) {
            System.out.println("Scorpione");

        } else if(mese.equals("novembre") && giorno >= 22 && giorno <= 30 || mese.equals("dicembre") && giorno >= 1 && giorno <= 21) {
            System.out.println("Sagittario");

        }
    }

}
