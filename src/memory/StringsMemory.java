package memory;


public class StringsMemory {
    public static void main(String[] args) {
        /**
         * string1 and string2 will have 2 references on stack
         * that will refer to the same string object from string pool
         */
        String string1 = "Hello";
        String string2 = "Hello";
        String string4 = """
                Hello""";

        /**
         * string3 is build using the constructor
         * the reference of the object in this case will not point to string pool
         */
        String string3 = new String("Hello");


        System.out.println(string1 == string2);  //true
        System.out.println(string1 == string3);  //false

        /**
         * .equals method for strings compare each character of the strings
         */
        System.out.println(string1.equals(string3));

    }

}
