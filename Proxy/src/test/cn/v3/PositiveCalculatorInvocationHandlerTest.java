package cn.v3;

import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by tanhaiyuan on 2015/8/6.
 */
public class PositiveCalculatorInvocationHandlerTest {

    @Test
    public void testInvoke() throws Exception {
        Calculator target = new PositiveCalculator();
        PositiveCalculatorInvocationHandler handler = new PositiveCalculatorInvocationHandler(target);

        Calculator proxy = (Calculator)Proxy.newProxyInstance(target.getClass().getClassLoader(), new Class[]{Calculator.class}, handler);
        proxy.add(2,3);

        proxy.add(-2,3);
    }
}