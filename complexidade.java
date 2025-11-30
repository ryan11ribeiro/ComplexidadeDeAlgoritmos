
    public class complexidade {

    // O(1) – constante
    public static int acessoConstante(int[] arr) {
        return arr[0];
    }

    // O(n) – linear
    public static int buscaLinear(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // O(log n) – logarítmica (busca binária)
    public static int buscaBinaria(int[] arr, int x) {
        int inicio = 0, fim = arr.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (arr[meio] == x) return meio;
            else if (arr[meio] < x) inicio = meio + 1;
            else fim = meio - 1;
        }
        return -1;
    }

    // O(n²) – quadrática
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 8, 10, 15, 20};

        System.out.println("Acesso constante O(1): " + acessoConstante(arr));

        System.out.println("Busca linear O(n): " + buscaLinear(arr, 10));

        System.out.println("Busca binária O(log n): " + buscaBinaria(arr, 10));

        int[] baguncado = {5, 3, 8, 1, 9};
        bubbleSort(baguncado);
        System.out.print("Bubble Sort O(n²): ");
        for (int n : baguncado) System.out.print(n + " ");
    }
}

