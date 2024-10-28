package models;

public abstract class Conteudo {
  protected static final double XP_PADRAO = 10;

  private String titulo;
  private String descricao;

  public Conteudo(String titulo, String descricao){
    this.titulo = titulo;
    this.descricao = descricao;
  }

  public abstract double calcularXp();

  public String getDescricao() {
    return descricao;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

}
