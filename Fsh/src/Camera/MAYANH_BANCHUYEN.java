package Camera;

public class MAYANH_BANCHUYEN extends MAYANH_KTS implements IWIFI {
	private String loaiOngKinhTheoMay;
	public MAYANH_BANCHUYEN(double canNang, String hangSX, String mauSac, String ngaySX, String tenMay,  String doPhanGiai, String kichThuocSensor, String sensor, String loaiOngKinhTheoMay) {
		super(canNang, hangSX, mauSac, ngaySX, tenMay, doPhanGiai, kichThuocSensor, sensor);
		this.loaiOngKinhTheoMay=loaiOngKinhTheoMay;
	}

	@Override
	public void CachSuDungWifi() {

	}
	@Override
	public void DacTinhKyThuatMay() {
		super.DacTinhKyThuatMay();
	}
	@Override
	public void InThongTinMay() {
		super.InThongTinMay();
	}
	public void MAYANH_BANCHUYEN() {
		
	}

}
