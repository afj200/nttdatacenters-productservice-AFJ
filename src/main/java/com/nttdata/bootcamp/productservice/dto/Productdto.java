package com.nttdata.bootcamp.productservice.dto;

public class Productdto {

	/* Identiificador de producto */
	private int productId;
	
	/* Descripción del producto */
	private String channel;
	
	/* Puerto donde se ha desplegado el servicio */
	private String serverPort;

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
	
	
	
}
