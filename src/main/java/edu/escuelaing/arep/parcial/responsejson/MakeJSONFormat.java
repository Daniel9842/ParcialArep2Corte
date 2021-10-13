package edu.escuelaing.arep.parcial.responsejson;

import org.json.simple.JSONObject;

public class MakeJSONFormat {
    public static Object JSONFormat(String function,Double value,Double answer){
        JSONObject answerFunction = new JSONObject();
        answerFunction.put("operation",function);
        answerFunction.put("input",value);
        answerFunction.put("output",answer);
        return answerFunction;
    }
}
