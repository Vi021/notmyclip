package lopDaGiac;

public abstract class DaGiac {
	private int socanh;
	protected double [] canh;
	public DaGiac(int socanh) {
		this.socanh=socanh;
		canh = new double[socanh];
	}
	public abstract double tinhChuVi();
	public abstract double tinhDienTich();

}
