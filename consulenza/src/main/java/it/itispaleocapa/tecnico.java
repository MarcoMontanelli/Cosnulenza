package it.itispaleocapa;
public class tecnico extends impiegato{
    private String specializzazione;
    private boolean ie;
    public tecnico(int c, String co, String no, boolean dv, String sp) {
        super(c, co, no);
        this.specializzazione=sp;
        this.ie=dv;
    }

    public String getSpecializzazione() {
        return this.specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public boolean isIe() {
        return this.ie;
    }

    public boolean getIe() {
        return this.ie;
    }

    public void setIe(boolean ie) {
        this.ie = ie;
    }

    
}
