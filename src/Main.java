
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	/*分子*/
	int a;
	/*分母*/
	int b;

	Fraction(int ia,int ib){
		this.a = ia;
		this.b = ib;
		trans();
	}

	void trans(){
		int g = gcd(a,b);

		a = a/g;
		b = b/g;
	}

	Fraction  plus(Fraction r){

		Fraction h = new Fraction(this.a * r.b + this.b*r.a,this.b * r.b);

		return h;
	}

	Fraction multiply(Fraction r){
		Fraction h = new Fraction(this.a * r.a,this.b * r.b);
		return h;
	}

	double toDouble(){
		return (double)1.0 * a/b;
	}

	private int gcd(int m,int n){
		int temp;
		if (m < n ){
			temp = n;
			n = m;
			m = temp;
		}
		while (m % n != 0){
			temp = m % n;
			m = n;
			n = temp;
		}
		return n;
	}

	void print(){
		if (a == b){
			System.out.print('1');
		}else {
			System.out.print("" + a + '/' + b + '\n');
		}
	}
}