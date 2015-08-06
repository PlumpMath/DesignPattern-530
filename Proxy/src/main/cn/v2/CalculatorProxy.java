package cn.v2;

/**
 * Created by tanhaiyuan on 2015/8/6.
 */
public class CalculatorProxy implements Calculator {

    private PositiveCalculator positiveCalculator;

    public CalculatorProxy(){
        positiveCalculator = new PositiveCalculator();
    }
    @Override
    public double add(double a, double b) throws Exception {
         //添加验证
        argsValidatior(a);
        argsValidatior(b);
         //添加日志
        System.out.println("the method [add()]" + "begin with args (" + a + "," + b + ")");

        double result = positiveCalculator.add(a,b);
        //添加日志
        System.out.println("the method [add()]" + "end with result (" + result + ")");

        return result;
    }
    private void argsValidatior(double arg) throws Exception {
        if (arg <= 0)
            throw new Exception("参数必须为正数");
    }
}
