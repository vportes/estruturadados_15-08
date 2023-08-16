import java.util.Scanner;

public class GerarNovoVetor {
    /*
    Ler o array (vetor) A e gerar o array B com a regra:
    número par soma 10
    número impar multiplica por 2
     */
    static int A[] = {2, 3, 5, 4, 9, 10, 11, 7};
    static int B[] = new int[A.length];
    static int C[] = new int[A.length];
    static int D[] = new int[A.length*2];

    static Scanner teclado = new Scanner(System.in);

    public static void gerarVetorB(){
        for(int i = 0; i < A.length; i++){
            if (A[i] % 2 == 0){
                System.out.print(A[i]+" + 10 = ");
                B[i] = A[i] + 10;
                System.out.println(B[i]);
            } else{
                System.out.print(A[i]+" * 2 = ");
                B[i] = A[i] * 2;
                System.out.println(B[i]);
            }
        }
    }
    public static void mostrarVetorB(){
        System.out.print("Valores de B: ");
        for(int i = 0; i < B.length; i++){
            System.out.print(B[i]+ " ");
        }
    }

    public static void gerarVetorC(){
        for(int i = 0; i < A.length; i++){
            C[i] = A[i] - B[i];
        }
    }

    public static void mostrarVetorC(){
        System.out.println("Valores de C: ");
        for(int i = 0; i < C.length; i++){
            System.out.print(C[i]+ " ");
        }
    }

    public static void gerarVetorD(){
        int j = 0;
        for(int i = 0; i < D.length; i++){
            if (i % 2 == 0){
                D[i] = A[j];
            } else{
                D[i] = B[j];
                j++;
            }
        }
    }

    public static void mostrarVetorD(){
        System.out.println("Valores de D: ");
        for(int i = 0; i < D.length; i++){
            System.out.print(D[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n1 - Gerar B");
            System.out.println("2 - Mostrar B");
            System.out.println("3 - Gerar C");
            System.out.println("4 - Mostrar C");
            System.out.println("5 - Gerar D");
            System.out.println("6 - Mostrar D");
            System.out.println("9 - Fim");
            System.out.print("Escolha: ");
            opcao = teclado.nextInt();
            switch (opcao){
                case 1 :
                    gerarVetorB();
                    break;
                case 2 :
                    mostrarVetorB();
                    break;
                case 3 :
                    gerarVetorC();
                    break;
                case 4 :
                    mostrarVetorC();
                    break;
                case 5 :
                    gerarVetorD();
                    break;
                case 6 :
                    mostrarVetorD();
                    break;
                case 9 :
                    System.out.println("Fim");
                    break;
                default :
                    System.out.println("Opção incorreta.");
            }
        }
    }
}
