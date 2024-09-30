import java.time.LocalDate;

public class ProdejceMrkve {

    private String jmeno;
    private String adresa;
    private LocalDate datumnarozeni;
    private int pocetsmluv;
    private double mnozstvimrkve;
    private String nazevmesta;
    private String SPZ;
    private double spotrebavozidla;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public LocalDate getDatumnarozeni() {
        return datumnarozeni;
    }

    public void setDatumnarozeni(LocalDate datumnarozeni) {
        this.datumnarozeni = datumnarozeni;
    }

    public int getPocetsmluv() {
        return pocetsmluv;
    }

    public void setPocetsmluv(int pocetsmluv) {
        this.pocetsmluv = pocetsmluv;
    }

    public double getMnozstvimrkve() {
        return mnozstvimrkve;
    }

    public void setMnozstvimrkve(double mnozstvimrkve) {
        this.mnozstvimrkve = mnozstvimrkve;
    }

    public String getNazevmesta() {
        return nazevmesta;
    }

    public void setNazevmesta(String nazevmesta) {
        this.nazevmesta = nazevmesta;
    }

    public String getSPZ() {
        return SPZ;
    }

    public void setSPZ(String SPZ) {
        this.SPZ = SPZ;
    }

    public double getSpotrebavozidla() {
        return spotrebavozidla;
    }

    public void setSpotrebavozidla(double spotrebavozidla) {
        this.spotrebavozidla = spotrebavozidla;
    }
}
