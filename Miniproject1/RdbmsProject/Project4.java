import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Project4 {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String USER = "your_username";
    private static final String PASS = "your_password";
    private static final String TABLE_NAME = "USER_DETAILS"; // Update this if your table name is different.

    public static void main(String[] args) {
        if (args.length < 1) {
            printUsage();
            return;
        }

        String option = args[0].trim();
        try {
            switch (option) {
                case "1":
                    if (args.length != 2) {
                        System.out.println("Usage: java Project4 1 <userID>");
                        return;
                    }
                    System.out.println(getUserType(args[1]));
                    break;
                case "2":
                    if (args.length != 2) {
                        System.out.println("Usage: java Project4 2 <userID>");
                        return;
                    }
                    System.out.println(getIncorrectAttempts(args[1]));
                    break;
                case "3":
                    if (args.length != 2) {
                        System.out.println("Usage: java Project4 3 <userID>");
                        return;
                    }
                    System.out.println(changeUserType(args[1]));
                    break;
                case "4":
                    System.out.println(getLockStatus());
                    break;
                case "5":
                    if (args.length != 3) {
                        System.out.println("Usage: java Project4 5 <userID> <name>");
                        return;
                    }
                    System.out.println(changeName(args[1], args[2]));
                    break;
                case "6":
                    if (args.length != 2) {
                        System.out.println("Usage: java Project4 6 <password>");
                        return;
                    }
                    System.out.println(changePassword(args[1]));
                    break;
                case "7":
                    if (args.length != 7) {
                        System.out.println("Usage: java Project4 7 <id> <password> <name> <incorrectAttempts> <lockStatus> <userType>");
                        return;
                    }
                    UserBean bean7 = buildBeanFromArgs(args, 1);
                    System.out.println(addUser_1(bean7));
                    break;
                case "8":
                    if (args.length != 7) {
                        System.out.println("Usage: java Project4 8 <id> <password> <name> <incorrectAttempts> <lockStatus> <userType>");
                        return;
                    }
                    UserBean bean8 = buildBeanFromArgs(args, 1);
                    System.out.println(addUser_2(bean8));
                    break;
                case "9":
                    if (args.length != 2) {
                        System.out.println("Usage: java Project4 9 <userType>");
                        return;
                    }
                    printUserBeans(getUsers(args[1]));
                    break;
                case "10":
                    printUserBeans(storeAllRecords());
                    break;
                case "11":
                    printNames(getNames());
                    break;
                default:
                    printUsage();
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void printUsage() {
        System.out.println("Project4 JDBC Usage:");
        System.out.println("  java Project4 1 <userID>                 # getUserType");
        System.out.println("  java Project4 2 <userID>                 # getIncorrectAttempts");
        System.out.println("  java Project4 3 <userID>                 # changeUserType to Admin");
        System.out.println("  java Project4 4                         # getLockStatus count with 0");
        System.out.println("  java Project4 5 <userID> <name>          # changeName");
        System.out.println("  java Project4 6 <password>               # changePassword for Admin users");
        System.out.println("  java Project4 7 <id> <password> <name> <incorrectAttempts> <lockStatus> <userType>  # addUser_1");
        System.out.println("  java Project4 8 <id> <password> <name> <incorrectAttempts> <lockStatus> <userType>  # addUser_2");
        System.out.println("  java Project4 9 <userType>               # getUsers");
        System.out.println("  java Project4 10                        # storeAllRecords");
        System.out.println("  java Project4 11                        # getNames");
    }

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Oracle JDBC driver not found", e);
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static String getUserType(String userID) throws SQLException {
        String sql = "SELECT usertype FROM " + TABLE_NAME + " WHERE userid = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, userID);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("usertype");
                }
            }
        }
        return null;
    }

    public static String getIncorrectAttempts(String userID) throws SQLException {
        String sql = "SELECT incorrectattempts FROM " + TABLE_NAME + " WHERE userid = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, userID);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int attempts = rs.getInt("incorrectattempts");
                    if (attempts == 0) {
                        return "No Incorrect Attempt";
                    } else if (attempts == 1) {
                        return "One Time";
                    }
                    return "Incorrect Attempt Exceeded";
                }
            }
        }
        return null;
    }

    public static String changeUserType(String userID) throws SQLException {
        String sql = "UPDATE " + TABLE_NAME + " SET usertype = 'Admin' WHERE userid = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, userID);
            int updated = ps.executeUpdate();
            return updated > 0 ? "Update Success" : "Update Failed";
        }
    }

    public static int getLockStatus() throws SQLException {
        String sql = "SELECT COUNT(*) AS lockedcount FROM " + TABLE_NAME + " WHERE lockstatus = 0";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("lockedcount");
            }
        }
        return 0;
    }

    public static String changeName(String id, String name) throws SQLException {
        String sql = "UPDATE " + TABLE_NAME + " SET name = ? WHERE userid = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.setString(2, id);
            int updated = ps.executeUpdate();
            return updated > 0 ? "Success" : "Failed";
        }
    }

    public static String changePassword(String password) throws SQLException {
        String sql = "UPDATE " + TABLE_NAME + " SET password = ? WHERE usertype = 'Admin'";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, password);
            int updated = ps.executeUpdate();
            return updated > 0 ? "Changed" : "0";
        }
    }

    public static String addUser_1(UserBean bean) throws SQLException {
        return insertUser(bean);
    }

    public static String addUser_2(UserBean bean) throws SQLException {
        if (bean.getLockStatus() != 0) {
            return "Fail";
        }
        return insertUser(bean);
    }

    private static String insertUser(UserBean bean) throws SQLException {
        String sql = "INSERT INTO " + TABLE_NAME + " (userid, password, name, incorrectattempts, lockstatus, usertype) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, bean.getId());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setInt(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());
            int inserted = ps.executeUpdate();
            return inserted > 0 ? "Success" : "Fail";
        }
    }

    public static ArrayList<UserBean> getUsers(String userType) throws SQLException {
        ArrayList<UserBean> users = new ArrayList<>();
        String sql = "SELECT userid, password, name, incorrectattempts, lockstatus, usertype FROM " + TABLE_NAME + " WHERE usertype = ?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, userType);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    UserBean bean = mapRowToBean(rs);
                    users.add(bean);
                }
            }
        }
        return users;
    }

    public static ArrayList<UserBean> storeAllRecords() throws SQLException {
        ArrayList<UserBean> users = new ArrayList<>();
        String sql = "SELECT userid, password, name, incorrectattempts, lockstatus, usertype FROM " + TABLE_NAME;
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                users.add(mapRowToBean(rs));
            }
        }
        return users;
    }

    public static String[] getNames() throws SQLException {
        ArrayList<String> names = new ArrayList<>();
        String sql = "SELECT name FROM " + TABLE_NAME;
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                names.add(rs.getString("name"));
            }
        }
        return names.toArray(new String[0]);
    }

    private static UserBean mapRowToBean(ResultSet rs) throws SQLException {
        UserBean bean = new UserBean();
        bean.setId(rs.getString("userid"));
        bean.setPassword(rs.getString("password"));
        bean.setName(rs.getString("name"));
        bean.setIncorrectAttempts(rs.getInt("incorrectattempts"));
        bean.setLockStatus(rs.getInt("lockstatus"));
        bean.setUserType(rs.getString("usertype"));
        return bean;
    }

    private static UserBean buildBeanFromArgs(String[] args, int startIndex) {
        UserBean bean = new UserBean();
        bean.setId(args[startIndex]);
        bean.setPassword(args[startIndex + 1]);
        bean.setName(args[startIndex + 2]);
        bean.setIncorrectAttempts(Integer.parseInt(args[startIndex + 3]));
        bean.setLockStatus(Integer.parseInt(args[startIndex + 4]));
        bean.setUserType(args[startIndex + 5]);
        return bean;
    }

    private static void printUserBeans(ArrayList<UserBean> users) {
        if (users.isEmpty()) {
            System.out.println("No users found.");
            return;
        }
        for (UserBean bean : users) {
            System.out.println(bean);
        }
    }

    private static void printNames(String[] names) {
        if (names.length == 0) {
            System.out.println("No names found.");
            return;
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
