
public class CarrinhoDeCompras {
    
    private double total;
    
    public void adiciona(Livro livro){
        System.out.println("Adicionando: " + livro);
        livro.aplicarDecontoDe(0.1);
        total += livro.getValor();
    }
    
    public double getTotal(){
        return total;
    }
    
}
