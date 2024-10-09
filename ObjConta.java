package Encapsulamento;

public class ObjConta {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria(100000.00);
        
        System.out.println(conta.getSaldo());
        
        conta.depositar(500);
        conta.depositar(1000);

        System.out.println(conta.getSaldo());

        conta.sacar(1500);

        System.out.println(conta.getSaldo());


    }

}
