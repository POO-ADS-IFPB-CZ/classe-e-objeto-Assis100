//metodo transfere
package Banco;

public class Banco {
    public static boolean transfere(ContaBancariaSimplificada origem, ContaBancariaSimplificada destino, double valor) {
        if (origem.retira(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada("João", 1000);
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada("Maria", 500);

        boolean sucesso = transfere(conta1, conta2, 200);

        System.out.println("Transferência realizada: " + sucesso);
        System.out.println("Saldo João: " + conta1.getSaldo());
        System.out.println("Saldo Maria: " + conta2.getSaldo());
    }
}
