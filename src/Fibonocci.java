
public class Fibonocci {
public static void main(String[] args) {
	int fib = 1;

	for (int i=0; i<145; i+= fib) {
		fib+=i;
		System.out.println(i);
		System.out.println(fib);
	}
}
}
