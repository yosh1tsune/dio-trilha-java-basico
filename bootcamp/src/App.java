import java.time.LocalDate;

import models.*;

public class App {
  public static void main(String[] args) throws Exception {
    Conteudo curso = new Curso("POO Java", "POO utilizando Java", 70);
    Conteudo mentoria = new Mentoria("TDD Java", "TDD utilizando Java", LocalDate.now());

    Bootcamp bootcamp = new Bootcamp("Imersão Java", "Bootcamp completo de Java");
    bootcamp.getConteudos().add(curso);
    bootcamp.getConteudos().add(mentoria);

    Dev dev = new Dev("John Doe");
    System.out.println("XP Total: " + dev.calcularTotalXp());
    dev.inscreverBootcamp(bootcamp);
    dev.progredir();

    System.out.println("Conteúdos inscritos: " + dev.getConteudosInscritos());
    System.out.println("Conteúdos concluídos: " + dev.getConteudosConcluidos());
    System.out.println("XP Total: " + dev.calcularTotalXp());
  }
}
