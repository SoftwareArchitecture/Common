package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Information needed for the billing process? To which client coins are added/removed
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ClientInfo")
public class ClientInfo implements Serializable{
	@XmlAttribute(name = "id", required = true)
	private int clientID;
	
	@XmlAttribute(name = "sessionkey")
	private UUID sessionKey;
	
	@XmlAttribute(name = "username")
	private String username;
	
	@XmlAttribute(name = "password")
	private String password;
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UUID getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(UUID sessionKey) {
		this.sessionKey = sessionKey;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	
	
}
