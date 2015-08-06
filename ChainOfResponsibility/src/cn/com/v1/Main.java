package cn.com.v1;

/**
 * Created by tanhaiyuan on 2015/8/1.
 */
public class Main {
    public static void main(String args[]){
        String request = "请求内容";
        BlankSpaceFilter blankFilter = new BlankSpaceFilter();
        request = blankFilter.processBlankSpace(request);

        CommaFilter commaFilter = new CommaFilter();
        request = commaFilter.processComma(request);
    }
}
