public class Sorter {
    public static void main(String args){
<<<<<<< HEAD
        public static void sort(int[] array){
            selectionSort({2,10,25,9,28});
        }
        
=======
        public void sort (Array[] arr){
            insertionSort({1,10,15,7,9});
        }
>>>>>>> d49887e0916ee0e3df5848c6eac7d67dcbc5fcae
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
<<<<<<< HEAD


=======
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
    }
>>>>>>> d49887e0916ee0e3df5848c6eac7d67dcbc5fcae
}
