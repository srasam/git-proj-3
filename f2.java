import java.util.*;
class SwapNumbers{
    static int num_count;
    static int temp;
    public static void ascending_sort(int []a){
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    }
                }
            }
            System.out.println("Numbers sorted in ascending order: ");
            for(int i=0;i<num_count-1;i++){
                System.out.print(a[i] + " ");
                }
                System.out.println(a[num_count - 1]);
    }
    
    public static void desending_sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
                
            }
            
        }
        System.out.println("Numbers sorted in decending order: ");
    for (int i = 0; i < a.length; i++) {     
            System.out.print(a[i] + " ");    
        }
    }
    public static void main(String args[])
    {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements you want to sort");
        num_count=sc.nextInt();
        
        int []arr=new int[num_count];
        System.out.println("Enter the numbers to be sorted");
        for(int i=0;i<num_count;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("To sort in ascending order enter 1 and To sort by decending enter 2:");
        int choice=sc.nextInt();
        sc.close();

        
        switch(choice){
            case 1:
            ascending_sort(arr);
            break;

            case 2:
            desending_sort(arr);
            break;
        }


    }
        
}
