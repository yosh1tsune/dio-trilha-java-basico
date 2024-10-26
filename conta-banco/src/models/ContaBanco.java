package models;

public class ContaBanco {
  private String name;
  private String agency;
  private String accountNumber;
  private Double balance;

  public ContaBanco(String name, String agency, String accountNumber, Double balance) {
    this.name = name;
    this.agency = agency;
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String getName(){
    return name;
  }

  public String getAgency(){
    return agency;
  }

  public String getAccountNumber(){
    return accountNumber;
  }

  public Double getBalance(){
    return balance;
  }

  public void print(){
    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.%n", name, agency, accountNumber, balance);
  }
}
