public class Main {
    public static void main(String[] args) {
        //ImmutableStrings();
        MutableStrings();
    }

    public static void MutableStrings() {
        StringBuffer sb = new StringBuffer("Joy"); // It is thread-safe, synchronized but slower
        sb.append(" Saha");

        StringBuilder sbuild = new StringBuilder(sb); // It is not thread-safe, not synchronized but faster
        sbuild.append(" Engineer");

        System.out.println(sb);
        System.out.println(sbuild);

        System.out.println(sb.equals(sbuild)); // false
    }


    public static void ImmutableStrings() {
        String name = "Joy"; // creates an object
        name = name + " Saha"; // creates new object because by default java string is immutable.

        System.out.println(name);

        // here, it creates only one object as the name is same.
        String s1 = "Joy";
        String s2 = "Joy";
        String s3 = new String("Joy");

        System.out.println(s1 == s2); // == operator compares reference or memory location of objects in a heap, whether they point to the same location or not.
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2)); // .equals() evaluates to the comparison of values in the objects.
        System.out.println(s1.equals(s3));
    }
}
