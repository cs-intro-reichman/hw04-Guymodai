public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lower_case = "";
        for(int i = 0 ; i< str.length() ; i++)
            {
                int value = (int)(str.charAt(i));
                if(value >= 65 && value <= 90 )
                    {
                        value = value + 32;
                        lower_case = lower_case + (char)(value);
                    }
                    else
                        {
                           lower_case = lower_case + str.charAt(i);
                        }
            }
        return lower_case;
    }
 
    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str1.length() < str2.length())
            {
                return false;
            }
        for(int i = 0 ; i < str1.length(); i++)
            {
                int counter = 0, j = 0;
                while( i + j< str1.length() && j < str2.length() && str1.charAt(i+j) == str2.charAt(j))
                    {
                        counter++;
                        j++;
                    }
                 if(counter == str2.length())
                    {
                        return true;
                    }   
            }
        return false;
    }
}
