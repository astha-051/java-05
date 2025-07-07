public class parstring{
	public static void main(String[]args)
	{
		byte b1=Byte.parseByte("10");
		short s1=Short.parseShort("40");
		int i=Integer.parseInt("50");
		long l=Long.parseLong("80");
		float f=Float.parseFloat("80.5000");
		double d=Double.parseDouble("40.555");
		boolean b=Boolean.parseBoolean("true");
		// char c=Character.parseCharacter('a');

		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		// System.out.println(c);
	}
}