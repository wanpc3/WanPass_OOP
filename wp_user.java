import java.util.*;

class wp_user {
    int user_no = 0;
    String email;

    public int getUserNumber() {
        user_no += 1;
        return (user_no);
    }

    public String getEmail(String em) {
        return (em);
    }

    public static void main(String[] args) {

        //Create object user
        wp_user user = new wp_user();

        //Assign an object "Lincoln Lau" to user class:
        user.getUserNumber(); // user_no: 1
        user.getEmail("lincolnlau@gmail.com"); // email: lincolnlau@gmail.com
    }
}