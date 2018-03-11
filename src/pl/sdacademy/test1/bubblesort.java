package pl.sdacademy.test1;

public class bubblesort {

    public static void main(String[] args) {
        int[] tablica = {5, 4, 2, 9, 2, 4, 7, 3, 12, 55, 43, 11};
        System.out.println("Elementy tablicy: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println("\n");
        bubbleSort(tablica);
    }

    private static void bubbleSort(int[] tablica) {
        int i, j, tymczasowa;
        for (i = 0; i < tablica.length - 1; i++) {
            for (j = 0; j < tablica.length - 1; j++) {
                if (tablica[j] > tablica[j + 1]) {
                    tymczasowa = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = tymczasowa;
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        for (i = 0; i < tablica.length; i++) System.out.print(tablica[i] + " ");

    }
}


