public class BinarySearchKey {

    public static int searchKey(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {3, 5, 65, 78, 23, 45, 34};
        int key = 45;
        int index = searchKey(arr, key);
        if (index >= 0) {
            System.out.print("Element found at index : " + index + ".");
        } else {
            System.out.print("Not Found");
        }
    }
}
