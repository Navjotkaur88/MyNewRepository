package Arrays;

public class charArray {
    public static void main(String[] args){


        String s1 = "test";
        String s2 = "test";
        String s3 = new String("test");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3)); // created new object in heap

    }
    // character of Array is String
    //strings are immutable
    // SCP string constant pool - in heap
    // == ref, content
    //.equals- content, we create obect and then putting content in it

}
