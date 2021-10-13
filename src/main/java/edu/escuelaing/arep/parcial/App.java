package edu.escuelaing.arep.parcial;

import edu.escuelaing.arep.parcial.responsejson.MakeJSONFormat;
import edu.escuelaing.arep.parcial.service.CalculatorFuncService;

import static spark.Spark.*;
import spark.Request;
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        get("/hello", (req, res) -> "Hello World");
        get("/log", (req, res) -> MakeJSONFormat.JSONFormat("log",Double.valueOf(req.queryParams("value")), CalculatorFuncService.logFunction(Double.valueOf(req.queryParams("value")))));
        get("/exp", (req, res) -> MakeJSONFormat.JSONFormat("log",Double.valueOf(req.queryParams("value")), CalculatorFuncService.expFunction(Double.valueOf(req.queryParams("value")))));
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
