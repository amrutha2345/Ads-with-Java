import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {
		Stack <String> st= new Stack<>();
		st.push("Amrutha");
		st.push("Cherry");
		st.push("Swathi");
		System.out.println(st);
		String poppedElement= st.pop();
		System.out.println(poppedElement);
		System.out.println(st);
		String topEle= st.peek();
		System.out.println(topEle);
		boolean Em = st.isEmpty();
		System.out.println(Em);
	}

}
