import java.util.ArrayList;
public class ArrayListExample {
public static void main(String[] args) {
        
ArrayList<String>cse= new ArrayList<>();

cse.add("Amrutha");
cse.add("Cherry");
cse.add("Swathi");
System.out.println("Element at index 0: " + cse.get(0)); 
System.out.println("Elements in the ArrayList:");
        for (String friends: cse) {
System.out.println(friends);
        }

System.out.println("replace item");
cse.set(2,"Chandu");
for (String friends: cse) {
        System.out.println(friends);
                }

                
System.out.println(cse.isEmpty());
System.out.println(cse.size());
cse.remove("Aparna");
System.out.println("Size of ArrayList after removal: " + cse.size()); 
    }
}
