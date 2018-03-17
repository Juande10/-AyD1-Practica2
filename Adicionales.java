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