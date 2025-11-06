package Lista5.pt4;
//teste

public class Calculo {

    public static double Somar(double valorA, double valorB) {
        return valorA + valorB;
    }

    public static double Somar(int valorA, int valorB, double valorC){
        return valorA + valorB + valorC;
    }

    public static double Somar(double[] valores){
        double soma = 0;
        for (double v : valores){
            soma += v;
        }
        return soma;
    }

    public static double Maior(int valorA, double valorB){
        return (valorA > valorB) ? valorA:valorB;
    }

    public static double Maior(double [] valores) {
        double maior = valores [0];
        for (int i = 1; i < valores.length; i++){
            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        return maior;
    }
}
