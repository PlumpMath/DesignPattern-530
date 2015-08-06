package cn.v1;

import cn.v2.Calculator;
import cn.v2.PositiveCalculator;
import org.junit.Test;

/**
 * Created by tanhaiyuan on 2015/8/6.
 */
public class PositiveCalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new PositiveCalculator();
        //calculator.add(-2, 3);

        calculator.add(2,3);
    }
}