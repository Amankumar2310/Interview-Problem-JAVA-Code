import java.util.*;

class Extract{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str.replaceAll("[^0-9]",""));
    }
}
