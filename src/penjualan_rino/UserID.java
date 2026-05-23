package penjualan_rino;

public class UserID {
    private static String id_kasir;

    public static void setUserLogin(String id) {
        id_kasir = id;
    }

    public static String getUserLogin() {
        return id_kasir;
    }
}