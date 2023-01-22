/***********************************************************************
 * Module:  Zaposleni.java
 * Author:  Mihajlo
 * Purpose: Defines the Class Zaposleni
 ***********************************************************************/

import java.util.*;

/** @pdOid d2ca8dd1-0bca-4187-b656-7192621f551d */
public class Zaposleni {
   /** @pdOid 1d89a87c-1826-4305-ad74-dd20bc2bf854 */
   private String ime;
   /** @pdOid 579beb2b-187c-4b98-92f6-9a5821d5047b */
   private String prezime;
   /** @pdOid 9d83a701-8281-42c9-b240-09952bfd2b30 */
   private int id;
   /** @pdOid 8240cfcd-fa82-4619-9989-7250a8debc61 */
   private String password;
   
   /** @pdOid 3310c87d-c5a4-415e-9548-675ee060184b */
   public String getIme() {
      return ime;
   }
   
   /** @param newIme
    * @pdOid 233fc165-bad0-40f6-9120-17b5ed6c9313 */
   public void setIme(String newIme) {
      ime = newIme;
   }
   
   /** @pdOid b23013e3-e82c-4281-968c-16aad654104e */
   public String getPrezime() {
      return prezime;
   }
   
   /** @param newPrezime
    * @pdOid 139b3b69-fb67-4a91-b890-f8833089e5b1 */
   public void setPrezime(String newPrezime) {
      prezime = newPrezime;
   }
   
   /** @pdOid 824890c0-bc54-47cf-8db0-4d03514df79f */
   public int getId() {
      return id;
   }
   
   /** @param newId
    * @pdOid 6edbc52b-cc19-4c23-b445-b2694c79918a */
   public void setId(int newId) {
      id = newId;
   }
   
   /** @pdOid 130edb6e-34e2-4825-a0cc-839bcc352787 */
   public String getPassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 0d1d8e10-a1fd-48cb-8462-c1a1b4d4e29b */
   public void setPassword(String newPassword) {
      password = newPassword;
   }
   
   /** @pdOid 43dd9afe-70b5-43fc-8d64-8e3868fb6e60 */
   public Zaposleni() {
      // TODO: implement
   }

}