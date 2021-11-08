import java.util.Scanner;
public class Basic {
   public static void main(String[] args) {
       Scanner basic = new Scanner (System.in);
       String nome = "";
       System.out.println("### SEJA MUITO BEM VINDO!! ###");
       System.out.println("Qual o seu nome? ");
       nome = basic.nextLine();
       System.out.println(".........................");
       System.out.println("Prazer " + nome + "!!");
       System.out.println(".........................");
       System.out.println("Digite um contador inicial: ");
       int cont;
       int cont2;
       cont = basic.nextInt();
       System.out.println("Deseja contar até qual número a partir de " + cont + "?");
       cont2 = basic.nextInt();
       System.out.println("INICIANDO DE " + cont + " até " + cont2 + ";");
       while(cont <= cont2){
           System.out.println(cont);
           cont = cont + 1;
           System.out.println(". . . ");
       }
       System.out.println("Fim da contagem!");
}
 
}
