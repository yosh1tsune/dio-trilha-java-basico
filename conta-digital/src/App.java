import models.Cliente;
import models.Conta;
import models.ContaCorrente;
import models.ContaPoupanca;

public class App {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("John Doe");
    Conta cc = new ContaCorrente(cliente);
    Conta poupanca = new ContaPoupanca(cliente);

    cc.depositar(100);
    cc.transferir(50, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
  }
}
