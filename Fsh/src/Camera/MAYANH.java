package Camera;

public abstract class MAYANH {
	
	private double canNang;
	private String hangSX;
	private String mauSac;
	private String ngaySX;
	private String tenMay;
	
	public MAYANH(double canNang, String hangSX, String mauSac, String ngaySX, String tenMay) {
		this.canNang=canNang;
		this.hangSX=hangSX;
		this.mauSac=mauSac;
		this.ngaySX=ngaySX;
		this.tenMay=tenMay;
	}
	
	public abstract void DacTinhKyThuatMay();
	public void InThongTinMay() {
	
	}
	public void MAYANH() {
		
	}
	
}
