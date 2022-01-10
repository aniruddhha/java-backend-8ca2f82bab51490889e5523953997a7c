import menu.Menu;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            Menu mn = new Menu();
            mn.showMenu();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
