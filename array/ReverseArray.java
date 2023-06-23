public class ReverseArray {
    public static void reverseArray(int arr[]){
        int first=0, last=arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }





    public static void main(String args[]){
        int arr[] = {3, 5, 65, 78, 23, 45, 34};
        reverseArray(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}