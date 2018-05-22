import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String Num = JOptionPane.showInputDialog("pick a number");
int   p= Integer.parseInt(Num);
boolean prime = true;
for (int i = p-1; i >= 2 ; i--) {
if(p%i== 0 )	{
	prime= false;
}

}
if(prime) {
	JOptionPane.showMessageDialog(null, "Its prime"); 
}
else {
	JOptionPane.showMessageDialog(null, "It is noooooooooooot prime");
}
}
}
