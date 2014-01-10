package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * Info that can be used to fully describe a Peer and connect to it from another Peer,
 * such as to forward a fingerprint matching request.
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PeerInfo")
public class PeerInfo implements Serializable{
	/**
	 * Unique Peer ID
	 */

    @XmlAttribute(name = "UUID", required = true)
	private int peerID;
	
	/*
	 * IP at which Peer is located
	 */
    @XmlAttribute(name = "ip", required = true)
	private String ip;
	
	/*
	 * Port at which Peer Socket API listens
	 */
    @XmlAttribute(name = "port", required = true)
	private int port;
    
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

	public PeerInfo() {
		super();
	}

	public PeerInfo(int peerID, String ip, int port) {
		super();
		this.peerID = peerID;
		this.ip = ip;
		this.port = port;
	}

	public int getPeerID() {
		return peerID;
	}

	public void setPeerID(int peerID) {
		this.peerID = peerID;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
