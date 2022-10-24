import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        sc.close();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor em ordem inversa  >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Os valores lidos invertidos são:");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex04() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor de números pares >>");
        int i = 0;

        while (i < 6) {
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if ((vet[i]%2) == 0 && vet[i] >= 0) {
                i++;
            }else {
                System.out.printf("Erro: Valor deve ser par e positivo\n");
            }
        }

        sc.close();

        System.out.println("Os numeros pares são:");
        for (int j = 0; j < 6; j++){
            System.out.printf("%d ",vet[j]);
        }
    }

    public static void ex05() {
        Scanner sc = new Scanner(System.in);
        float[] vet = new float[5];
        System.out.println("<< 5 valores >>");
        float maior = 0, menor = 0, media = 0, soma = 0;

        System.out.printf("Entre com o número 1:\n");
        vet[0] = sc.nextInt();
        maior = vet[0];
        menor = vet[0];
        for (int i = 1; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = vet[i];
            }else{
                if (vet[i] < menor) {
                    menor = vet[i];
                }
            }
        }

        sc.close();

        for (int i = 0; i < 5; i++) {
            soma += vet[i];
        }

        media = soma/5;

        System.out.println("Os números digitados são: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%.0f ",vet[i]);
        }
        System.out.println("\nO maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);
        System.out.println("A média é: " + media);
    }

    public static void ex06() {
        Scanner sc = new Scanner(System.in);
        float[] vet = new float[5];
        System.out.println("<< 5 valores >>");
        float maior = 0, menor = 0, media = 0, soma = 0;
        int indiceMaior = 0, indiceMenor = 0;

        System.out.printf("Entre com o número 1:\n");
        vet[0] = sc.nextInt();
        maior = vet[0];
        menor = vet[0];
        for (int i = 1; i < 5; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = vet[i];
                indiceMaior = i;
            }else{
                if (vet[i] < menor) {
                    menor = vet[i];
                    indiceMenor = i;
                }
            }
        }

        sc.close();

        for (int i = 0; i < 5; i++) {
            soma += vet[i];
        }

        media = soma/5;

        System.out.println("Os números digitados são: ");
        for (int i = 0; i < 5; i++){
            System.out.printf("%.0f ",vet[i]);
        }
        System.out.println("\nO maior valor é: " + maior + ", localizado na posição "+ indiceMaior + " do vetor");
        System.out.println("O menor valor é: " + menor + ", localizado na posição "+ indiceMenor + " do vetor");
        System.out.println("A média é: " + media);
    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[5];
        System.out.println("<< 5 valores >>");
        double maior = 0, menor = 0, media = 0, soma = 0, a = 0, dp = 0;

        System.out.printf("Entre com a nota do aluno 1:\n");
        vet[0] = sc.nextInt();
        maior = vet[0];
        menor = vet[0];
        for (int i = 1; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d:\n",i+1);
            vet[i] = sc.nextInt();
            if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        sc.close();

        for (int i = 0; i < 5; i++) {
            soma += vet[i];
        }
        
        media = soma/5;

        for (int i = 0; i < 5; i++) {
            a += java.lang.Math.pow((vet[i] + media), 2);
        }

        dp = Math.sqrt((a/5));

        for (int i = 0; i < 5; i++) {
            vet[i] = (vet[i] - media)/dp;
        }
        
        // normalizada = (vet[i] - media) / desvioPadrao 

        for (int i = 0; i < 5; i++){
            System.out.printf("\nA nota do aluno %d é %.0f ", i+1, vet[i]);
        }
    }

    public static void main(String[] args) {
        // ex01();
        // ex02();
        // ex03();
        // ex04();
        // ex05();
        // ex06();
        ex07();
    }


}
