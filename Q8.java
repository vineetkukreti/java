package vineet78;

public class Q8
{
//function to find longest run in the array
public static int longestRun(int[] nums)
    {
            int run = 1, maxRun = 1;
            
            //for empty array
            if(nums.length==0)
            {
                    return 0;
            }
            
            //iterate through an array
            for(int i=1;i<nums.length ; i++ )
            {
                //if previous is same as currunt element then increment run by 1
                    if(nums[i]==nums[i-1])
                    {
                            run++;
                    }
                    else
                    {
                            if(run>maxRun)
                            {
                                    maxRun=run;
                                    run=1;
                            }
                    }
            }
            //find largest maxRun
            if(run>maxRun)
            {
                    maxRun=run;
                    run=1;
            }
            return maxRun;  
    }
    
    static void display_array(int arr[])
    {
    	for(int i = 0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
    
    public static void main(String[] args) {
            int[] arr1 = new int[]{4, 12, 4, 4};
            display_array(arr1);
            System.out.println("      		 : "+longestRun(arr1));
            
            int[] arr2 = new int[]{10, 10, 10};
            display_array(arr2);
            System.out.println("      		 : "+longestRun(arr2));
            
            int[] arr3 = new int[]{0, 20, 5, 10, 10, 18};
            display_array(arr3);
            System.out.println(" 	 : "+longestRun(arr3));
            
            int[] arr4 = new int[]{5, 5, 3, 3, 3, 3, 7, 7, 7};
            display_array(arr4);
            System.out.println("       : "+longestRun(arr4));
            
            int[] arr5 = new int[]{12, 8, 17};
            display_array(arr5);
            System.out.println(" 		 : "+longestRun(arr5));
            
            int[] arr6 = new int[]{32};
            display_array(arr6);
            System.out.println(" 			 : "+longestRun(arr6));
            
            int[] arr7 = new int[]{};
            display_array(arr7);
            System.out.println(" 			 : "+longestRun(arr7));
            System.out.println("\nName : Vineet Kukreti\nStudent Id : 20011316\nROll No : 78");
    }
}
