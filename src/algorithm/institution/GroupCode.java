package algorithm.institution;

import java.util.Random;

public class GroupCode {
	public static char[] a = new char[8];

	public String jy(char[] a) {
		int[] ww = { 3, 7, 9, 10, 5, 8, 4, 2 };

		int[] cc = new int[8];
		int DD = 0;
		int C9 = 0;

		for (int i = 0; i < 8; i++) {
			cc[i] = a[i];
			if (47 < cc[i] && cc[i] < 58)
				cc[i] = cc[i] - 48;
			else
				cc[i] = cc[i] - 65;
		}
		for (int i = 0; i < 8; i++) {
			DD += cc[i] * ww[i];
		}
		C9 = 11 - DD % 11;
		if (C9 == 10) {
			for (int i = 0; i < 8; i++)
				System.out.print(GroupCode.a[i]);
			System.out.println("-X");
			return new String(a) + "-X";
		} else if (C9 == 11) {
			for (int i = 0; i < 8; i++)
				System.out.print(GroupCode.a[i]);
			System.out.println("-" + (char) (48));
			return new String(a) + "-" + (char) (48);
		} else {
			for (int i = 0; i < 8; i++)
				System.out.print(GroupCode.a[i]);
			System.out.println("-" + (char) (C9 + 48));
			return new String(a) + "-" + (char) (C9 + 48);
		}

	}

	public static void main(String[] args) {
		GroupCode G = new GroupCode();
		
		try {
//			for (int i = 0; i < 8; i++) {
//
//				GroupCode.a[i] = (char) System.in.read();
//			}
			for(int j=0;j<50;j++){
				//������8Ϊ����
				Random ran = new Random();
				for (int i = 0; i < 8; i++) {
					
					GroupCode.a[i] = (char)( ran.nextInt(10) + 48);
				}
				G.jy(a);
			}
			
		} catch (Exception e) {
		}
		

	}
}