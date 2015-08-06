package cn.com.v1;

/**
 * Created by tanhaiyuan on 2015/8/2.
 */
public class BlankSpaceFilter {
    String processBlankSpace(String request) {
        request += " 处理空格!! ";
        System.out.println(request);
        return request;
    }
}
