package cn.com.v5;

/**
 * Created by tanhaiyuan on 2015/8/1.
 */
public class CommaFilter implements Filter {
    @Override
    public  void doFilter(Request request, Response response) {
        String message = request.getMessage() + " 处理逗号!! ";
        request.setMessage(message);
    }
}
