package Camera;

public class MAYANH_KTS extends MAYANH implements IWIFI, IGPS {
	
	private String doPhanGiai;
	private String kichThuocSensor;
	private String sensor;

	public MAYANH_KTS(double canNang, String hangSX, String mauSac, String ngaySX, String tenMay, String doPhanGiai, String kichThuocSensor, String sensor) {
		super(canNang, hangSX, mauSac, ngaySX, tenMay);
		this.doPhanGiai=doPhanGiai;
		this.kichThuocSensor=kichThuocSensor;
		this.sensor=sensor;
	}

	@Override
	public void InThongTinMay() {
		super.InThongTinMay();
	}
	@Override
	public void DacTinhKyThuatMay() {

	}

	@Override
	public void CachSuDungWifi() {
		
	}

	@Override
	public void CachSuDungGPS() {
		
	}
	
}