package pooexercicios;
public class Conta {
    double numero,saldo;
    Cliente titular;
    Data dataAbertura;
    
    void levantar(double quantia){
        this.saldo -= quantia;
    }
    void depositar(double quantia){
        this.saldo += quantia;
    }
    void calculaRendimento(){
        System.out.println("Claculando o rendimento");
    }
    void estado(){
        System.out.println("Numero: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
    }
}
