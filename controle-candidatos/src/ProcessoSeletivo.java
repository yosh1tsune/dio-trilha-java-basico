import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  static double SALARIO_BASE = 2_000.0;
  public static void main(String[] args) throws Exception {
    ArrayList<String> candidatosSelecionados = selecionaCandidatos();
    imprimeSelecionados(candidatosSelecionados);

    for(String candidato : candidatosSelecionados)
      entrandoEmContato(candidato);
  }

  static ArrayList<String> selecionaCandidatos(){
    String candidatos[] = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" };
    ArrayList<String> candidatosSelecionados = new ArrayList<String>();
    int candidatoAtual = 0;

    while(candidatosSelecionados.size() <= 5 && candidatoAtual < candidatos.length){
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.printf("O candidato %s solicitou o salário de: %.2f.%n", candidato, salarioPretendido);
      if(analisarCandidato(salarioPretendido)){
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
        candidatosSelecionados.add(candidato);
      }
      System.out.println();
      candidatoAtual++;
    }
    return candidatosSelecionados;
  }

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800,2200);
  }

  static boolean analisarCandidato(double salarioPretendido){
    return SALARIO_BASE > salarioPretendido ? true : false;
  }

  static void imprimeSelecionados(ArrayList<String> candidatosSelecionados){
    System.out.println("Os candidatos selecionados foram os seguintes:");
    for(String candidato : candidatosSelecionados){
      System.out.println(candidato);
    }
    System.out.println();
  }

  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true, atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;

      if(continuarTentando)
        tentativasRealizadas++;
    } while(continuarTentando && tentativasRealizadas <= 3);

    if(atendeu)
      System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
    else
      System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ".");
  }

  static boolean atender(){
    return new Random().nextInt(3) == 1;
  }
}
