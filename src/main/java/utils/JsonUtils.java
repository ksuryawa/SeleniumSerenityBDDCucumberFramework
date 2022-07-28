package utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Kapil Suryawanshi
 * 27/07/2022
 */
public class JsonUtils {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private JsonUtils() {
	}

	public static String readJson(String jsonFilePath, String key) {
		String value = null;
		
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader(jsonFilePath)) {
			//Read JSON file
			Object obj = jsonParser.parse(reader);

			//Get JSONObject from JSON file
			JSONObject jsonObject = (JSONObject) obj;

			//Get value from key
			value = (String) jsonObject.get(key);
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

		return value;
	}
}