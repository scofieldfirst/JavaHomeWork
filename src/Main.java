
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
//		a.plus(b).print();
//		a.multiply(b).plus(new Fraction(5,6)).print();
//		a.print();
//		b.print();
		in.close();
	}

}

class Fraction {
	/*分子*/
	private int oa;
	/*分母*/
	private int ob;

	private int a;
	private int b;

	Fraction(int ia,int ib){
		this.oa = ia;
		this.ob = ib;
	}

	void print(){
		System.out.print("" + oa + '/' + ob + '\n');
	}




}