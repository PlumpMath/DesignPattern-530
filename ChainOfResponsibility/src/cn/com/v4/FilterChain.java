package cn.com.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanhaiyuan on 2015/8/2.
 */
public class FilterChain implements  Filter{
    private List<Filter> filterList;

    public FilterChain(){
        filterList = new ArrayList<Filter>();
    }

    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    public String doFilter(String request){
        for(int i=0; i<filterList.size(); i++){
            request = filterList.get(i).doFilter(request);
        }
        return request;
    }
}
