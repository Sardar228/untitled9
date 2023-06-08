
 class Main {
     public static void main(String[] args) {
         double[] Number = {1.2, 4.2, 6.5, 5.6, 8.5, 3.4, 9.8, 5.4, 3.3, 2.4, 1.3, 6.7, 5.4, 8.7, 5.9};

         double sum = 0;

         for (double i = 0; i < Number.length; i++) {
             double v = i;
             sum += Number[(int) v];
         }
         System.out.println(+sum / 15);

         {


         }
         int[] numbers = {-7, -4, -2, 2, 3, 6, 8};
         printArray(numbers);
         SelectionSort(numbers);
         printArray(numbers);

     }

     public static void printArray(int[] array) {
         for (int i = 0; i < array.length; i++) {
             System.out.print(array[i] + "");
         }
     }

     public static void SelectionSort(int[] array) {
         for (int i = 0; i < array.length; i++) {
             int min = array[i];
             int min_i = i;
             for (int j = 1; j < array.length; j++) {
                 if (array[j] < min) {
                     min = array[j];
                     min_i = j;
                 }
             }
             if (i != min_i) {
                 int tmp = array[i];
                 array[i] = array[min_i];
                 array[min_i] = tmp;
             }
         }
     }
 }