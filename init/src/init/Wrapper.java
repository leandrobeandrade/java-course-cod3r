package init;

public class Wrapper {

	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		Integer in = 10_000;
		Long l = 100_000L;
		Float f = 123.00F;
		Double d = 1234.5678;
		Character cha = 'a';
		Boolean bol = Boolean.parseBoolean("true");
		
		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.println(in.intValue());
		System.out.println(l.longValue());
		System.out.println(f.floatValue());
		System.out.println(d);
		System.out.println(cha.charValue());
		System.out.println(bol);
	}

}
