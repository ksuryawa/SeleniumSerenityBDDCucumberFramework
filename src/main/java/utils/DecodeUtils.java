package utils;

import java.util.Base64;

/**
 * @author Kapil Suryawanshi
 * 28/07/2022
 */
public class DecodeUtils {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private DecodeUtils() {
	}

	public static String getDecodedString(String encodedString) {
		return new String(Base64.getDecoder().decode(encodedString.getBytes()));
	}

}