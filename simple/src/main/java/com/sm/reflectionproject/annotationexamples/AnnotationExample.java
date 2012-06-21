package com.sm.reflectionproject.annotationexamples; /**
 * This test class shows how to obtain All annotations.
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/exmaple/test")
public class AnnotationExample {

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public static void myMethod(String str, int i) {
    }

    public static void myMethod1(String str, int i) {
    }

    @RequestMapping(value = "/find-trading", method = RequestMethod.POST)
    public static void myMethod2(Double d, int j) {

    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public void find(
            @RequestParam(required = false, defaultValue = "0") Integer offset,
            @RequestParam(required = false) Integer limit) {
    }
}