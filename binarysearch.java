
public class binarysearch {
    public static int binarysrch(int a[],int key){
        int start=0, end=a.length;
        while(start<=end){
            int mid=(start+end)/2;
            //comparision
            if(a[mid]==key){
                return mid;
            }
            else if(a[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
        
    }
    public static void main(String args[]){
        int a[]={2,4,6,8,10,12,14};
        int key=12;
        System.out.println("Element found at index: "+binarysrch(a,key));
    }
}
