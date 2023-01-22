
/** *********************************************************************
 * Module:  Rezervacija.java
 * Author:  Mihajlo
 * Purpose: Defines the Class Rezervacija
 ********************************************************************** */
import exception.CenaException;
import java.util.*;

/**
 * @pdOid 371fe1f3-5445-4200-859e-0aa086d73df1
 */
public class Rezervacija implements RezervacijaInterface {

    /**
     * @pdOid 3988e3fc-1c69-476f-bf6f-46989783f1f0
     */
    private int idRez;
    /**
     * @pdOid e76d4a7b-3a7b-4c56-8cc9-6904202b86da
     */
    private Date datum;
    /**
     * @pdOid ed7d7a01-dc5d-451d-9f5a-dab5ac644793
     */
    private int brojMesta;
    /**
     * @pdOid 4f1fdcca-3e66-43a4-8129-140b6f1cc04c
     */
    private double ukupnaCena;
    /**
     * @pdOid f350ba00-e3da-4176-9b53-7eb78c874766
     */
    private Porudzbina porudzbina;

    /**
     * @pdRoleInfo migr=no name=Klijent assc=association4
     * coll=java.util.Collection impl=java.util.HashSet mult=1..*
     * type=Composition
     */
    public java.util.Collection<Klijent> klijent;

    /**
     * @pdOid 55f802ce-d76b-46f9-9171-94b8057dfa91
     */
    public int rezervacija__() {
        // TODO: implement
        return 0;
    }

    /**
     * @pdOid 209e93b2-f429-4d3b-b606-3254966c4b24
     */
    public int getIdRez() {
        return idRez;
    }

    /**
     * @param newIdRez
     * @pdOid e7af137f-32ab-46db-8604-e06630716e85
     */
    public void setIdRez(int newIdRez) {
        idRez = newIdRez;
    }

    /**
     * @pdOid 2a5c7cf2-f2f8-487c-a30e-fd232f9a27ac
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param newDatum
     * @pdOid ace23bd2-2270-46c4-b166-6ad36c1a430e
     */
    public void setDatum(Date newDatum) {
        datum = newDatum;
    }

    /**
     * @pdOid 8830c9e5-5985-498c-9b56-d5a3c4fbdcfd
     */
    public int getBrojMesta() {
        return brojMesta;
    }

    /**
     * @param newBrojMesta
     * @pdOid ad0312cd-8d6a-43d2-a8b8-bee0dfe6ea14
     */
    public void setBrojMesta(int newBrojMesta) {
        brojMesta = newBrojMesta;
    }

    /**
     * @pdOid a34ceebc-3c2d-4aff-8530-4df6ff67e29c
     */
    public double getUkupnaCena() {
        return ukupnaCena;
    }

    /**
     * @param newUkupnaCena
     * @pdOid 6222eb3e-1e72-4b1a-9d4d-9eec2dcb90a5
     */
    public void setUkupnaCena(double newUkupnaCena) {
        ukupnaCena = newUkupnaCena;
    }

    /**
     * @pdOid b1caaea7-62c7-49d2-9806-f6963379ae0d
     */
    public Porudzbina getPorudzbina() {
        return porudzbina;
    }

    /**
     * @param newPorudzbina
     * @pdOid 4ba96c37-5c54-462b-a7ac-f478632c058e
     */
    public void setPorudzbina(Porudzbina newPorudzbina) {
        porudzbina = newPorudzbina;
    }

    /**
     * @pdOid acf09c41-d982-422c-b0ea-19ea180cae83
     */
    public Rezervacija() {
        // TODO: implement
    }

    /**
     * @pdGenerated default getter
     */
    public java.util.Collection<Klijent> getKlijent() {
        if (klijent == null) {
            klijent = new java.util.HashSet<Klijent>();
        }
        return klijent;
    }

    /**
     * @pdGenerated default iterator getter
     */
    public java.util.Iterator getIteratorKlijent() {
        if (klijent == null) {
            klijent = new java.util.HashSet<Klijent>();
        }
        return klijent.iterator();
    }

    /**
     * @pdGenerated default setter
     * @param newKlijent
     */
    public void setKlijent(java.util.Collection<Klijent> newKlijent) {
        removeAllKlijent();
        for (java.util.Iterator iter = newKlijent.iterator(); iter.hasNext();) {
            addKlijent((Klijent) iter.next());
        }
    }

    /**
     * @pdGenerated default add
     * @param newKlijent
     */
    public void addKlijent(Klijent newKlijent) {
        if (newKlijent == null) {
            return;
        }
        if (this.klijent == null) {
            this.klijent = new java.util.HashSet<Klijent>();
        }
        if (!this.klijent.contains(newKlijent)) {
            this.klijent.add(newKlijent);
        }
    }

    /**
     * @pdGenerated default remove
     * @param oldKlijent
     */
    public void removeKlijent(Klijent oldKlijent) {
        if (oldKlijent == null) {
            return;
        }
        if (this.klijent != null) {
            if (this.klijent.contains(oldKlijent)) {
                this.klijent.remove(oldKlijent);
            }
        }
    }

    /**
     * @pdGenerated default removeAll
     */
    public void removeAllKlijent() {
        if (klijent != null) {
            klijent.clear();
        }
    }

    @Override
    public void dodaj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean izbrsi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rezervacija izmeni() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double izmeniCenu(double cena) throws CenaException {
        if (cena > 0) {
            return this.ukupnaCena + cena;
        } else {
            throw new CenaException("Pogresan unos!");
        }

    }
}
