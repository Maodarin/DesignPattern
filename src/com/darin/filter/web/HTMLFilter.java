package com.darin.filter.web;

public class HTMLFilter implements Filter {


	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.requestStr.replace('<', '[').replace('>', ']');
		chain.doFilter(request, response, chain);
		response.responseStr += "---HTMLFilter()";
		
	}

}
