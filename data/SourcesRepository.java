package data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SourceRepository {
    static public SourceDTO[] getData(String jsonString){
        GsonBuilder gsonDecoder = new GsonBuilder();
        Gson gson = gsonDecoder.create();
        Response response = gson.fromJson(jsonString, Response.class);
        return response.sources;
    }

    private class Response{
        private String status;
        private SourceDTO[] sources;
    }
}
