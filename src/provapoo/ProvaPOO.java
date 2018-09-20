package provapoo;
/*
Nomes:  Matheus L. de Oliveira;
        Vitor Toigo;
*/
import java.util.Scanner;

public class ProvaPOO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cor;
        String marca;
        int potencia;
        int cilindros;
        double velocidadeMaxima;
        boolean rodaOpcao = true;

        int escolha;

        //Classe Carro.java
        System.out.println("Cor do carro: ");
        cor = sc.nextLine();
        System.out.println("Marca do carro: ");
        marca = sc.nextLine();
        //Classe Motor.java
        System.out.println("Potência do carro: ");
        potencia = sc.nextInt();
        System.out.println("Cilindros do carro: ");
        cilindros = sc.nextInt();
        System.out.println("Velocidade máxima do carro: ");
        velocidadeMaxima = sc.nextDouble();

        Carro carro = new Carro(cor, marca, 0, 0, 0);

        carro.setCor(cor);
        carro.setMarca(marca);
        carro.motor.setCilindros(cilindros);
        carro.motor.setPotencia(potencia);
        carro.motor.setVelocidadeMaxima(velocidadeMaxima);

        System.out.println("Menu de opções:\n");
        System.out.println("1. Ligar carro");
        System.out.println("2. Acelerar o carro(1km)");
        System.out.println("3. Acelerar o carro(10km)");
        System.out.println("4. Frear carro");
        System.out.println("5. Informar a situação atual");
        System.out.println("6. Desligar o carro");
        System.out.println("7. Sair");

        while (rodaOpcao) {
            escolha = sc.nextInt();
            System.out.println(escolha);
            switch (escolha) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.acelerar();
                    break;
                case 3:
                    carro.acelerar(10);
                    break;
                case 4:
                    carro.frear();
                    break;
                case 5:
                    System.out.println(carro.toString());
                    break;
                case 6:
                    carro.desligar();
                    break;
                default:
                    rodaOpcao = false;
            }
        }
        sc.close();
    }
}
