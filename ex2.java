import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double r,a,pi = 3.14159;
	System.out.println("Digite o raio de um circulo: ");
	r=scan.nextDouble();
	
	a=pi*r*r;
	System.out.printf("Resultado = %.4f",a);
	scan.close();
	}

}
