package com.yaesta.integration.vitex.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yaesta.app.persistence.entity.Supplier;
import com.yaesta.integration.vitex.json.bean.ItemComplete;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierDeliveryInfo implements Serializable{

	/**
	 * Serial Version
	 */
	private static final long serialVersionUID = -2085188475778543348L;
	private String supplierId;
	private Supplier supplier;
	private Date deliveryDate;
	private Long packages;
	private List<ItemComplete> items;
	
	
	public SupplierDeliveryInfo(){
		items = new ArrayList<ItemComplete>();
		packages = 1L;
		deliveryDate = new Date();
	}
	
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Long getPackages() {
		return packages;
	}
	public void setPackages(Long packages) {
		this.packages = packages;
	}
	public List<ItemComplete> getItems() {
		return items;
	}
	public void setItems(List<ItemComplete> items) {
		this.items = items;
	}
	
	
	
}
