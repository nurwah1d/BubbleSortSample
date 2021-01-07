package id.enura;

public class Main {

    public static void main(String[] args) {
        // TODO: Deklarasi
        int[] data = {12, 31, 42, 14, 35, 48, 21, 26, 17, 19};

        System.out.print("Data awal = ");
        for (int d: data) System.out.print(d + "  ");

        System.out.println("\nBanyak elemen = " + data.length);

        // TODO: Bubble sort Ascending
        for (int i=0; i < data.length; i++) {

            for (int j=0; j < data.length - 1; j++) {
                // TODO: Jika nilai di indeks j lebih besar dari j+1, tukar nilai
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        System.out.println();

        // TODO: Tampilkan data setelah urut
        System.out.print("\nData Bubble sort ASC = ");
        for (int d: data) System.out.print(d + "  ");

        // TODO: Bubble sort Descending
        for (int i=0; i < data.length; i++) {

            for (int j=0; j < data.length - 1; j++) {

                if (data[j] < data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }

        // TODO: Tampilkan data setelah urut
        System.out.print("\nData Bubble sort DSC = ");
        for (int d: data) System.out.print(d + "  ");

    }
}
