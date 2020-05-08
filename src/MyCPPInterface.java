
import com.sun.jna.Library;

public interface MyCPPInterface extends Library {
	//For CLibrary from Windows.
//	MyCPPInterface INSTANCE = (MyCPPInterface) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"), MyCPPInterface.class);
//    void printf(String format, Object... args);
//    int sprintf(byte[] buffer, String format, Object... args);
//    int scanf(String format, Object... args);
	
	int Add(int a, int b);
	
	
}