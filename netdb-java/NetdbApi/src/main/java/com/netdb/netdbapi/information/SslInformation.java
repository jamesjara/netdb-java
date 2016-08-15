package com.netdb.netdbapi.information;

import java.io.Serializable;

/**
 *
 * @author dalgarins
 */
public class SslInformation implements Serializable{
    
    private String issuer;
    private String md5;
    private String sha;
    private String cert;

    public SslInformation() {
    }

    public SslInformation(String issuer, String md5, String sha, String cert) {
        this.issuer = issuer;
        this.md5 = md5;
        this.sha = sha;
        this.cert = cert;
    }

    /**
     * Certificate authority. ,
     * @return String with certificate authority
     */
    public String getIssuer() {
        return issuer;
    }

    /**
     * MD5 
     * @return String with md5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * Secure Hash Algorithm. ,
     * @return String with secure hash
     */
    public String getSha() {
        return sha;
    }

    /**
     * The certificate with raw information such as when it was issued, the SSL extensions, the issuer, subject etc.
     * @return String with raw certificate
     */
    public String getCert() {
        return cert;
    }

    @Override
    public String toString() {
        return "SslInformation{" + "issuer=" + issuer + ", md5=" + md5 + ", sha=" + sha + ", cert=" + cert + '}';
    }
    
    
    
}
