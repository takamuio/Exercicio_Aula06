import java.util.Scanner;

public class ProgramaLivro {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        Livro l1 = new Livro();
        Cliente c1 = new Cliente();
        
        System.out.println("Vamos fazer seu cadastro !");
        System.out.println("Digite seu nome: ");
        c1.setNome(ler.nextLine());
        System.out.println("Digite sua idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println(c1);
        
        System.out.println("Agora vamos ver que livro você quer !");
        System.out.println("Digite o nome do livro: ");
        l1.setNome(ler.nextLine());
        System.out.println("Digite o genero do livro: ");
        l1.setGenero(ler.nextLine());
        System.out.println("Digite o valor do livro: ");
        l1.setValor(ler.nextDouble());
        
        System.out.println(l1);
        System.out.println(l1.verificarDesconto());
        System.out.println(c1.brinde());
        
    }
    
}
