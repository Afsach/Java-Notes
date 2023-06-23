public class SubArrays {

    public static void totalSubArrays(int arr[]){
        int totalPairs = 0;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=start; j<arr.length; j++){
                int end= j;
                for(int k=start; k<=end; k++ ){
                    System.out.print(k + " ");
                }
                totalPairs++;
                System.out.print('\t');
            }
            System.out.println();
        }
            System.out.println("Total Pairs = " + totalPairs);
    }


    public static void main(String args[]){
         int arr[] = {3, 5, 65, 78, 23, 45, 34};
         totalSubArrays(arr);
    }
}


// totalSubarray = n(n+1)/2