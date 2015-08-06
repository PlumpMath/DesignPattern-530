package cn.com.v2;

/**
 * Created by tanhaiyuan on 2015/8/1.
 */
public class Main {
    public static void main(String args[]){
        String request = "请求内容";
        Filter commaFilter = new CommaFilter();
        request = commaFilter.doFilter(request);

        Filter blankSpaceFilter = new BlankSpaceFilter();
        request = blankSpaceFilter.doFilter(request);
    }
}
