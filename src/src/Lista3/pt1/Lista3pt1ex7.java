package Lista3.pt1;

public class Lista3pt1ex7 {
    public static void main(String[] args) {
	
	int potencia = 1;
	
	for ( int i = 0; i <= 15; i++){
		if (i == 0){
			System.out.println("1");
			continue;
		} 
		potencia = potencia * 3;
		System.out.println(" 3 ^ " + i + " é " + potencia);
	}
}
}
