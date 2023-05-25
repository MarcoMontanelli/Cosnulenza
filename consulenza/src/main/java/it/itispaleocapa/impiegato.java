package it.itispaleocapa;
import java.time.LocalDate;

public abstract class impiegato {
    private int codice;
    private String cognome;
    private String nome;
    private LocalDate assunzione;

    public impiegato (int c, String co, String no){
        this.assunzione= LocalDate.now();
        this.codice=c;
        this.cognome=co;
        this.nome=no;
    }

    public int getCodice() {
        return this.codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAssunzione() {
        return this.assunzione;
    }

    public void setAssunzione(LocalDate assunzione) {
        this.assunzione = assunzione;
    }
    

}
