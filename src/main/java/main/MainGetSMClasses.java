package main;

import annotatedexample.AnnotationExample2;
import convertojson.ConvertToJson;
import org.json.simple.JSONObject;
import java.util.Set;

public class MainGetSMClasses {
    public static void main(String[] args) {
        Set<Class> setOfClasses = null;
        String location = "/Users/rdavid/Desktop/Development/";
        JSONGenerator(setOfClasses, location);
    }

    public static void JSONGenerator(Set<Class> setOfClasses, String location){
        // for(Class clazz: setOfClasses){

        JSONObject obj =  new JSONObject();
        AnnotationExample2 ae = new AnnotationExample2();
        ConvertToJson gc = new ConvertToJson(ae.getClass(), location);
        //}
    }
}
