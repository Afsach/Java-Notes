public class PossiblePairs {

    public static void printPairs(int arr[]){

        int totalPairs = 0;
        for(int i=0; i<arr.length; i++){
            int current = arr[i];  // 3,5,6,8,2,5,7
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ")" + " ");
                totalPairs++;
            }
            System.out.println();
        }
         System.out.println("Total Possible pairs = " + totalPairs);
    }


    public static void main(String args[]){
        int arr[] = {3, 5, 6, 8, 2, 5, 7};
        printPairs(arr);
    }
}

// total pairt =  n(n+1)/2