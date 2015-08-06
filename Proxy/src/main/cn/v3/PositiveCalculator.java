package cn.v3;

/**
 * 正数计算器
 * Created by tanhaiyuan on 2015/8/6.
 */
public class PositiveCalculator implements Calculator {
    @Override
    public double add(double a, double b) throws Exception {
        double result = a+b;
        return result;
    }

    private void argsValidatior(double arg)throws Exception
    {
        if(arg <= 0)
            throw new Exception("参数必须为正数");
    }
}
