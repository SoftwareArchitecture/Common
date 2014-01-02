package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

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
public class ClientInfo {
	@XmlAttribute(name = "UUID", required = true)
	private UUID clientID;

	public UUID getClientID() {
		return clientID;
	}

	public void setClientID(UUID clientID) {
		this.clientID = clientID;
	}
	
	
}
