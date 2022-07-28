package constants;

/**
 * @author Kapil Suryawanshi
 * 28/07/2022
 */
public class FrameworkConstants {
	/**
	 * Private constructor to avoid external instantiation
	 */
	private FrameworkConstants() {
	}
	private static final String TEST_DATA_DIR = "src/test/resources/testData/";


	public static String getTestDataDirPath() {
		return TEST_DATA_DIR;
	}


}