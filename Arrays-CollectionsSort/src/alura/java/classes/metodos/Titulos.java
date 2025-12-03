package alura.java.classes.metodos;

public class Titulos implements Comparable <Titulos> {
     public Titulos(String titulo){
         this.nomeDoTitulo = titulo;
     }

    @Override
    public int compareTo(Titulos outroTitulo) {
        return this.nomeDoTitulo.compareTo(outroTitulo.getNomeDoTitulo());
    }

    private String nomeDoTitulo;

    public String getNomeDoTitulo() {
        return nomeDoTitulo;
    }

    public void setNomeDoTitulo(String nomeDoTitulo) {
        this.nomeDoTitulo = nomeDoTitulo;
    }

    @Override
    public String toString() {
        return  "Linguagem de Programação: " +nomeDoTitulo+ "\n";
    }
}
