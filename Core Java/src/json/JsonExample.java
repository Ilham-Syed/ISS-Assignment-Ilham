package json;
import org.json.JSONArray;
import org.json.JSONObject;

//Demonstrates creating and parsing JSON in Java using org.json
/**
 * downloaded the JAR from https://mvnrepository.com/artifact/org.json/json and added it to classpath.
 */
public class JsonExample {
	public static void main(String[] args) {
        //Creating a JSON Object
        JSONObject student = new JSONObject();
        student.put("name", "Ilham");
        student.put("age", 21);
        student.put("college", "VESIT");

        JSONArray skills = new JSONArray();
        skills.put("Java");
        skills.put("Python");
        skills.put("Machine Learning");

        student.put("skills", skills);

        // Printing the JSON Object as String
        System.out.println("Generated JSON:");
        System.out.println(student.toString(2)); 

        String jsonStr = """
                {
                    "name": "Rishi",
                    "age": 22,
                    "interests": ["Blockchain", "MERN Stack", "Gym"]
                }
                """;

        JSONObject parsed = new JSONObject(jsonStr);

        // Accessing values from parsed JSON
        System.out.println("\nParsed JSON:");
        System.out.println("Name: " + parsed.getString("name"));
        System.out.println("Age: " + parsed.getInt("age"));
        System.out.println("First Interest: " + parsed.getJSONArray("interests").getString(0));
    }
}
