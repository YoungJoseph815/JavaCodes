package practice;

public class binarySearch {

    public static void main(String[] args) {

        int[] arr={0,2,4,6,8,9};

        System.out.println(binarySearch(arr,0,9,8));


    }


    public static int binarySearch(int[] a,int low,int high,int key)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(a[mid]<key)
            {
                low=mid+1;
            }
            else if(a[mid]>key)
            {
                high=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;                //key not found
    }
}
