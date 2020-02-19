import org.json.simple.JSONObject;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;

public class Readjsonfile {
    public String readjson() {
        JSONParser parser = new JSONParser();
        String values = "";

        try {
            Object obj = parser.parse(new FileReader("File/jsonfile.json"));
            JSONObject jsonObject = (JSONObject) obj;
            values = jsonObject.get("AppSettings").toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return values;
    }
}
