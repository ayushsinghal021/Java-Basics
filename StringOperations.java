public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Check if strings are equal
        boolean isEqual = str1.equals(str2);
        System.out.println("Strings are equal: " + isEqual);

        // Reverse the string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("Reversed string: " + reversed);

        // Change case
        String upperCase = str1.toUpperCase();
        String lowerCase = str2.toLowerCase();
        System.out.println("Upper case: " + upperCase);
        System.out.println("Lower case: " + lowerCase);
    }
}