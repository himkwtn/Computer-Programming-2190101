public class TypeCheck{
	public static void main(String[] args) {
		System.out.println(Java101.typeOf(10.0/2.5) + ":" + (10.0/2.5) );
		System.out.println(Java101.typeOf("1"+2+3) + ":" + ("1"+2+3) );
		System.out.println(Java101.typeOf(1+"2"+3) + ":" + (1+"2"+3) );
		System.out.println(Java101.typeOf(3/4*4) + ":" + (3/4*4) );
		System.out.println(Java101.typeOf(3.0/4*4) + ":" + (3.0/4*4) );
		System.out.println(Java101.typeOf((int)1.5) + ":" + ((int)1.5) );
		System.out.println(Java101.typeOf(1+1.0F+1.0) + ":" + (1+1.0F+1.0) );
		System.out.println(Java101.typeOf(4-5==3-4) + ":" + (4-5==3-4) );
		System.out.println(Java101.typeOf((int)(4-5.5)==3-4) + ":" + ((int)(4-5.5)==3-4) );
	}
}