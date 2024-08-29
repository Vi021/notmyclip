package polygon;

import java.util.Scanner;

public class hinhTamGiac extends lopDaGiac {
	private Scanner scan;
	public hinhTamGiac() {
		super(3);
		scan = new Scanner(System.in);
		for(int i=0;  i<3; i++)
		{
			System.out.print("Nhap chieu dai canh "+(i+1)+" tam giac: ");
			leng[i] = scan.nextDouble(); //scan.nextLine();
		}
	}
	@Override
	public double tinhChuVi() {
		return leng[0]+leng[1]+leng[2];
	}
	@Override
	public double tinhDienTich() {
		double p = (leng[0]+leng[1]+leng[2])/2;
		return Math.sqrt(p*(p-leng[0])*(p-leng[1])*(p-leng[2]));
	}
	@Override
	public void inInfo() {
		super.inInfo();
		System.out.println("Do dai cac canh tam giac: "+leng[0]+" "+leng[1]+" "+leng[2]);
		System.out.println("Chu vi tam giac: "+tinhChuVi());
		System.out.println("Dien tich tam giac: "+tinhDienTich());
	}
}
