package DAO_Package;

public class DAO_NhanVien {

//    public Entity_NhanVien checkByID(String TaiKhoan,String MatKhau) {
//        String sql = "SELECT * FROM NHANVIEN WHERE MANV=? AND MATKHAU=?";
//        List<Entity_NhanVien> list = this.selectBySQl(sql,TaiKhoan,MatKhau);
//        return list.size() > 0 ? list.get(0) : null;
//    }
//
//    protected List<Entity_NhanVien> selectBySQl(String sql,Object...args){
//        List<Entity_NhanVien> list = new ArrayList<>();
//        try {
//            ResultSet rs = null;
//            try {
//                rs = Connected_JDBC.query(sql, args);
//                while(rs.next()){
//                    Entity_NhanVien nv = new Entity_NhanVien();
//                    nv.setMaNV(rs.getString("MANV"));
//                    nv.setTenNV(rs.getString("TENNV"));
//                    nv.setTaiKhoan(rs.getString("TAIKHOAN"));
//                    nv.setMatKhau(rs.getString("MATKHAU"));
//                    list.add(nv);
//                }
//            }
//            finally {
//                rs.getStatement().getConnection().close();
//            }
//        }
//        catch (SQLException e){
//            e.printStackTrace();
//            throw new RuntimeException();
//        }
//        return list;
//    }
}
