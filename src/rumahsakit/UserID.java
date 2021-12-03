/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

/**
 *
 * @author user
 */
public class UserID {
    private static String txtuser;
 
public static void setUserLogin(String txtuser) {
UserID.txtuser = txtuser;
}
public static String getUserLogin() {
return txtuser;
}

}
