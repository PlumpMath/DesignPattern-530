package cn.com.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tanhaiyuan on 2015/8/2.
 */
public class FilterChain implements Filter {
    private int index;
    private List<Filter> filterList;


    public FilterChain() {
        index = 0;
        filterList = new ArrayList<Filter>();
    }

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void doFilter(Request request, Response response, FilterChain chain) {
        if(index >= filterList.size()) return;
        Filter filter = filterList.get(index);
        index ++;

        filter.doFilter(request, response, chain);
    }

}
