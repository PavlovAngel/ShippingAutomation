public class Account {
    private static String userName;
    private static String password;

    Account() {
        userName = "shipping";
        password = "shipping";
    }

    public static String getUserName() {

        return userName;
    }

    public static String getPassword() {

        return password;
    }
}
