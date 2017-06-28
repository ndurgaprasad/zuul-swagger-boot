package com.durga.gateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class RequestLoggingFilter extends ZuulFilter {

	private static final Logger LOG = LoggerFactory.getLogger(RequestLoggingFilter.class);

	@Override
	public Object run() {
		HttpServletRequest req = RequestContext.getCurrentContext().getRequest();
		LOG.info("{} {}", req.getMethod(), req.getRequestURI());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
