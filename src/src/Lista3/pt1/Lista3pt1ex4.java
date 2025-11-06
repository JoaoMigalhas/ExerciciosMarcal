package Lista3.pt1;

public class Lista3pt1ex4 {
    public static void main(String[] args) {
	
	int somapares = 0;

	for ( int i = 1; i <= 500; i++){
		if ( i % 2 == 0) {
			somapares += i;
		}
	}
	System.out.println(somapares);
}
}
