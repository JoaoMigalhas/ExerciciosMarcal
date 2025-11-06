package Lista5.pt2;

public class Carros4 {
    // Atributos privados
    private String placa;
    private double capacidadeTanque;
    private String marca;
    private String modelo;
    private int numeroPortas;

    // Construtor padrão
    public Carros4() {}

    // Getters e Setters com consistência
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().length() < 7) {
            System.out.println("Erro: a placa deve conter pelo menos 7 caracteres!");
        } else {
            this.placa = placa;
        }
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        if (capacidadeTanque < 35) {
            System.out.println("Atenção: capacidade do tanque inferior a 35 litros!");
        } else {
            this.capacidadeTanque = capacidadeTanque;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        if (numeroPortas < 2) {
            System.out.println("Erro: o carro deve possuir pelo menos duas portas!");
        } else {
            this.numeroPortas = numeroPortas;
        }
    }

    // Método para imprimir todos os dados
    public void ImprimirFicha() {
        System.out.println("\n=== Ficha do Carro ===");
        System.out.println("Placa: " + placa);
        System.out.println("Capacidade do Tanque: " + capacidadeTanque + " L");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Número de Portas: " + numeroPortas);
        System.out.println("======================");
    }
}
