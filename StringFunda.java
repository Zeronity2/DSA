public class StringFunda{
    public static void main(String[] args) {

        String str = "Programming";

        // 1. Length
        System.out.println("Length: " + str.length());

        // 2. First character
        System.out.println("First character: " + str.charAt(0));

        // 3. Last character
        System.out.println("Last character: " + str.charAt(str.length() - 1));

        // 4. Print every character
        System.out.println("Characters:");

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // 5. Uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 6. Lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 7. Comparing Strings
        String str2 = "Programming";

        System.out.println("Are strings equal? " + str.equals(str2));
    }
}