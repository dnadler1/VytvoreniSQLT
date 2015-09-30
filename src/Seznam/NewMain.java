/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seznam;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(Seznam.SeznamZDatabaze.vytvorKolekci("INSERT INTO KONTAKTY (JMENO,PRIJMENI,ADRESA,UZIVATEL,PASSWORD) VALUES ('aaa6','aaa6', 'aaa6','aaa6','aaa6' )", "dnadler", "nadlerka","org.apache.derby.jdbc.ClientDriver" , "jdbc:derby://localhost:1527/ONLINEOBCHOD"));
        } catch (Exception ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
