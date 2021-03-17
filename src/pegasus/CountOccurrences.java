package pegasus;

public class CountOccurrences {

	public static void main(String[] args) {
		String InputStr = "ABCDCDC";         
        String OccStr = "CDC";         
        System.out.println(countFreq(OccStr, InputStr));   
	}
	
	static int countFreq(String OccStr, String inputStr) {         
        int findingStr = OccStr.length();         
        int strLength = inputStr.length();         
        int result = 0; 
        for (int i = 0; i <= strLength - findingStr; i++) { 
            int j;             
            for (j = 0; j < findingStr; j++) { 
                if (inputStr.charAt(i + j) != OccStr.charAt(j)) { 
                    break; 
                } 
            } 
            if (j == findingStr) {                 
                result++;                 
                j = 0;                 
            }             
        }         
        return result;         
    } 

}
