public class ReprodutorMusical {
  private String musica;

  public void setMusica(String musica){
    this.musica = musica;
  }

  public void tocar(){
    System.out.printf("Reproduzindo a música %s.%n", musica);
  }

  public void pausar(){
    System.out.println("Reprodução pausada.");
  }

  public void selecionarMusica(String musica){
    setMusica(musica);
    tocar();
  }
}
