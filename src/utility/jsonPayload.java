package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class jsonPayload {

	public static String body = null;

	public static String jsonToString(String name, String isbn, int aisle, String author) {

		body = "{\r\n" + "\"name\":\"" + name + "\",\r\n" + "\"isbn\":\"" + isbn + "\",\r\n"
				+ "\"aisle\":\"" + aisle + "\",\r\n" + "\"author\":\"" + author + "\"\r\n" + "}";

		return body;
	}

	public static String jsonToString(String path) throws IOException {

		try {
			body = new String(Files.readAllBytes(Paths.get(path)));
			return body;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
