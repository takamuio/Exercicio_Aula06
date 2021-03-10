/*
-- Classe Construtor (sem parâmetro) - - DONE
-- Atributos livres mas um atributo pelo menos com visibilidade privada - - DONE
-- Métodos criados para verificação de preço ou empréstimo ou gênero (sugestões) - - DONE
-- IF ELSE ou ELSEIF ou Switch - - DONE
-- Método toString(); DONE
 */
public class Livro {

    private String nome, genero;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Livro() {
    }
    
    String verificarDesconto(){
        double precoFinal = 0;
        String resposta;
        
        if (this.valor > 80){
            precoFinal = this.valor * 0.8;
            resposta = "E com desconto é: " + precoFinal;
        } else {
            resposta = "Este livro não tem desconto.";
        }
        return resposta;
    }

    @Override
    public String toString() {
        return "== Dados do Livro ==" + "\n" +
                "nome do livro: " + nome + "\n" +
                "Genero do livro: " + genero + "\n" +
                "Valor do livro: " + valor + "\n";
    }
    
}
