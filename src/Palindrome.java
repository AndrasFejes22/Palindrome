public class Palindrome {

    public static void main(String[] args) {
        // Develop a program that checks if a string entered by a user is palindrome.
        //(A palindrome is a word that reads the same forwards as backwards. An example is “racecar” or “madam”.)

        isPalindrom("racecar");
        isPalindrom("programming");

    }
    public static boolean isPalindrom(String str) {

        System.out.println("the word: " + str);

        StringBuffer sb = new StringBuffer();

        sb.append(str);

        StringBuffer str2 = sb.reverse();

        //System.out.println("str: "+str2);

        String str3 = str2.toString();
        
        if(str.equals(str3)) {
            System.out.println("This is palindrom");
            return true;
        }else {
            System.out.println("This is not a palindrom, because the reverse is: " + str2);

            return false;
        }
    }
}
