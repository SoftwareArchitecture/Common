package at.ac.tuwien.softwarearchitecture.swazam.common.infos;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * Info that can be used to fully describe a Peer and connect to it from another
 * Peer, such as to forward a fingerprint matching request.
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PeerInfo")
public class PeerInfo implements Serializable {

    /**
     * Unique Peer ID
     */

    @XmlAttribute(name = "id", required = true)
    private Integer peerID;

    @XmlAttribute(name = "superPeerId")
    private Integer superPeerID;

    /*
     * IP at which Peer is located
     */
    @XmlAttribute(name = "ip", required = true)
    private String ip;

    @XmlAttribute(name = "superPeerIp")
    private String superPeerIp;

    /*
     * Port at which Peer Socket API listens
     */
    @XmlAttribute(name = "port", required = true)
    private int port;

    /*
     * Port at which Peer Socket API listens
     */
    @XmlAttribute(name = "superPeerPort")
    private int superPeerPort;

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

    public Integer getSuperPeerID() {
        return superPeerID;
    }

    public String getSuperPeerIp() {
        return superPeerIp;
    }

    public int getSuperPeerPort() {
        return superPeerPort;
    }

    public void setSuperPeerID(Integer superPeerID) {
        this.superPeerID = superPeerID;
    }

    public void setSuperPeerIp(String superPeerIp) {
        this.superPeerIp = superPeerIp;
    }

    public void setSuperPeerPort(int superPeerPort) {
        this.superPeerPort = superPeerPort;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PeerInfo() {
        super();
    }

    public PeerInfo(Integer peerID, String ip, int port) {
        super();
        this.peerID = peerID;
        this.ip = ip;
        this.port = port;
    }

    public Integer getPeerID() {
        return peerID;
    }

    public void setPeerID(Integer peerID) {
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (this.peerID != null ? this.peerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PeerInfo other = (PeerInfo) obj;
        if (this.peerID != other.peerID && (this.peerID == null || !this.peerID.equals(other.peerID))) {
            return false;
        }
        return true;
    }
    
    

}
