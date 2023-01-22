/***********************************************************************
 * Module:  Klijent.java
 * Author:  Mihajlo
 * Purpose: Defines the Class Klijent
 ***********************************************************************/

import java.util.*;

/** @pdOid 72af79df-3f19-4374-8b8e-104ba1dca8a9 */
public class Klijent {
   /** @pdOid b8105c5b-6d7d-4955-92e9-5096d35de3a0 */
   private String username;
   /** @pdOid 4517140a-a055-4f0e-9c6d-a62fe709fd01 */
   private String password;
   /** @pdOid 4b1eec3d-a945-4112-8b08-f63f98090e56 */
   private String ime;
   /** @pdOid aead830f-687a-4927-9d1a-b1ba1875eab7 */
   private String prezime;
   /** @pdOid b511465c-f714-43d5-9e1b-c59cb672ffbb */
   private String telefon;
   
   /** @pdOid fd340502-18b4-4d82-ba65-a169618bbad7 */
   public String getUsername() {
      return username;
   }
   
   /** @param newUsername
    * @pdOid 72480651-aa9e-45d1-bba4-d958a295e836 */
   public void setUsername(String newUsername) {
      username = newUsername;
   }
   
   /** @pdOid f325249c-fd49-42e4-b7e1-3462b9291e16 */
   public String getPassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 49a63698-24dc-42be-8722-a24c29b8b3ef */
   public void setPassword(String newPassword) {
      password = newPassword;
   }
   
   /** @pdOid 6167423a-3e5c-4258-a02d-b632c79c5cb7 */
   public String getIme() {
      return ime;
   }
   
   /** @param newIme
    * @pdOid 1c39832e-c159-4b82-8ff1-a6557da25297 */
   public void setIme(String newIme) {
      ime = newIme;
   }
   
   /** @pdOid 78451241-455b-4ff7-b76e-ff9a5096344e */
   public String getPrezime() {
      return prezime;
   }
   
   /** @param newPrezime
    * @pdOid 07cce9f6-f6a5-428a-a75e-d9a79e317887 */
   public void setPrezime(String newPrezime) {
      prezime = newPrezime;
   }
   
   /** @pdOid 860f7291-c7b7-42a8-8a12-2eec003a0899 */
   public Klijent() {
      // TODO: implement
   }
   
   /** @pdOid a6a3765c-cba7-4bc7-8fa9-c84449950e37 */
   public String getTelefon() {
      return telefon;
   }
   
   /** @param newTelefon
    * @pdOid 32b94902-7a3a-4caf-9280-f423ba79c11b */
   public void setTelefon(String newTelefon) {
      telefon = newTelefon;
   }

}