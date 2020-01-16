package Airport;
/**
 * 
 * Search and sort arrays....
 * 
 * @author: Victor Pereira
 * @version: 15/01/2020
 * 
 */

public class FindCode3{

    public static String FindAirportLinear(Airport_ airports[], String ToFind){

        for (int k = 0; k < airports.length; k++){
            if (airports[k].getName().equals(ToFind)){
                return airports[k].getCode3();
            }
        }

        return null;
    }

    //Search code of  city airport using Binary Search concept
    public static String FindAirportBinary(Airport_ airports[], String ToFind){

        int final_index = airports.length, begin_index = 0;

    
        while(begin_index <= final_index){    
            int middle_index = begin_index + ((final_index - begin_index) / 2);
                        
            if(ToFind.compareTo(airports[middle_index].getCity()) > 0){
                begin_index = middle_index + 1;
            }
            
            else if (ToFind.compareTo(airports[middle_index].getName()) < 0){
                final_index = middle_index -1;
            }
            
            else{
                return airports[middle_index].getCode3();
            }
        }

        return null;
    }

    public static void Swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void selectionSort(int[] array){

        for(int k = 0; k < array.length - 1; k++){
            int min = k;
            
            for(int j = k + 1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }

            Swap(array, k, min);

        }
    }

    public static void bubbleSort(int[] array){

        for (int k = 0; k < array.length; k++){
        	for(int j = 0; j < array.length -k -1; j++) {
        		if(array[j] > array[j+1]) {
        			Swap(array, j, j+1);
        		}
        	}
        }

    }
    
    public static void insertionSort(int[] array) {
    	
    	for (int k = 1; k < array.length; k++) {
    		int curr_index = k;
    		
    		while(curr_index > 0 && array[curr_index] < array[curr_index - 1]) {
    			Swap(array, curr_index, curr_index - 1);
    			curr_index--;
    		}
    	}
    }



    public static void main(String[] args) {
        int[] array = {2, 3, 5, 3, 11, 1, 46,99,14};
        insertionSort(array);
        
        for (int k = 0; k < array.length; k++)
            System.out.println(array[k]);
    }
}