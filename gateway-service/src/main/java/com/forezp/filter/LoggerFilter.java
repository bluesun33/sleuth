package com.forezp.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import brave.Tracer;
import brave.SpanCustomizer;
import org.springframework.stereotype.Component;

/**
 * Created by forezp on 2017/8/3.
 */
@Component
public class LoggerFilter extends ZuulFilter {

    @Autowired
    Tracer tracer;

    @Autowired
    SpanCustomizer span;
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        this.span.tag("operator","forezp");
        System.out.print(tracer.currentSpan().toString());
        return null;
    }
}
