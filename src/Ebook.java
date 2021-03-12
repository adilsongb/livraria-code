
// extends - indica que é uma extensão de classe, filhos que herdam caracteristicas da classe indicada
public class Ebook extends Livro {
    
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }
    
    @Override //o código não compilará caso esse método não exista na classe pai (superclasse)
    public boolean aplicarDecontoDe(double porcentagem){
        
        if (porcentagem > 0.15) {
            return false;
        } 
        System.out.println("Aplicando desconto no Ebook");
        return super.aplicarDecontoDe(porcentagem);
 
    }
    
    public void setWaterMark(String waterMark){
    
        this.waterMark = waterMark;
    
    }
    
    public String getWaterMark(){
    
        return waterMark;
    
    }
    
}
