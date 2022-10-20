package pooexercicios;
public class carro {
    String cor, modelo;
    double velocidadeAtual, velocidadeMaxima;
    boolean chave;
    motor motor;
    
    void ligar(){
        this.chave = true;
        System.out.println("Esta ligado");
    }
    void acelerar(double veloc){
        if(this.chave == true){
            this.velocidadeMaxima = this.velocidadeAtual + veloc;
            System.out.println("velocidade maxima e de "+this.velocidadeMaxima);
        }
    }
}
