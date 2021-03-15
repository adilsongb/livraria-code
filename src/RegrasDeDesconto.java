
public class RegrasDeDesconto {

    public static void main(String[] args){
        
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        
        Livro livro = new LivroFisico(autor);
        livro.setValor(59.90);
        
        Livro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(39.90);
        
        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);
        
        System.out.println("Valor atual do livro: " + livro.getValor());
        System.out.println("Valor atual do ebook: " + ebook.getValor());
        
        if (!livro.aplicarDecontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }
        
        if (!ebook.aplicarDecontoDe(0.15)) {
            System.out.println("Desconto no ebook não pode ser maior do que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }

    }
    
}
