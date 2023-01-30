package Arrays;

import java.util.Arrays;

public class Number7 {

	public static void main(String[] args) {
// Example 1 : [0, 2, 3, 12, 0] sifirlari en sona koyunuz
    
        
		int orjinal[]={0, 2, 3, 12, 0};
        
		
		int yeni[]=new int[orjinal.length];
        
		int idx=0;
        
        for(int i=0; i< orjinal.length; i++) {
            if (orjinal[i]!=0){
                yeni[idx]=orjinal[i];
                idx++; }
        }
        System.out.println(Arrays.toString(yeni));//[2, 3, 12, 0, 0]

	}

}
