package com.casino.util;

import java.io.FileReader;
import java.nio.file.Paths;

/*import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
*/

/**
 * A utility class that provides functions for parsing <code>.json</code> files.
 * 
 * 
 * @author Gabriel
 */
public abstract class JsonLoader {

    /** Used for parsing the actual file. */
    //private JsonParser parser;

    /** Holds all of the elements of the parsed file. */
    //private JsonArray array;

    /** Used to extract the data from the parsed elements. */
    //private Gson builder;

    /**
     * Create a new {@link JsonLoader}.
     * 
     * @throws Exception
     *             if any exceptions occur while creating the loader.
     */
    /*public JsonLoader() throws Exception {
        this.parser = new JsonParser();
        this.array = (JsonArray) parser.parse(new FileReader(Paths.get(
            filePath()).toFile()));
        this.builder = new GsonBuilder().create();
    }
    */
}
