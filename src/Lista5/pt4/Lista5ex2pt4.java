package Lista5.pt4;
//teste
public class Lista5ex2pt4 {

    public static double CalcularDesconto(double valorMensalidade, int diasAntecedencia){
        double desconto = 0;

        if (diasAntecedencia <= 5){
            desconto = 0.03;
        } else if(diasAntecedencia <= 10){
            desconto = 0.05;
        } else if (diasAntecedencia > 10){
            desconto = 0.08;
        }

        return valorMensalidade - (valorMensalidade * desconto);
    }

    public static double CalcularDesconto(double valorMensalidade, double notaEnem){
        double desconto = 0;

        if (notaEnem >= 700 && notaEnem <= 800){
            desconto = 0.05;
        } else if (notaEnem > 800 && notaEnem <= 900){
            desconto = 0.08;
        } else if(notaEnem > 900){
            desconto = 0.10;
        }

        return valorMensalidade - (valorMensalidade * desconto);
    }

    public static double CalcularDesconto(double valorMensalidade, double nota1, double nota2, double nota3){
        double desconto = 0;
        double media = (nota1 + nota2 + nota3)/3;

        if(media > 8.50 && media <= 9){
            desconto = 0.05;
        } else if (media > 9){
            desconto = 0.08;
        }
        
        return valorMensalidade - (valorMensalidade * desconto);
    }
}
