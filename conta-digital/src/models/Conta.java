package models;

public abstract class Conta {
  protected String agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  private static String AGENCIA_PADRAO = "1";
  private static int SEQUENCIAL = 1;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  public String getAgencia(){
    return agencia;
  }

  public int getNumero(){
    return numero;
  }

  public double getSaldo(){
    return saldo;
  }

  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  public void sacar(double valor){
    saldo -= valor;
  }

  public void depositar(double valor){
    saldo += valor;
  }

  public void transferir(double valor, Conta contaDestino){
    contaDestino.depositar(valor);
    sacar(valor);
  }

  public void imprimirExtrato(){
    System.out.printf("Titular da Conta: %s%n", cliente.getNome());
    System.out.printf("Agencia: %s%n", agencia);
    System.out.printf("Conta: %d%n", numero);
    System.out.printf("Saldo: %.2f%n", saldo);
  }
}