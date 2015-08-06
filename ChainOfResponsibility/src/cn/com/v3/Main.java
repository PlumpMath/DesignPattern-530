package cn.com.v3;

/**
 * Created by tanhaiyuan on 2015/8/1.
 * 存在问题：与客户端耦合， 要扩展处理规则，都要修改客户端。
 */
public class Main {

    public static void main(String args[]){
        String request = "请求内容";
        FilterChain filterChain = new FilterChain();
        Filter commaFilter = new CommaFilter();
        filterChain.addFilter(commaFilter);

        Filter blankSpaceFilter = new BlankSpaceFilter();
        filterChain.addFilter(blankSpaceFilter);
        filterChain.process(request);
    }
}
