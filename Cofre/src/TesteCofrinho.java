import java.util.Scanner;
public class TesteCofrinho {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Cofrinho cofr1 = new Cofrinho();
        
        // ações no cofre vazio
       /* cofr1.colocarDinheiro(2, 25);
        cofr1.colocarDinheiro(1, 3.55);
        System.out.println("Valor no cofre 1: "+cofr1.contarDinheiro());
        System.out.println("Quanto vc quer colocar em moeda?");
        double valorM = input.nextDouble();
        cofr1.destrancar();
        cofr1.colocarDinheiro(1, valorM);
        System.out.println("Quanto vc quer colocar em notas?");
        int valorN = input.nextInt();
        cofr1.colocarDinheiro(2, valorN);
        System.out.println("Valor no cofre 1: "+ cofr1.contarDinheiro());
        System.out.println("Valor em moedas no cofre 1: "+ cofr1.valorEmMoedas);
        System.out.println("Valor em notas no cofre 1: "+ cofr1.valorEmNotas);
        cofr1.trancar();
        */
        
        
        
        // cofre 2
        Cofrinho cofr2 = new Cofrinho(4.35,230);
        System.out.println("O cofre 2 tem "+ cofr2.valorEmMoedas + " moedas");
        System.out.println("O cofre 2 tem "+ cofr2.valorEmNotas + " notas");
        System.out.println("Quanto vc quer retirar do cofre 2?");
        double valor3 = input.nextDouble();
        if (valor3 <= cofr2.valorEmMoedas)
            cofr2.tirarDinheiro(1, valor3);
        else
        {
            double moedas = cofr2.valorEmMoedas;
            int notas = (int)(valor3-cofr2.valorEmMoedas);
            System.out.println("Quanto sobrou p tirar do cofre: "+ notas);
            cofr2.tirarDinheiro(1, moedas);
            cofr2.tirarDinheiro(2, notas);
        }
        System.out.println("Sobrou no cofre em moedas: "+ cofr2.valorEmMoedas);
        System.out.println("Ficou no cofre: "+cofr2.contarDinheiro());
        
        
        
        
        
        
    }
    
}
