/***********************************************************************
 * Module:  Porudzbina.java
 * Author:  Mihajlo
 * Purpose: Defines the Class Porudzbina
 ***********************************************************************/

import java.util.*;

/** @pdOid 25a14354-8675-4dd8-9166-ee6aba9782d3 */
public class Porudzbina {
   /** @pdOid 51527bcb-7a8b-4b47-bca3-06fe7ae3810d */
   private int idPorudzbine;
   /** @pdOid b6b77423-3a6c-40d6-9ea0-fbe5327635e2 */
   private String naCijeIme;
   /** @pdOid 2f4f91a1-55b7-4c2f-8b70-c38e32f9a60a */
   private String detaljiPorudzbine;
   
   /** @pdRoleInfo migr=no name=Rezervacija assc=association6 mult=1..1 side=A */
   public Rezervacija rezervacija;
   
   /** @pdOid 0d53d463-ea77-4bbe-8236-06d80d25db0e */
   public int getIdPorudzbine() {
      return idPorudzbine;
   }
   
   /** @param newIdPorudzbine
    * @pdOid 4b1acd1e-bbd1-4926-87a4-706d1f30f1e4 */
   public void setIdPorudzbine(int newIdPorudzbine) {
      idPorudzbine = newIdPorudzbine;
   }
   
   /** @pdOid 2ed3a069-3e1e-49fe-ad74-483cc086cf2f */
   public String getNaCijeIme() {
      return naCijeIme;
   }
   
   /** @param newNaCijeIme
    * @pdOid db492a62-4683-40df-9055-a499eedf617d */
   public void setNaCijeIme(String newNaCijeIme) {
      naCijeIme = newNaCijeIme;
   }
   
   /** @pdOid 7a197d05-29e0-49aa-baf5-7a2a3adf9024 */
   public String getDetaljiPorudzbine() {
      return detaljiPorudzbine;
   }
   
   /** @param newDetaljiPorudzbine
    * @pdOid da9c26a9-04df-47a7-bb48-d82a3b914e1f */
   public void setDetaljiPorudzbine(String newDetaljiPorudzbine) {
      detaljiPorudzbine = newDetaljiPorudzbine;
   }
   
   /** @pdOid 6526c56c-78c9-450b-a924-856c05247faf */
   public Porudzbina() {
      // TODO: implement
   }

}