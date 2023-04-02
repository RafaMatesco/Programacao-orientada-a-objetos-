import java.util.Scanner;

class atividade{
    public static void main(String args[]) {
        Scanner scan = new Scanner( System.in );
        
        int af = scan.nextInt();
        int ai = scan.nextInt();
        
        int n = ((af - ai) / 4 ) + 1;
        int f = (af - ai) / (n-1);
        f = f*2;
        int r = af - f;

        System.out.println(r);

        scan.close();

    }
}
