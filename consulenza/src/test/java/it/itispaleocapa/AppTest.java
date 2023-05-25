package it.itispaleocapa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Unit test for simple App.
 */
class AppTest {
    @Test
    public void testDirigenteConstructor() {
        int codice = 1;
        String cognome = "Cognome";
        String nome = "Nome";
        dirigente manager = new dirigente(codice, cognome, nome);
        Assertions.assertEquals(codice, manager.getCodice());
        Assertions.assertEquals(cognome, manager.getCognome());
        Assertions.assertEquals(nome, manager.getNome());
    }

    @Test
    public void testFunzionarioConstructor() {
        int codice = 1;
        String cognome = "Cognome";
        String nome = "Nome";
        funzionario employee = new funzionario(codice, cognome, nome);
        Assertions.assertEquals(codice, employee.getCodice());
        Assertions.assertEquals(cognome, employee.getCognome());
        Assertions.assertEquals(nome, employee.getNome());
    }

    @Test
    public void testTecnicoConstructor() {
        int codice = 1;
        String cognome = "Cognome";
        String nome = "Nome";
        boolean ie = true;
        String specializzazione = "informatica/telecomunicazioni";
        tecnico technician = new tecnico(codice, cognome, nome, ie, specializzazione);
        Assertions.assertEquals(codice, technician.getCodice());
        Assertions.assertEquals(cognome, technician.getCognome());
        Assertions.assertEquals(nome, technician.getNome());
        Assertions.assertEquals(ie, technician.isIe());
        Assertions.assertEquals(specializzazione, technician.getSpecializzazione());
    }

    @Test
    public void testAggiungiDirigente() {
        dirigente manager = new dirigente(1, "Cognome", "Nome");
        ArrayList<dirigente> dirigentiList = new ArrayList<>();
        ArrayList<funzionario> funzionariList = new ArrayList<>();
        ArrayList<tecnico> tecniciList = new ArrayList<>();
        int costoTotale = 0;
        progetto project = new progetto(dirigentiList, funzionariList, tecniciList, costoTotale);

        project.aggiungiDirigente(manager);

        Assertions.assertTrue(project.getDir().contains(manager));
        Assertions.assertEquals(costoTotale + 100, project.getCostoTot());
    }

    
}

