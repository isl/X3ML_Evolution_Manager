package gr.forth.ics.isl.xem.util.db;
import gr.forth.ics.isl.xem.util.db.dropdatabase;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static gr.forth.ics.isl.xem.util.db.DB_Connection.getInitialConnection;

public class dropdatabase {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        dropdatabase drop = new dropdatabase();
        drop.drop();
    }

    public void drop() throws SQLException, ClassNotFoundException {
        Connection conn = getInitialConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("DROP DATABASE thesisDB");
        stmt.close();
        conn.close();
    }
}
