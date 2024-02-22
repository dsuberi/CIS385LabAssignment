import java.util.Arrays;

class BinarySearch{

    int left, right, mid;

    public int search(int[] a, int len, int x){
        left = 0;
        right = len - 1;

        while(left <= right){
            mid = (left+right)/2;

            if(a[mid] == x)
                return mid;
            else if(x < a[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;
    }
}

class binary{
    public static void main(String[] args){
        BinarySearch BS = new BinarySearch();

        int[] arr = {5,3,7,1,8,9,32};

        Arrays.sort(arr);

        int search_value = 22;

        int length = arr.length;
        
        int found = BS.search(arr, length, search_value);

        if(found == -1)
            System.out.print("Not Found");
        else
            System.out.print("Found at index: " + found);
   }
}