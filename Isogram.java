import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws Exception
	 {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while(testCase-- > 0)
        {
            String data = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.isIsogram(data)?"1":"0");
            
        }
	 }
} } 





class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        boolean check=true;
        HashMap<Character,Integer> al=new HashMap<Character,Integer>();
        for(int i=0;i<data.length();i++)
        {
            char c=data.charAt(i);
            if(al.containsKey(c))
            {
                return false;
            }
            else{
                al.put(c,1);
            }
        }
        
        return true;
    }
}