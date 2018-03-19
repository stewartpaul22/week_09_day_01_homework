import models.NameGenerator;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class NameGeneratorController {
    public static void main(String[] args) {

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        staticFileLocation("/public");

        get("/one", (req, res) -> {

            NameGenerator nameGenerator = new NameGenerator();
            String name = nameGenerator.generateRandomName();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", name);

            return new ModelAndView(model, "one_name.vtl");

        }, velocityTemplateEngine);


        get("/two", (req, res) -> {

            NameGenerator nameGenerator = new NameGenerator();
            ArrayList twoNames = nameGenerator.generateRandomNames(2);

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", twoNames);

            return new ModelAndView(model, "two_names.vtl");

        }, velocityTemplateEngine);

    }
}
