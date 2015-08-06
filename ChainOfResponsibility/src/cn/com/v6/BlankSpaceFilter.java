package cn.com.v6;

/**
 * Created by tanhaiyuan on 2015/8/1.
 */
public class BlankSpaceFilter implements Filter {
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        String message = request.getMessage() + " 处理空格!! ";
        request.setMessage(message);

        chain.doFilter(request, response, chain);

        String msg = response.getMessage() + " 处理空格!! ";
        response.setMessage(msg);
    }
}
