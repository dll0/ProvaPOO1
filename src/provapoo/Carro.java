package provapoo;

import provapoo.Motor;

public class Carro {

    private String cor;
    private String marca;
    Motor motor = new Motor(0, 0, 0, 0, false);

    private int atual;

    public Carro(String cor, String marca, int potencia, int cilindros, double velocidadeMaxima) {
        this.cor = cor;
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void ligar() {
        if (motor.isLigado()) {
            System.out.println("Carro já está ligado.");
        } else {
            motor.setLigado(true);
            System.out.println("Carro agora está ligado");
        }
    }

    public void desligar() {
        if (!motor.isLigado()) {
            System.out.println("Carro já está desligado.");
        } else {
            motor.setLigado(false);
            motor.setVelocidadeAtual(0);
            System.out.println("Carro agora está desligado");
        }
    }

    public void acelerar() {
        if (motor.getVelocidadeAtual() + 1 <= motor.getVelocidadeMaxima() && motor.isLigado()) {
            atual = motor.getVelocidadeAtual();
            atual++;
            motor.setVelocidadeAtual(atual);
            System.out.println("Velocidade aumentada em 1km/h");
        } else if (motor.getVelocidadeAtual() + 1 >= motor.getVelocidadeMaxima()) {
            System.out.println("Velocidade atual não pode aumentar pois está no limite da velocidade máxima");
        } else if (!motor.isLigado()) {
            System.out.println("O carro está desligado!");
        }
    }

    public void acelerar(int quantidade) {
        if (motor.getVelocidadeAtual() + 10 <= motor.getVelocidadeMaxima()) {
            atual = motor.getVelocidadeAtual();
            atual += quantidade;
            motor.setVelocidadeAtual(atual);
            System.out.println("Velocidade aumentada em 10km/h");
        } else if (motor.getVelocidadeAtual() + 10 >= motor.getVelocidadeMaxima()){
            System.out.println("Velocidade atual não pode aumentar pois está no limite da velocidade máxima");
        } else if (!motor.isLigado()) {
            System.out.println("O carro está desligado!");
        }
    }

    public void frear() {
        if (motor.getVelocidadeAtual() == 0){
            System.out.println("Carro já está parado");
        } else {
            motor.setVelocidadeAtual(0);
            System.out.println("Carro freado");
        }
        
    }

    @Override
    public String toString() {
        String bool;

        if (motor.isLigado()) {
            bool = "Carro da cor " + getCor() + ", marca " + getMarca() + " "
                    + "possui um motor com a potência de " + motor.getPotencia() + ""
                    + " com a quantidade de " + motor.getCilindros() + " cilindros.\nEstá rodando com "
                    + "a velocidade atual de " + motor.getVelocidadeAtual() + ", podendo "
                    + "chegar a uma velocidade máxima de " + motor.getVelocidadeMaxima();
        } else {
            bool = "Carro está desligado.";
        }

        return String.format(bool);
    }
}
