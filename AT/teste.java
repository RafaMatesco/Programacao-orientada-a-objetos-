import java.util.Scanner;

public class teste{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Seu nome: ");
        String seuNome = scan.next( );

        System.out.println(seuNome + " é seu nome");
        scan.close();
    }
}