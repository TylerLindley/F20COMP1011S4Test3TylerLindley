package Utilties;

import Models.JsonFileResult;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadingJSONFile {

    public static ArrayList<JsonFileResult> getDonors() {
        ArrayList<JsonFileResult> donorArrayList = new ArrayList<>();

        try (
                FileReader fileReader = new FileReader("src/Utilties/donors.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            Gson gson = new Gson();
            JsonFileResult donors = gson.fromJson(jsonReader, JsonFileResult.class);
            donorArrayList.addAll(Arrays.asList(donors));
            System.out.println(donors);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return donorArrayList;
    }

    public static JsonFileResult getDonors2() {
        JsonFileResult donors2 = null;
        try(
                FileReader fileReader = new FileReader("src/Utilties/donors.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            Gson gson = new Gson();
            donors2 = gson.fromJson(jsonReader, JsonFileResult.class);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return donors2;
    }
}
