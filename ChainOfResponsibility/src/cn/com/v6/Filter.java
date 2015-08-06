package cn.com.v6;

/**
 * Created by tanhaiyuan on 2015/8/1.
 * 调整代码结构，添加response作为参数
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain chain);
}
