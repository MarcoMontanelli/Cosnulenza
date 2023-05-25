package it.itispaleocapa;
import java.time.LocalDate;
import java.util.ArrayList;

public class progetto {
    private ArrayList<dirigente> dir;
    private ArrayList<funzionario> fun;
    private ArrayList<tecnico> tec ;
    private int costoOrTot;

    public progetto(ArrayList<dirigente> dir, ArrayList<funzionario> fun, ArrayList<tecnico> tec, int costoOrTot) {
        this.dir = dir;
        this.fun = fun;
        this.tec = tec;
        this.costoOrTot = costoOrTot;
    }

    public ArrayList<dirigente> getDir() {
        return this.dir;
    }

    public void setDir(ArrayList<dirigente> dir) {
        this.dir = dir;
    }

    public ArrayList<funzionario> getFun() {
        return this.fun;
    }

    public void setFun(ArrayList<funzionario> fun) {
        this.fun = fun;
    }

    public ArrayList<tecnico> getTec() {
        return this.tec;
    }

    public void setTec(ArrayList<tecnico> tec) {
        this.tec = tec;
    }

    public int getCostoTot() {
        return this.costoOrTot;
    }

    public void setCostoTot(int costoOrTot) {
        this.costoOrTot = costoOrTot;
    }

    public void aggiungiDirigente (dirigente i){
        dir.add(i);
        costoOrTot+=100;
    }
    public void aggiungiFunzionario (funzionario i){
        fun.add(i);
        LocalDate confronto=LocalDate.now();
        if (confronto.getYear()-i.getAssunzione().getYear()<10){
            costoOrTot+=70;
        }
        else if (confronto.getYear()-i.getAssunzione().getYear()>10){
            costoOrTot+=80;
        }
    }
    public void aggiungiTecnico (tecnico i){
        tec.add(i);
        LocalDate confronto=LocalDate.now();
        if (i.getSpecializzazione().equals("informatica/telecomunicazioni")) {
            costoOrTot+=40;
            int annoAttuale=confronto.getYear();
            if(i.getIe()){
                while(annoAttuale!=i.getAssunzione().getYear()){
                    annoAttuale--;
                    costoOrTot+=1;
                }
            }
        }
        if (i.getSpecializzazione().equals("elettronica/automazione")) {
            costoOrTot+=50;
            int annoAttuale=confronto.getYear();
            if(i.getIe()){
                while(annoAttuale!=i.getAssunzione().getYear()){
                    annoAttuale--;
                    costoOrTot+=1;
                }
            }
        }
        
    }
}
