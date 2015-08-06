package cn.v2;

import org.junit.Test;

/**
 * Created by tanhaiyuan on 2015/8/6.
 */
public class CalculatorProxyTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculatorProxy = new CalculatorProxy();
        calculatorProxy.add(-2, 3);

        //calculatorProxy.add(2, 3);
    }
}