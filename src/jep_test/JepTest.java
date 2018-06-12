package jep_test;

import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;
import org.nfunk.jep.ParseException;

public class JepTest {
    public static void main(String[] args) {
        JEP jep = new JEP();
        try {
            String a = "56*10%";
            String b = a.replaceAll("%", "/100");
            System.out.println("string_result: " + a + "/n  b:" + b);
            jep.addVariable("x", 10);
            Node parse = jep.parseExpression("x*10%");
            System.out.println("result: " + jep.getValue());
            System.out.println("result2: " + jep.evaluate(parse));
        } catch (ParseException e) {
            System.out.println("error: " + e.getErrorInfo());
        }

    }
}
