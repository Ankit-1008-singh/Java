import java.util.ArrayList;
public class ArrayList2 {
    // public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
    //     int temp=list.get(idx1);
    //     list.set(idx1,list.get(idx2));
    //     list.set(idx2,temp);
    //     System.out.println(list);
    // }
    public static void main(String args[]){
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(1);
        // list.add(3);
        // list.add(5);
        // list.add(6);
        // //swap
        // int idx1=1, idx2=3;
        // //befor swap
        // System.out.println(list);
        // Swap(list, idx1, idx2);
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);//12345
            list2.add(i*2);//246810
            list3.add(i*3);//3691215
        }
        mainlist.add(list1);
        mainlist.add(list2);
        mainlist.add(list3);
        System.out.println(mainlist);
        //nested loop
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }

        
    }
    
}
