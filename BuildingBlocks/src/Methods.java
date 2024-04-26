
public class Methods {
	
	static int s1=100;
	int s2=1000;
	static void staticMethod() {
		System.out.println(Methods.s1);
	}
      void nonStaticMethod() {
    	  System.out.println(s2);
    	  System.out.println(Methods.s1);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Methods.staticMethod();
      Methods method=new Methods();
      method.nonStaticMethod();
	}

}
