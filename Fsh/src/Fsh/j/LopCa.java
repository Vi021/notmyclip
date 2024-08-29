package Fsh.j;

public abstract class LopCa {
	//member variable
	private String tenca;
	private String mausac;
	private double cannang;
	private boolean covay;
	//constructor
	public  LopCa(String tenca, String mausac, double cannang, boolean covay) {
		this.tenca=tenca;
		this.mausac=mausac;
		this.cannang=cannang;
		this.covay=covay;
	}
	//Getters & Setters
	public String getTenca() {
		return tenca;
	}
	public void setTenca(String tenca) {
		this.tenca = tenca;
	}
	public String getMausac() {
		return mausac;
	}
	public void setMausac(String mausac) {
		this.mausac = mausac;
	}
	public double getCannang() {
		return cannang;
	}
	public void setCannang(double cannang) {
		this.cannang = cannang;
	}
	public boolean isCovay() {
		return covay;
	}
	public void setCovay(boolean covay) {
		this.covay = covay;
	}
	public void out() {
		System.out.println("");
	}
}
