package stringBuilder;

public class StringBuilderExample {

    public static void main(String[] args) {
        /**
         * StringBuilder allow us to create a non-immutable string
         * - the instances are not stored in string pool
         */
        StringBuilder s = new StringBuilder();

        for (int i = 0 ;i<1000;i++)
        {
            s.append(i);
        }
        System.out.println(s);

    }
}
