public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(""); //starts at capacity 16
        s.reverse();
        System.out.println(s.capacity());
        s.append("D1d2d3d4d5d6d7d8d");
        System.out.println(s.capacity());
        System.out.println(s.capacity());
        //set the capacity initially
        StringBuilder t = new StringBuilder(100);
        System.out.println(t.capacity());
        //if you exceed capacity, it copies over the text to a new larger space, not so efficient!

        //append
        StringBuilder u = new StringBuilder("ABC");
        u.append("DEF"); //adds "DEF" at the end
        System.out.println(u);

        //trim to size
        StringBuilder v = new StringBuilder("ABC");
        System.out.println(v.capacity());
        v.trimToSize();
        System.out.println(v.capacity());

        String w = s.toString();
        

    }

}