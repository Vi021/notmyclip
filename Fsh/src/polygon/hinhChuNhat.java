package polygon;

import java.util.*;

public class hinhChuNhat extends lopDaGiac {
	private Scanner scan;
	public hinhChuNhat() {
		super(2);
		scan = new Scanner(System.in);
		System.out.print("Nhap chieu dai hinh chu nhat: ");
		leng[0] = scan.nextDouble();
		System.out.print("Nhap chieu rong hinh chu nhat: ");
		leng[1] = scan.nextDouble();
	}

	@Override
	public double tinhChuVi() {
		return (leng[0]+leng[1])/2;
	}

	@Override
	public double tinhDienTich() {
		return leng[0]*leng[1];
	}
	@Override
	public void inInfo() {
		super.inInfo();
		System.out.println("Chieu dai va chieu rong cua hinh chu nhat: "+leng[0]+" "+leng[1]);
		System.out.println("Chu vi hinh chu nhat: "+tinhChuVi());
		System.out.println("Dien tich hinh chu nhat: "+tinhDienTich());
	}
}
