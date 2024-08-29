package polygon;

public abstract class lopDaGiac {
	//members
	private int socanh;
	protected double[] leng;	//chua chieu dai cac canh
	//constructor
	public lopDaGiac(int socanh) {
		this.socanh = socanh;
		leng = new double[socanh];
	}
	//getters & setters
	public int getSocanh() {
		return socanh;
	}
	public void setSocanh(int socanh) {
		this.socanh = socanh;
	}
	public double[] getLeng() {
		return leng;
	}
	public void setLeng(double[] leng) {
		this.leng = leng;
	}
	//methods
		//virtual
	public void inInfo() {
		System.out.println("Da giac co "+((socanh==1 || socanh==2)? 4:socanh)+" canh.");
	}
		//abstract
	public abstract double tinhChuVi();
	public abstract double tinhDienTich();
}
