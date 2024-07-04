import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = sc.next(System.in);
    System.out.println("Olá, por favor ensira seu nome:");
    String nome = sc.next();
    System.out.println("Ensira sua idade:");
    int idade = sc.nextInt();
    System.out.println("Sua altura:");
    double altura = sc.nextDouble();
    System.out.println("Qual o seu sexo?");
    System.out.println("");
    System.out.println("Feminino = 1");
    System.out.println("Masculino = 2");
    int sexo = sc.nextInt();
    System.out.println("Olá" + nome + ", fizemos uma breve analise das informações passadas e temos as seguintes informações a repassar");
    double pesoidealhomem = (72.7 * altura) - 58;
    double pesoidealmulher = (62.1 * altura) - 44.7;
    if (sexo = 1 ){(System.out.println(pesoidealmulher)};
    if (sexo = 2 ){(System.out.println(pesoidealhomem)};
    sc.close();
  }
}