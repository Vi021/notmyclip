package Camera;

public class MAYANH_CHUYENNGHIEP extends MAYANH_KTS implements IWIFI, IGPS {
	private String loaiOngKinhTheoMay;
	private String tocDoChup;
	public MAYANH_CHUYENNGHIEP(double canNang, String hangSX, String mauSac, String ngaySX, String tenMay,  String doPhanGiai, String kichThuocSensor, String sensor, String loaiOngKinhTheoMay, String tocDoChup) {
		super(canNang, hangSX, mauSac, ngaySX, tenMay, doPhanGiai, kichThuocSensor, sensor);
		this.loaiOngKinhTheoMay=loaiOngKinhTheoMay;
		this.tocDoChup=tocDoChup;
	}

	@Override
	public void CachSuDungGPS() {

	}
	@Override
	public void CachSuDungWifi() {

	}
	@Override
	public void InThongTinMay() {
		super.InThongTinMay();
	}
	@Override
	public void DacTinhKyThuatMay() {
		super.DacTinhKyThuatMay();
	}
	public void MAYANH_CHUYENNGHIEP() {
		
	}
}
