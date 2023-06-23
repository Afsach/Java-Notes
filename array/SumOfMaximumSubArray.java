public class SumOfMaximumSubArray {

    public static void totalSubArrays(int arr[]){
        int totalPairs = 0;
        int currentSum = 0;
        int MaximumSum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=start; j<arr.length; j++){
                int end= j;
                for(int k=start; k<=end; k++ ){
                    currentSum += k;
                }
                totalPairs++;
               if(MaximumSum < currentSum){
               }
                MaximumSum = currentSum;
            }
        }
            System.out.println("Total Pairs = " + totalPairs);
            System.out.println("Sum of Maximum subArray = " + MaximumSum);
    }


    public static void main(String args[]){
         int arr[] = {3, 5, 65, 78, 23, 45, 34};
         totalSubArrays(arr);
    }
}


// totalSubarray = n(n+1)/2