/**
 * Create a method which accepts an array of integer elements&
 * return the second smallest element in the array
 * @author Dhana_nimmala
 *
 */
public class Excercise1 {
	public static int getSecondSmallest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[1];
		}  
		public static void main(String args[]){  
		int a[]={10,2,4,8,3,4};  
		System.out.println("Second smallest: "+getSecondSmallest(a,6));
		}
}