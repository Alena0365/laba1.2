import java.util.Scanner;
public class Palindrome {
    public static int InputNum(){
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        return num;
    }
    public static String InputStr(){
        Scanner in=new Scanner(System.in);
        String num=in.next();
        return num;
    }
    public static void main(String[]args)
    {
        System.out.println("Введите количество слов: ");
        String []mas=new String[InputNum()];
        System.out.println("Введите слова: ");
        for (int i=0;i<mas.length;i++){
            mas[i]=InputStr();
        }
        for (int i=0; i<mas.length;i++)
        {
            String s = mas[i];
            String sreverse= reverseString(s);
            if (isPalindrome(s,sreverse)==true)
            {
                System.out.println("Полиндром: " + s);
            }
        }
    }
    public static String reverseString(String s)
    {
        String empty="";
        for(int i=s.length()-1;i>=0;i--)
        {
            empty+= s.charAt(i);
        }
        return empty;
    }
    public static boolean isPalindrome(String s, String sreverse)
    {
     sreverse=reverseString(s);
     if(s.equals(sreverse))
     {
         return true;
     }
     return false;
    }
}
