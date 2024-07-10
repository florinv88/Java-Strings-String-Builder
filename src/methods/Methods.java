package methods;

public class Methods {
    public static void main(String[] args) {

        // Official documentation : https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#compareTo-java.lang.String-

        String string  = "Helllo";
        String string2 = " guys!";

        char firstChar = string.charAt(0);
        int length = string.length();

        /**
         * .compareTo compare lexicographically
         * ! A < a
         * returns -1 if the first string is smaller than the second one
         * (each character from the first string with the second string)
         * (alphabetically)
         */
        int result = string.compareTo(string2);

        String string4 = string.concat(string2);

        boolean containsCharSeq = string.contains("lo");

        boolean isEmpty = string.isEmpty();
        boolean isBlank = string.isBlank();

    }
}
