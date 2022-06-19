package com.apigateway.zuul.filters;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreFilter extends ZuulFilter {

	private static Logger logger = LoggerFactory.getLogger(PreFilter.class);

	public Object run() throws ZuulException {
		// TODO run() Contains the functionality of the filter.
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();

		// Logging request information
		logger.info("Calling Zuul Pre Filter");
		logger.info("Pre Filter: "
				+ String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

		return null;
	}

	public boolean shouldFilter() {
		// TODO shouldFilter() Contains the logic that determines when to run
		// this filter (this
		// particular filter is always run). OR set a condition when to run
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO filterOrder() Gives the order in which this filter is to be run,
		// relative to other filters.

		return 1;
	}

	@Override
	public String filterType() {
		// TODO filterType() Returns a String that stands for the type of the
		// filter — in this case, pre. (It would be route for a routing filter.)
		return "pre";
	}

}
