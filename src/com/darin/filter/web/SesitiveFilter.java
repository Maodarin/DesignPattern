package com.darin.filter.web;

public class SesitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.requestStr.replace("被就业", "就业").replace("敏感", "");
		chain.doFilter(request, response, chain);
		response.responseStr+="---SesitiveFilter()";
	}

}
