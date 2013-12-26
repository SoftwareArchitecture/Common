package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;
import java.util.UUID;

/**
 * 
 * Info that can be used to fully describe a Peer and connect to it from another Peer,
 * such as to forward a fingerprint matching request.
 *
 */
public class PeerInfo implements Serializable{
	/**
	 * Unique Peer ID
	 */
	private UUID peerID;
	
	/*
	 * IP at which Peer is located
	 */
	private String ip;
	
	/*
	 * Port at which Peer Socket API listens
	 */
	private int port;
	

	public PeerInfo() {
		super();
	}

	public PeerInfo(UUID peerID, String ip, int port) {
		super();
		this.peerID = peerID;
		this.ip = ip;
		this.port = port;
	}

	public UUID getPeerID() {
		return peerID;
	}

	public void setPeerID(UUID peerID) {
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
