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
            model.put("template", "one_name.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);


        get("/two", (req, res) -> {

            NameGenerator nameGenerator = new NameGenerator();
            ArrayList twoNames = nameGenerator.generateRandomNames(2);

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", twoNames);
            model.put("template", "two_names.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/three", (req, res) -> {

            NameGenerator nameGenerator = new NameGenerator();
            ArrayList threeNames = nameGenerator.generateRandomNames(3);

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", threeNames);
            model.put("template", "three_names.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/four", (req, res) -> {

            NameGenerator nameGenerator = new NameGenerator();
            ArrayList fourNames = nameGenerator.generateRandomNames(4);

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", fourNames);
            model.put("template", "four_names.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

        get("/all/:quantity", (req, res) -> {

            Integer num = Integer.parseInt(req.params(":quantity"));

            NameGenerator nameGenerator = new NameGenerator();
            ArrayList allNames = nameGenerator.generateRandomNames(num);

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", allNames);
            model.put("template", "all.vtl");

            return new ModelAndView(model, "layout.vtl");

        }, velocityTemplateEngine);

    }
}
