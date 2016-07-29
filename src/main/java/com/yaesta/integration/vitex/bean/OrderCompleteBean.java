package com.yaesta.integration.vitex.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yaesta.integration.vitex.json.bean.OrderComplete;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderCompleteBean implements Serializable{

	/**
	 * Serial version
	 */
	private static final long serialVersionUID = -2559227165489542195L;
	private OrderComplete order;
	private String action;
	private String error;
	private List<String> guideIdList;
	
	public OrderCompleteBean(){
		error="OK";
		guideIdList = new ArrayList<String>();
	}
	
	public OrderComplete getOrder() {
		return order;
	}
	public void setOrder(OrderComplete order) {
		this.order = order;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<String> getGuideIdList() {
		return guideIdList;
	}

	public void setGuideIdList(List<String> guideIdList) {
		this.guideIdList = guideIdList;
	}
	
	
	
}