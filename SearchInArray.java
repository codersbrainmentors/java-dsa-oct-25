public class SearchInArray {

    static int countOcc(int arr[], int index, int search) {
        if (index == arr.length) {
            return 0; // count = 0
        }
        int count = countOcc(arr, index + 1, search);
        if (arr[index] == search) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 20, 90, 100, 20, 88, 20 };
        int search = 20;
        int count = countOcc(arr, 0, search);
        System.out.println("Count is " + count);
    }

}
