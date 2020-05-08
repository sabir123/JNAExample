import com.sun.jna.Native;

public class JNAExample {
    public static void main(String args[]) {
    	
    	new JNAExample().doNativeCall();
    	
//    	MyCPPInterface jnaLib = MyCPPInterface.INSTANCE;
//    	int a = 10 ; int b = 30;
//        jnaLib.printf("Hello World \n Value of a is %d \n Value of b is %d \n ", a , b);
//        String testName = null;
//
//        for (int i = 0; i < args.length; i++) {
//            jnaLib.printf("\nArgument %d : %s", i, args[i]);
//        }
    }
    
	private void doNativeCall() {
		try {
			System.load(System.getProperty("user.dir") + "\\mydlls\\add.dll");
			MyCPPInterface cppCodeClass = (MyCPPInterface) Native.loadLibrary("add", MyCPPInterface.class);
			System.out.println("JNAExample.main(DLL LOADED)");
			int res = cppCodeClass.Add(10, 90);
			System.out.println("JNAExample.main()" + res);
		} catch (UnsatisfiedLinkError e) {

			System.err.println("Native code library failed to load.\n" + e);
		}
	}
}