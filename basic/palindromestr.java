public class palindromestr{
    public static void main(String[] args) {
        String s = "sunny";
        String a=s;
        String rev = "";
        for(int i=(s.length()-1);i>=0;i--){
            rev = rev + s.charAt(i);

        }
       if(rev.toLowerCase().equals(a.toLowerCase())){
            System.out.println(a+" is a palindrome string");
        }
        else{
            System.out.println(a+" is not a palindrome string");
        }
    }
}