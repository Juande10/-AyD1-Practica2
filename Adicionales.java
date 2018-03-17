public static Double factorial(){

	int fact =1;
	int cont =1;
	int numero = 10;
	
	while(numero!=0)
	{
		fact = fact * cont;
		cont++;
	}

return (Double)fact;

}


//otroooooo

import java.util.Scanner;

public class funcionFactorial{

	static Scanner entrada = new Scanner(System.in);

		static int factorial(int n){
		
			if(n==0){
				
			  return 1;
			}
			else{
			  return n * factorial(n-1);
			}
		
		}
		
		public static void main(String[] args){
		
			int n;
			System.out.println("Ingrese el numero: ");
			n = entrada.nextInt();
			System.out.println("El factorial es: " +factorial);
		
		
		}


}