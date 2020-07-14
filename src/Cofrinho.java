public class Cofrinho {
    boolean estado;
    double valorEmMoedas;
    int valorEmNotas;
    
    public Cofrinho(){
        
    }
    public Cofrinho(double valorMoeda, int valorNota){
        valorEmMoedas = valorMoeda;
        valorEmNotas = valorNota;
    }


public void trancar(){
    estado=true;
    System.out.println("Cofre trancado");
}

public void destrancar(){
    estado=false;
    System.out.println("Destrancado");
}

public void colocarDinheiro(int tipo, double valor){
    if (tipo==1)
        valorEmMoedas += valor;
    else
        valorEmNotas += (int)valor;
}
public void tirarDinheiro(int tipo, double valor){
    if (tipo==1)
        if (valorEmMoedas>=valor)
            valorEmMoedas -= valor;
        else
            System.out.println("Não tem dinheiro suficiente");
    else
        if (valorEmNotas>=valor)
            valorEmNotas -= valor;
        else
            System.out.println("Não tem dinheiro suficiente");
        
}
public double contarDinheiro(){
    return (valorEmNotas+valorEmMoedas);
    
}
}

