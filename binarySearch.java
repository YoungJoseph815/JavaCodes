package practice;

public class binarySearch {

       public static void main(String[] args) {
        int[] arr={1,3,5,7,8};
        System.out.println(binarySearch(arr,1,8,3));
    }
    public static int binarySearch(int[] a, int beg, int end, int item) {
        int mid;
        if (end >= beg) {
            mid = (beg + end) / 2;
            if (a[mid] == item) {
            	return mid;
            	//return mid + 1;
            } else if (a[mid] < item) {
                return binarySearch(a, mid + 1, end, item);
            } else {
                return binarySearch(a, beg, mid - 1, item);
            }
        }
        return -1;
    }

}
