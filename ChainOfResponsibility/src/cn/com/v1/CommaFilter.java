package cn.com.v1;

/**
 * Created by tanhaiyuan on 2015/8/2.
 */
public class CommaFilter {
    String processComma(String request) {
        request += " 处理逗号!! ";
        System.out.println(request);
        return request;
    }
}