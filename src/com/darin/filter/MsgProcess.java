package com.darin.filter;

public class MsgProcess {
	private String msg;
	private FilterChain fc;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public FilterChain getFc() {
		return fc;
	}
	public void setFc(FilterChain fc) {
		this.fc = fc;
	}
	public String process() {
		return fc.doFilter(msg);
	}

}
