
package pegasus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int array[] = {1, 2, 4, 1, 2, 3, 5, 7, 4, 3};
		List<Integer> list = new ArrayList<>();
		List<Integer>  longestList = new ArrayList<>();
        int currentMax;
        int highestCount = 0;
        for(int i = 0; i < n;i++)
        {
            currentMax = Integer.MIN_VALUE;
            for(int j = i;j < n; j++)
            {
                if(array[j] > currentMax)
                {
                    list.add(array[j]);
                    currentMax = array[j];
                }
            }
             
            if(highestCount < list.size())
            {
                highestCount = list.size();
                longestList = new ArrayList<>(list);  
            }   
            list.clear();
        } 
        System.out.println(highestCount);
    }
}
