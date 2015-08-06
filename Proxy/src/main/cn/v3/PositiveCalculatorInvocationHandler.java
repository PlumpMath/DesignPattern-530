package cn.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by tanhaiyuan on 2015/8/6.
 */
public class PositiveCalculatorInvocationHandler implements InvocationHandler {
    private Object target;

    public PositiveCalculatorInvocationHandler(Object object){
        this.target = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //添加日志
        System.out.println("the method ["+method.getName()+"]"+"begin with args ("+args.toString()+")");
        Object result = method.invoke(this.target, args);
          //添加日志
        System.out.println("the method ["+method.getName()+"]"+"end with result ("+result.toString()+")");
        return result;
    }

    public Object getProxy(){
       return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.getClass().getInterfaces(), this);
       //CalculatorProxy.getProxyClass().getConstructor().newInstance();
    }
}
