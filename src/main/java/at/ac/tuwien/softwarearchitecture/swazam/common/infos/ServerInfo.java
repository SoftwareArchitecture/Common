package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Used to store information needed to contact the server when a new peer has
 * been elected. Maybe to be filled with additional info, such as service name.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ServerInfo")
public class ServerInfo {

	/**
	 * Server IP
	 */
	@XmlAttribute(name = "ip", required = true)
	private String ip;

	/**
	 * Server port
	 */
	@XmlAttribute(name = "port", required = true)
	private int port;

	public ServerInfo(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}

	public ServerInfo() {
		super();
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
