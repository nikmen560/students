import sql.ConnectDB;

public class Main {
    public static void main(String[] args) {
        ConnectDB connectDB = new ConnectDB();
        connectDB.connect();
    }
}
