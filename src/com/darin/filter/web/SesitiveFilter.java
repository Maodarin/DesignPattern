package com.darin.filter.web;

public class SesitiveFilter implements Filter {

	@Override
	public void doFilter(Request request, Response response, FilterChain chain) {
		request.requestStr.replace("����ҵ", "��ҵ").replace("����", "");
		chain.doFilter(request, response, chain);
		response.responseStr+="---SesitiveFilter()";
	}

}
