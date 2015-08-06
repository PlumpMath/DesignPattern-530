package cn.com.v5;

/**
 * Created by tanhaiyuan on 2015/8/1.
 */
public class BlankSpaceFilter implements Filter {
    @Override
    public  void doFilter(Request request, Response response) {
        String message = request.getMessage() + " 处理空格!! ";
        request.setMessage(message);
    }
}
