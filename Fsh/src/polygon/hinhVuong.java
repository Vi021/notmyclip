package polygon;

import java.util.Scanner;

public class hinhVuong extends lopDaGiac {
	private Scanner scan;
	//constructor
	public hinhVuong() {
		super(1);	//do 4 canh = nhau
		scan = new Scanner(System.in);
		System.out.print("Nhap chieu dai canh hinh vuong: ");
		leng[0] = scan.nextDouble(); scan.nextLine();
	}
	//methods
	@Override
	public double tinhChuVi() {
		return 4*leng[0];
	}
	@Override
	public double tinhDienTich() {
		return leng[0]*leng[0];
	}
	@Override
	public void inInfo() {
		super.inInfo();
		System.out.println("Chieu dai canh hinh vuong: "+leng[0]);
		System.out.println("Chu vi: "+tinhChuVi());
		System.out.println("Dien tich: "+tinhDienTich());
	}
}
