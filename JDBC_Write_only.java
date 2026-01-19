import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertText {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3307/testdb";
        String user = "root";
        String password = "mohtasim1230(8";

        String sql = "INSERT INTO student(name, message) VALUES (?, ?)";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, "Zim");
            pst.setString(2, "Hello Database! This text is inserted from Java.");

            pst.executeUpdate();

            System.out.println("Text inserted successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
