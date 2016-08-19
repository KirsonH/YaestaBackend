package com.yaesta.app.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "order_item",schema="yaesta")
public class OrderItem implements Serializable{

	/**
	 * Serial Version
	 */
	private static final long serialVersionUID = -218395980318608280L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_item_seq_gen")
	@SequenceGenerator(name = "order_item_seq_gen", sequenceName = "order_item_id_seq")
	private Long id;
	
	@org.hibernate.annotations.Type(type="com.yaesta.app.persistence.util.SQLXMLType")
	@Column(name="item_info")
	private String itemInfo;
	
	@Column(name = "vitex_id") //id de la orden en vitex
	private String vitexId;
	
	@Column(name="price")  //precio del item
	private Double price;
	
	@Column(name="quantity")  //cantidad de producto
	private Long quantity;
	
	@JoinColumn(name = "order_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Order order;
	
	@JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Product product;
	
	@JoinColumn(name = "client_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Client client;
	
	@JoinColumn(name = "supplier_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
	private Supplier supplier;
	
	@Column(name="order_sequence") //secuencia de la orden
	private String orderSequence;
	
	@Column(name="supplier_name") //nombre del proveedor
	private String supplierName;
	
	@Column(name="way_to_pay") //forma de pago
	private String wayToPay;
	
	@Column(name="customer_document") //documento del producto
	private String customerDocument;
	
	@Column(name="customer_name") //documento del producto
	private String customerName;
	
	@Column(name="customer_address") //direccion del cliente
	private String customerAddress;
	
	@Column(name="customer_phone") //telefono del cliente
	private String customerPhone;
	
	@Column(name="customer_state") //provincia del cliente
	private String customerState;
	
	@Column(name="customer_canton") //canton del cliente
	private String customerCanton;
	
	@Column(name="product_description") //descripcion del producto
	private String productDescription;
	
	@Column(name="product_key") //id del producto en vtex
	private String productKey;
	
	@Column(name="order_date",columnDefinition="TIMESTAMP WITH TIME ZONE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}

	public String getVitexId() {
		return vitexId;
	}

	public void setVitexId(String vitexId) {
		this.vitexId = vitexId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getOrderSequence() {
		return orderSequence;
	}

	public void setOrderSequence(String orderSequence) {
		this.orderSequence = orderSequence;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getWayToPay() {
		return wayToPay;
	}

	public void setWayToPay(String wayToPay) {
		this.wayToPay = wayToPay;
	}

	public String getCustomerDocument() {
		return customerDocument;
	}

	public void setCustomerDocument(String customerDocument) {
		this.customerDocument = customerDocument;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCanton() {
		return customerCanton;
	}

	public void setCustomerCanton(String customerCanton) {
		this.customerCanton = customerCanton;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductKey() {
		return productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
	
	
}
