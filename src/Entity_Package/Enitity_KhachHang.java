package Entity_Package;

public class Enitity_KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private String soDienThoai;
    private String nhanVienHoTro;
    private String loaiUuDai;
    private int soLanMuaHang;
    private double tongTienChi;

    public Enitity_KhachHang() {
    }

    public Enitity_KhachHang(String maKhachHang, String tenKhachHang, String soDienThoai, String nhanVienHoTro, String loaiUuDai, int soLanMuaHang, double tongTienChi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.nhanVienHoTro = nhanVienHoTro;
        this.loaiUuDai = loaiUuDai;
        this.soLanMuaHang = soLanMuaHang;
        this.tongTienChi = tongTienChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getNhanVienHoTro() {
        return nhanVienHoTro;
    }

    public void setNhanVienHoTro(String nhanVienHoTro) {
        this.nhanVienHoTro = nhanVienHoTro;
    }

    public String getLoaiUuDai() {
        return loaiUuDai;
    }

    public void setLoaiUuDai(String loaiUuDai) {
        this.loaiUuDai = loaiUuDai;
    }

    public int getSoLanMuaHang() {
        return soLanMuaHang;
    }

    public void setSoLanMuaHang(int soLanMuaHang) {
        this.soLanMuaHang = soLanMuaHang;
    }

    public double getTongTienChi() {
        return tongTienChi;
    }

    public void setTongTienChi(double tongTienChi) {
        this.tongTienChi = tongTienChi;
    }
}
