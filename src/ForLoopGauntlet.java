
public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int j = 100; j > -1; j--) {
			System.out.println(j);
		}
		for (int o = 2; o < 101; o++) {
			if (o % 2 == 0) {
				System.out.println(o);
			}
		}
		for (int p = 1; p < 100; p++) {
			if (p % 2 != 0) {
				System.out.println(p);
			}
		}
		for (int l = 0; l < 501; l++) {
			if (l % 2 == 0) {
				System.out.println(l + "even");
			} else {
				System.out.println(l + "odd");
			}
		}
		for (int m = 0; m < 777; m++) {
			if (m % 7 == 0) {
				System.out.println(m);
			}
		}
		for (int a = 2004; a < 2018; a++) {
			int y = a - 2004;

			System.out.println("in " + a + " i was " + y);
		}
		for (int i = 0; i < 3; i++) {

			for (int s = 0; s < 3; s++) {
System.out.println(i + " "+ s);
			}
		}
		for (int i = 1; i < 8; i+= 3) {
for (int j = 2; j < 9; j+= 3) {
	for (int o = 2; o < 9; o+= 3) {
	System.out.println(i+ j +o);
}
	
			}
		}	
	}
}

