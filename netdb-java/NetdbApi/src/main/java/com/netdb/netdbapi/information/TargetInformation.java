package com.netdb.netdbapi.information;

import java.io.Serializable;

/**
 * Thid class is the representation of target information response
 *
 * @author dalgarins
 */
public class TargetInformation implements Serializable{

    private String ip;
    private String asn;
    private double port;
    private GeoInformation geo;
    private String url;
    private String protocol;
    private SslInformation ssl;
    private SshInformation ssh;
    private Object headers;
    private String html;
    private String response;

    public TargetInformation() {
    }

    public TargetInformation(String ip, String asn, double port, GeoInformation geo, String url, String protocol, SslInformation ssl, SshInformation ssh, Object headers, String html, String response) {
        this.ip = ip;
        this.asn = asn;
        this.port = port;
        this.geo = geo;
        this.url = url;
        this.protocol = protocol;
        this.ssl = ssl;
        this.ssh = ssh;
        this.headers = headers;
        this.html = html;
        this.response = response;
    }

    /**
     * The IP address of the thing/device. ,
     *
     * @return String with the IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * The autonomous system number (ex. "AS4837"). ,
     *
     * @return String with the system number
     */
    public String getAsn() {
        return asn;
    }

    /**
     * The port number that the service is listening. ,
     *
     * @return String with the port
     */
    public double getPort() {
        return port;
    }

    /**
     * An object with all of the geo spatial information for the thing/device. ,
     *
     * @return GeoInformation with geospatial information
     */
    public GeoInformation getGeo() {
        return geo;
    }

    /**
     * http/s URL of the thing/device if have it. ,
     *
     * @return String with the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Internet Protocol in the Application layer. = ['https', 'ftp', 'telnet']
     * string Enum:	"https", "ftp", "telnet" ,
     *
     * @return String with the protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * only if the thing/device has SSL support. ,
     * @return SslInformation of the target
     */
    public SslInformation getSsl() {
        return ssl;
    }

    /**
     * only if the thing/device has SSH support. ,
     * @return SshInformation of the target
     */
    public SshInformation getSsh() {
        return ssh;
    }

    /**
     * Contains the banner information for WEB SERVER thing/device. ,
     * @return Object with hearder 
     */
    public Object getHeaders() {
        return headers;
    }

    /**
     * Contains the html response for Web server thing/device ,
     * @return String with the html
     */
    public String getHtml() {
        return html;
    }

    /**
     * Contains the response information for the service.
     * @return String with the response
     */
    public String getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return "TargetInformation{" + "ip=" + ip + ", asn=" + asn + ", port=" + port + ", geo=" + geo + ", url=" + url + ", protocol=" + protocol + ", ssl=" + ssl + ", ssh=" + ssh + ", headers=" + headers + ", html=" + html + ", response=" + response + '}';
    }
    
}
