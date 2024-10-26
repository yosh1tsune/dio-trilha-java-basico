import java.util.ArrayList;
import java.util.Scanner;

import models.ContaBanco;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    ArrayList<String> attributes = new ArrayList<String>() {
      {
        add("agency");
        add("accountNumber");
        add("name");
        add("balance");
      }
    };

    Scanner scanner = new Scanner(System.in);
    Double balance = 0.0;
    String name = "", agency = "", accountNumber = "";

    for(String attribute : attributes) {
      if(attribute == "agency"){
        System.out.println("Digite o número da agência: ");
        agency = scanner.nextLine();
      } else if(attribute == "accountNumber"){
        System.out.println("Digite o número da conta: ");
        accountNumber = scanner.nextLine();
      } else if(attribute == "name"){
        System.out.println("Digite o nome do cliente: ");
        name = scanner.nextLine();
      } else if(attribute == "balance"){
        System.out.println("Digite o saldo: ");
        balance = scanner.nextDouble();
      }
    }

    ContaBanco contaBanco = new ContaBanco(name, agency, accountNumber, balance);

    contaBanco.print();

    scanner.close();
  }
}
