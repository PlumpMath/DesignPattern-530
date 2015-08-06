package cn.com.v4;

/**
 * Created by tanhaiyuan on 2015/8/1.
 * 相对于v3的改进：让FilterChain实现Filter接口， 使得FilterChain作为一个整体添加到FilterChain中
 * 解决了 添加处理链 的问题
 */
public class Main {

    public static void main(String args[]){
        String request = "请求内容";
        FilterChain filterChain = new FilterChain();
        Filter commaFilter = new CommaFilter();
        filterChain.addFilter(commaFilter);

        Filter blankSpaceFilter = new BlankSpaceFilter();
        filterChain.addFilter(blankSpaceFilter);
        filterChain.doFilter(request);
    }
}
