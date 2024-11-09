import java.util.*;

class user_master_pswd extends wp_user {
    //Variable declaration
    int pswd_no = 0;
    String pswd;
    String salt;
    String hash_pswd;

    public int getPswdNo() {
        pswd_no += 1;
        return (pswd_no);
    }

    /*

    Make sure password is highly encrypted.

    public String getPswd() {

    }

    public String getSalt() {

    }

    public String getHashPswd() {

    }
    */

}