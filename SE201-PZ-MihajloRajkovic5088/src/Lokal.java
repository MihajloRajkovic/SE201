/***********************************************************************
 * Module:  Lokal.java
 * Author:  Mihajlo
 * Purpose: Defines the Class Lokal
 ***********************************************************************/

import java.util.*;

/** @pdOid 4ec30d89-a53e-4c3d-b85e-495fcd3704a3 */
public abstract class Lokal implements LokalInterface {
   /** @pdOid 88580c69-39e5-4f55-8c88-fb145b2c1f0a */
   private String naziv;
   /** @pdOid c6dae06a-530a-43c9-bef5-31be12f83b42 */
   private String mesto;
   /** @pdOid c28713bc-dc21-409a-8b48-61c547bcf39e */
   private int brojMesta;
   /** @pdOid 254f1332-19c7-4db0-ac36-8d7b2abe29f1 */
   private int brojSlobodnihMesta;
   /** @pdOid 7ca4feb6-79c4-4217-bdc3-aad17c3a19a7 */
   private int idLokala;
   
   /** @pdRoleInfo migr=no name=Rezervacija assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Rezervacija> rezervacija;
   /** @pdRoleInfo migr=no name=Zaposleni assc=association5 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<Zaposleni> zaposleni;
   
   /** @pdOid caf1f667-09b0-430b-b67d-da54c85b2360 */
   public String getNaziv() {
      return naziv;
   }
   
   /** @param newNaziv
    * @pdOid 500a41a4-3edd-4a84-bb54-7660bc15a66b */
   public void setNaziv(String newNaziv) {
      naziv = newNaziv;
   }
   
   /** @pdOid 448ff2d8-0e8c-4099-838c-b7b1351337f1 */
   public String getMesto() {
      return mesto;
   }
   
   /** @param newMesto
    * @pdOid 6e22077a-dfd6-4729-b34d-8378ca92b136 */
   public void setMesto(String newMesto) {
      mesto = newMesto;
   }
   
   /** @pdOid 8c81cf74-f358-474b-97bf-dac23efaad8e */
   public int getBrojMesta() {
      return brojMesta;
   }
   
   /** @param newBrojMesta
    * @pdOid 6077d731-5a14-452a-b77a-36ac2c89acde */
   public void setBrojMesta(int newBrojMesta) {
      brojMesta = newBrojMesta;
   }
   
   /** @pdOid 0e8cca8b-0dbd-4b69-b725-c0a9cbb6aec9 */
   public Lokal() {
      // TODO: implement
   }
   
   /** @pdOid a22ffcf9-1c76-430b-8718-f42180155266 */
   public int getBrojSlobodnihMesta() {
      return brojSlobodnihMesta;
   }
   
   /** @param newBrojSlobodnihMesta
    * @pdOid edb0ef82-f2de-4345-8d98-7a287f053d01 */
   public void setBrojSlobodnihMesta(int newBrojSlobodnihMesta) {
      brojSlobodnihMesta = newBrojSlobodnihMesta;
   }
   
   /** @pdOid f69f4106-cdde-4113-bc51-541627d84df6 */
   public Lokal lokal() {
      // TODO: implement
      return null;
   }
   
   /** @pdOid 60e3b306-ac18-49a0-b3d7-ef1d35034ab0 */
   public int getIdLokala() {
      return idLokala;
   }
   
   /** @param newIdLokala
    * @pdOid 770a17e9-a4e1-438a-8f86-f21a6e2491f6 */
   public void setIdLokala(int newIdLokala) {
      idLokala = newIdLokala;
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Rezervacija> getRezervacija() {
      if (rezervacija == null)
         rezervacija = new java.util.HashSet<Rezervacija>();
      return rezervacija;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRezervacija() {
      if (rezervacija == null)
         rezervacija = new java.util.HashSet<Rezervacija>();
      return rezervacija.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRezervacija */
   public void setRezervacija(java.util.Collection<Rezervacija> newRezervacija) {
      removeAllRezervacija();
      for (java.util.Iterator iter = newRezervacija.iterator(); iter.hasNext();)
         addRezervacija((Rezervacija)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRezervacija */
   public void addRezervacija(Rezervacija newRezervacija) {
      if (newRezervacija == null)
         return;
      if (this.rezervacija == null)
         this.rezervacija = new java.util.HashSet<Rezervacija>();
      if (!this.rezervacija.contains(newRezervacija))
         this.rezervacija.add(newRezervacija);
   }
   
   /** @pdGenerated default remove
     * @param oldRezervacija */
   public void removeRezervacija(Rezervacija oldRezervacija) {
      if (oldRezervacija == null)
         return;
      if (this.rezervacija != null)
         if (this.rezervacija.contains(oldRezervacija))
            this.rezervacija.remove(oldRezervacija);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRezervacija() {
      if (rezervacija != null)
         rezervacija.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Zaposleni> getZaposleni() {
      if (zaposleni == null)
         zaposleni = new java.util.HashSet<Zaposleni>();
      return zaposleni;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorZaposleni() {
      if (zaposleni == null)
         zaposleni = new java.util.HashSet<Zaposleni>();
      return zaposleni.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newZaposleni */
   public void setZaposleni(java.util.Collection<Zaposleni> newZaposleni) {
      removeAllZaposleni();
      for (java.util.Iterator iter = newZaposleni.iterator(); iter.hasNext();)
         addZaposleni((Zaposleni)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newZaposleni */
   public void addZaposleni(Zaposleni newZaposleni) {
      if (newZaposleni == null)
         return;
      if (this.zaposleni == null)
         this.zaposleni = new java.util.HashSet<Zaposleni>();
      if (!this.zaposleni.contains(newZaposleni))
         this.zaposleni.add(newZaposleni);
   }
   
   /** @pdGenerated default remove
     * @param oldZaposleni */
   public void removeZaposleni(Zaposleni oldZaposleni) {
      if (oldZaposleni == null)
         return;
      if (this.zaposleni != null)
         if (this.zaposleni.contains(oldZaposleni))
            this.zaposleni.remove(oldZaposleni);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllZaposleni() {
      if (zaposleni != null)
         zaposleni.clear();
   }

}