/**
 * 
 */
package com.mindtree.orderitemservice.config;

import java.util.Date;

/**
 * @author Joby Wilson Mathews
 *
 */
public class ResponseObject {
	private Date timestamp;
	private String mensaje;
	private String detalles;
	private String httpCodeMessage;

	public ResponseObject(Date timestamp, String message, String details, String httpCodeMessage) {
		super();
		this.timestamp = timestamp;
		this.mensaje = message;
		this.detalles = details;
		this.httpCodeMessage = httpCodeMessage;
	}

	public String getHttpCodeMessage() {
		return httpCodeMessage;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMensaje() {
		return mensaje;
	}

	public String getDetalles() {
		return detalles;
	}
}
