package day_09;

public class StringBuilderAndBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      StringBuilder is mutable
        StringBuilder s=new StringBuilder("niki");
		s.append("ta");
		s.delete(2, 5);
		s.insert(2, 't');
		s.reverse();
        System.out.println(s);
        
//        StringBuffer is mutable
        StringBuffer n=new StringBuffer("Wel");
        n.append("come");
        System.out.println(n);
        
	}

}
