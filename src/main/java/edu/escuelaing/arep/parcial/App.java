package edu.escuelaing.arep.parcial;

import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {
        port(getPort());

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
