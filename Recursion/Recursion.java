
public class Recursion {

	public static int cnt = 0 ;
	
	static void func() {
		if(cnt>5) return;
		cnt++;
		System.out.println(cnt);
		func();
	  }

	  public static void main(String[] args) {
	    func();
	  }
}
