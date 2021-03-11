
public class Livro {
    //Atributos:
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;
    
    void MostrarDetalhes(){
        
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);        
        if (this.temAutor()) {
            autor.MostrarDetalhes();
        }
        System.out.println("============================");
        
    }
    
    public boolean aplicarDecontoDe(double porcentagem){
        
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
    
    boolean temAutor(){
    
        return this.autor != null;
    
    }
    
}
