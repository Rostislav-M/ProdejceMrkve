import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        ProdejceMrkve prodejceMrkve1 = new ProdejceMrkve();
        ProdejceMrkve prodejceMrkve2 = new ProdejceMrkve();

        prodejceMrkve1.setJmeno("Honza Machaj");
        prodejceMrkve1.setAdresa("Otrava 8, Francouzska 6017");
        prodejceMrkve1.setDatumnarozeni(LocalDate.of(1991,3,19));
        prodejceMrkve1.setPocetsmluv(2);
        prodejceMrkve1.setMnozstvimrkve(5);
        prodejceMrkve1.setNazevmesta("Ostrava");
        prodejceMrkve1.setSPZ("RSA CAR04");
        prodejceMrkve1.setSpotrebavozidla(10);

        prodejceMrkve1.setJmeno("Karel Jedlinka");
        prodejceMrkve1.setAdresa("Praha 4, Budejovicka 1523/9a");
        prodejceMrkve2.setDatumnarozeni(LocalDate.of(1989,6,11));
        prodejceMrkve2.setPocetsmluv(7);
        prodejceMrkve2.setMnozstvimrkve(5);
        prodejceMrkve2.setNazevmesta("Praha");
        prodejceMrkve2.setSPZ("SMX 17819");
        prodejceMrkve2.setSpotrebavozidla(9);

        System.out.println("První prodejce: " + "\n" + "Jmeno: " + prodejceMrkve1.getJmeno() + "\n" + "Cela adresa: " + prodejceMrkve1.getAdresa() + "\n" + "Datum narození: " + prodejceMrkve1.getDatumnarozeni() + "\n" + "Pocet dosud sjednanych smluv: " +  prodejceMrkve1.getPocetsmluv() + "\n" + "Celkove mnozstvi prodane mrkve v tunach: " + prodejceMrkve1.getMnozstvimrkve() + "\n" + "Nazev mesta kde prodejce sidli : " + prodejceMrkve1.getNazevmesta()+ "\n" + "Registracni znacka vozidla: " + prodejceMrkve1.getSPZ() + "\n" + "Spotreba firemniho vozidla v litech na 100km: " + prodejceMrkve1.getSpotrebavozidla() +"\n");
        System.out.println("Druhy prodejce: " + "\n" + "Jmeno: " + prodejceMrkve1.getJmeno() + "\n" + "Cela adresa: " + prodejceMrkve1.getAdresa() + "\n" + "Datum narození: " + prodejceMrkve2.getDatumnarozeni() + "\n" + "Pocet dosud sjednanych smluv: " +  prodejceMrkve2.getPocetsmluv() + "\n" + "Celkove mnozstvi prodane mrkve v tunach: " + prodejceMrkve2.getMnozstvimrkve() + "\n" + "Nazev mesta kde prodejce sidli : " + prodejceMrkve2.getNazevmesta()+ "\n" + "Registracni znacka vozidla: " + prodejceMrkve2.getSPZ() + "\n" + "Spotreba firemniho vozidla v litech na 100km: " + prodejceMrkve2.getSpotrebavozidla());


    }
}