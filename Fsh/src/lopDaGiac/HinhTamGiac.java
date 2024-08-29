package lopDaGiac;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HinhTamGiac extends DaGiac {
	private Scanner sc;
	public HinhTamGiac(int socanh) {
		super(3);
		boolean a=false;
		do {
			try {
				do {
					try {
						System.out.println("Nhap canh thu nhat: ");
						sc = new Scanner(System.in);
						canh[0]=sc.nextDouble(); sc.nextLine();
						if(canh[0]<=0)
							throw new NhapSoDuong("Canh nhap phai duong!");
						else a=false;
					}
					catch(InputMismatchException e) {
						System.out.println("Loi: "+e.getMessage());
						a=true;
					}
					catch(NhapSoDuong e) {
						System.out.println("Loi: "+e.getMessage());
						a=true;
					}
				}
				while (a);
				do {
					try {
						System.out.println("Nhap canh thu hai: ");
						sc = new Scanner(System.in);
						canh[1]=sc.nextDouble(); sc.nextLine();
						if(canh[1]<=0)
							throw new NhapSoDuong("Canh nhap phai duong!");
						else a=false;
					}
					catch(InputMismatchException e) {
						System.out.println("Loi: "+e.getMessage());
						a=true;
					}
					catch(NhapSoDuong e) {
						System.out.println("Loi: "+e.getMessage());
						a=true;
					}
				}
				while (a);
				do {
					try {
						System.out.println("Nhap canh thu ba: ");
						sc = new Scanner(System.in);
						canh[2]=sc.nextDouble(); sc.nextLine();
						if(canh[2]<=0)
							throw new NhapSoDuong("Canh nhap phai duong!");
						a=false;
					}
					catch(InputMismatchException e) {
						System.out.println("Loi: "+e.getMessage());
						a=true;
					}
					catch(NhapSoDuong e) {
						System.out.println("Loi: "+e.getMessage());
						a=true;
					}
				}
				while (a);
				if(canh[0]+canh[1]<=canh[2] || canh[1]+canh[2]<=canh[0] || canh[0]+canh[2]<=canh[1])
					throw new KiemTraTamGiac("Cac canh nhap khong tao thanh mot tam giac!");
				else a=false;
			}
			catch(KiemTraTamGiac e) {
				System.out.println("Loi: "+e.getMessage());
				a=true;
			}
		}
		while(a);
	}

	@Override
	public double tinhChuVi() {
		return canh[0]+canh[1]+canh[2];
	}

	@Override
	public double tinhDienTich() {
		double p=(canh[0]+canh[1]+canh[2])/2;
		return Math.sqrt(p*(p-canh[0])*(p-canh[1])*(p-canh[2]));
	}

}
