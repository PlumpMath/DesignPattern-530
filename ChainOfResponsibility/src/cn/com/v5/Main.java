package cn.com.v5;

/**
 * Created by tanhaiyuan on 2015/8/1.
 * 调整代码结构，添加response作为参数
 */
public class Main {

    public static void main(String args[]) {
        Request request = new Request();
        request.setMessage("请求信息");

        Response response = new Response();
        response.setMessage("返回信息");

        FilterChain filterChain = new FilterChain();
        Filter commaFilter = new CommaFilter();
        filterChain.addFilter(commaFilter);

        Filter blankSpaceFilter = new BlankSpaceFilter();
        filterChain.addFilter(blankSpaceFilter);
        filterChain.doFilter(request, response);

        System.out.println(request.getMessage());
        System.out.println(response.getMessage());
    }
}
