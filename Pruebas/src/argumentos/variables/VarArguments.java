package argumentos.variables;

public class VarArguments {
	
	public static void foo(int i, String... strings) {
		for(String s:strings)
			System.out.println(s);
	}

	public static void main(String[] args) {
		foo(2, "ddd","aaa","a","b");
		System.out.println("-------------------------------------------------");
		foo(2, "1","2","3","4");
		System.out.println("-------------------------------------------------");
		foo(7,new String[] {"One String","Two Strings"});
	}

}
