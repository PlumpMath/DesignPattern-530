package cn.com.v3;

/**
 * Created by tanhaiyuan on 2015/8/1.
 */
public class BlankSpaceFilter implements Filter {
    @Override
    public String doFilter(String request) {
        request += " 处理空格!! ";
        System.out.println(request);
        return request;
    }
}
