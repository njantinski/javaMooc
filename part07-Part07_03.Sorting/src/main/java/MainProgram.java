
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(smallest(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
       
        for(int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    
    public static int indexOfSmallest(int[] array){
    // write your code here
        int index = 0;
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int smallest = table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i < table.length; i++){
            if(smallest > table[i]){
                index = i;
                smallest = table[i];
            }
        }
        return index;
    }
    
    
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    
    public static void sort(int[] array) {
       for(int i = 0; i < array.length - 1; i++){
           int indexOfSmallest = indexOfSmallestFrom(array,i);
           if(indexOfSmallest != i){
               swap(array,indexOfSmallest,i);
           }
       }     
    }
}
