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
}
