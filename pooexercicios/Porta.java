package pooexercicios;
public class Porta {
    boolean estado;
    String cor;
    
    void abrir(){
      this.estado = true;
        System.out.println("Esta aberta");
    }
    void fechar(){
        this.estado = false;
        System.out.println("Esta fechada");
    }
    boolean verAbrir(){
        if(this.estado == true){
            return true;
        }else
            return false;
    }
    void estadoporta(){
        System.out.println("Aberta "+this.estado);
        System.out.println("Cor: "+this.cor);
        System.out.println("verAberta: "+this.verAbrir());
    }
}
