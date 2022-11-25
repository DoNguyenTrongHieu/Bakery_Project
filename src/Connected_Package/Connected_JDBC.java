package Connected_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connected_JDBC {
    //    private static final String dburl = "jdbc:sqlserver://localhost:1433;"+"databaseName=QuanLyTiemBanh;integratedSecurity=true;" +"encrypt=true;trustServerCertificate=true";
//    private static final String username = "sa";
//    private static final String password = "1234";
//
//
//    // tạo PreparedStatement
//    public static PreparedStatement preparedStatement (String sql, Object...args) throws SQLException, SQLException {
//        Connection connection = DriverManager.getConnection(dburl,username,password);
//        PreparedStatement pmts = null;
//        if(sql.trim().startsWith("{")){
//            pmts = connection.prepareCall(sql);
//        }else {
//            pmts = connection.prepareStatement(sql);
//        }
//        for (int i = 0;i < args.length;i++) {
//            pmts.setObject(i + 1,args[i]);
//        }
//    return pmts;
//    }
//    //Update
//    public static void executeUpdate (String sql,Object...args) {
//        try {
//            PreparedStatement stmt = preparedStatement(sql, args);
//            try {
//                stmt.executeUpdate();
//            }finally {
//                stmt.getConnection().close();
//            }
//        }catch (SQLException e) {
//            throw new RuntimeException();
//        }
//    }
//    //Query
//    public static ResultSet query(String sql, Object...args) {
//        try {
//            //Tạo PreparedStatement mới gọi class Connected_JDBC sử dụng hàm preparedStatement(sql,args)
//            PreparedStatement stmt = Connected_JDBC.preparedStatement(sql,args);
//            //Trả về stmt
//            return  stmt.executeQuery();
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//    }
    public Connection databaseLink;

    public Connection getConnection() {
        String serverName = "KHOALE\\SQLEXPRESS";
        String databaseName = "QuanLyTiemBanh";
        String databaseUsername = "wibu";
        String databasePassword = "123456";
        String url = "jdbc:sqlserver://" + serverName + ":1433;DatabaseName=" + databaseName + ";encrypt=true;trustServerCertificate=true";

        try {
            databaseLink = DriverManager.getConnection(url, databaseUsername, databasePassword);
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
        return databaseLink;
    }
}
