package models;

public class Curso extends Conteudo {
  private int cargaHoraria;

  public Curso(String titulo, String descricao, int cargaHoraria){
    super(titulo, descricao);
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
           "titulo='" + getTitulo() + '\'' +
           ", descricao='" + getDescricao() + '\'' +
           ", data=" + cargaHoraria +
           '}';
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + cargaHoraria;
  }
}
