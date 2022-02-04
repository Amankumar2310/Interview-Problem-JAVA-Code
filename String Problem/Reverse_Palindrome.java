import java.util.*;

class Palindrome{
    static boolean isPalindrome(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    
    static String reverse(String str)
    {
        int n=str.length();
        if(n==0)
          return "";
        else
          return(str.charAt(n-1)+reverse(str.substring(0,n-1)));
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        while(isPalindrome(Integer.toString(num))!=true)
        {
            num=num+Integer.parseInt(reverse(Integer.toString(num)));
        }
        System.out.println(num);
    }
}
