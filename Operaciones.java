public static String Suma(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 + b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }



public static String Resta(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 - b1;
		String resultado = Integer.toString(c1, 2);
        return resultado;
    }

public static String Multiplicacion(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 * b1;

        String resultado = Integer.toString(c1, 2);
        return resultado;
    }


 public static String Division(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 / b1;
        String resultado = Integer.toString(c1, 2);
        return resultado;
    }   
	
public static String Potencia(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int c1 = a1 / b1;
        String resultado = (int) Math.pow(b1, a1);
        return resultado;
    }

	
public static String Raiz(String a) {
        int a1 = Integer.parseInt(a, 2);
        String resultado = Math.sqrt(numero.toString());
        return resultado;
    }
	