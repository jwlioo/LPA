import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner leia = new Scanner(System.in);
      
      int idade = 17;
      
  System.out.println("Qual sua idade: ");
   idade = leia.nextInt();
  
  if ( idade >= 18) {
    System.out.println("Você já pode votar!"); 
    }
    
  else {
  System.out.println("Você ainda não pode votar."); }
  }
}
