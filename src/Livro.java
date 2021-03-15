
public abstract class Livro {
    //Atributos:
    private String nome;
    private String descricao;
    private double valor; //com "private" apenas a class livro pode usar essa variavel
    private String isbn;
    private Autor autor;
    private boolean impresso;
    
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
    
    void adicionarValor(double valor){
    
        this.valor = valor;
    
    }
    
    double retornarValor(){
    
        return this.valor;
    
    }
    
    public Livro(Autor autor){
    
        this.autor = autor;
        this.isbn = "000-00-00000-00-0";
        this.impresso = true;
    }
    
    ///////////////////////////////////////// Getters and Setters
    
    public double getValor(){
        return valor; 
    }
   
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getISBN(){
        return isbn;
    }
    
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    
    public Autor getAutor(){
        return autor;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
}
