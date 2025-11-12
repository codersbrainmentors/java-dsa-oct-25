public class GenerateSubSetArray {

    static void genSubSet(int arr[], int index, String result) {
        for (int i = index; i < arr.length; i++) {
            System.out.println(result + arr[i]);
            genSubSet(arr, i + 1, result + arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        genSubSet(arr, 0, "");
    }
}
