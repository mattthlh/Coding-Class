public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6 };
        System.out.println(binarySearch(arr, 0, arr.length -1, 4));
    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        int mid = (l + r) / 2;
        if (r >= l) {
            if (x == arr[mid]) {
                return mid;
            } else if (x < arr[mid]) {
                return binarySearch(arr, l, mid - 1, x);
            } else if (x > arr[mid]) {
                return binarySearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }
}
