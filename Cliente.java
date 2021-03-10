/*
-- Classe Construtor (sem parâmetro)
-- Atributos livres mas um atributo pelo menos com visibilidade privada
-- Métodos criados para verificação de preço ou empréstimo ou gênero (sugestões)
-- IF ELSE ou ELSEIF ou Switch
-- Método toString();
 */
public class Cliente {
    private String nome;
    private int idade;    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cliente() {
    }

    String brinde (){
        String resposta;
        if(this.idade < 14){
            resposta = "Você vai ganhar um marca pagina de brinde. \n"
                    + "Não pare de ler.";
        } else {
            resposta = "Volte sempre.";
        }
        return resposta;
    }

    @Override
    public String toString() {
        return "== Confirmando Cadastro==" + "\n" +
                "Seu nome: " + this.nome + "\n" +
                "Sua idade: " + this.idade;
    }
}
