package task;

public class StringBuffDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer stb=new StringBuffer();
		System.out.println(stb.capacity());
		stb.append("Mangesh");
		System.out.println(stb);
		stb.ensureCapacity(70);
		System.out.println(stb.capacity());
		stb.append(" Mukund Wandre");
		System.out.println(stb);
		stb.delete(0, 8);
		System.out.println(stb);
		stb.insert(0, "Mangesh ");
		System.out.println(stb);
		stb.replace(0, 8, "'");
		stb.replace(14, 15, "'");
		System.out.println(stb);
		stb.reverse();
		System.out.println(stb);
	}

}
