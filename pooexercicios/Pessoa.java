package pooexercicios;
public class Pessoa {
    String nome;
    int idade;
    
    void fazaniversario(){
        this.idade += 1;
        System.out.println("Proximo ano teras "+this.idade);
    }
}
