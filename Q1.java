import java.util.LinkedHashSet;

public class Q1 {
    
    /** 
     * @summary Forms two hashsets to find and display the union, difference, and intersection of both sets.
     * @param args
     */
    public static void main(String[] args) {
        LinkedHashSet<String> S1 = new LinkedHashSet<String>();
        LinkedHashSet<String> S2 = new LinkedHashSet<String>();
        S1.add("George");
        S1.add("Jim");
        S1.add("John");
        S1.add("Blake");
        S1.add("Kevin");
        S1.add("Michael");
        
        S2.add("George");
        S2.add("Katie");
        S2.add("Kevin");
        S2.add("Michelle");
        S2.add("Ryan");

        LinkedHashSet<String> unionSet = new LinkedHashSet<String>(S1);
        LinkedHashSet<String> differenceSet = new LinkedHashSet<String>(S1);
        LinkedHashSet<String> intersectionSet = new LinkedHashSet<String>(S1);
        
        unionSet.addAll(S2);
        differenceSet.removeAll(S2);
        intersectionSet.retainAll(S2);

        System.out.println("\nunionSet: " + unionSet);
        System.out.println("\ndifferenceSet: " + differenceSet);
        System.out.println("\nintersectionSet: " + intersectionSet);

    }
}