package com.sm.reflectionproject.annotationexamples; /**
 * This test class shows how to obtain All annotations.
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/example2/test2")
public class AnnotationExample2 {

    @RequestMapping(value = "/find2", method = RequestMethod.GET)
    public static void myMethod(String str, int i) {
    }

    public static void myMethod8(String str, int i) {
    }

    @RequestMapping(value = "/find-trading2", method = RequestMethod.GET)
    public static void myMethod10(Double d, int j) {

    }

    @RequestMapping(value = "/find-trading3", method = RequestMethod.POST)
    public void find(
            @RequestParam(required = true, defaultValue = "1") Integer offset,
            @RequestParam(required = false, defaultValue = "") Integer limit) {
    }
}