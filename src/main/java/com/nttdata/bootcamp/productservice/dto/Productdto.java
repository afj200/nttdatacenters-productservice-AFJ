package com.nttdata.bootcamp.productservice.dto;

public class Productdto {

	/* Identificador de producto */
	private int productId;
	
	/* Descripción del producto */
	private String channel;
	
	/* Puerto donde se ha desplegado el servicio */
	private String serverPort;
	
	/* Descripcion producto */
	private String value;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Productdto(int productId, String channel, String serverPort, String value) {
		super();
		this.productId = productId;
		this.channel = channel;
		this.serverPort = serverPort;
		this.value = value;
	}

	public Productdto() {
		super();
	}
	
	
	
}
