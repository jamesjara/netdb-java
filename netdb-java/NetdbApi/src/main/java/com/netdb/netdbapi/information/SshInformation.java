package com.netdb.netdbapi.information;

import java.io.Serializable;

/**
 *
 * @author dalgarins
 */
public class SshInformation implements Serializable{
    
    private String keytype;
    private String fp;
    private String ca;

    public SshInformation() {
    }

    public SshInformation(String keytype, String fp, String ca) {
        this.keytype = keytype;
        this.fp = fp;
        this.ca = ca;
    }

    /**
     * Capaci ,
     * @return 
     */
    public String getKeytype() {
        return keytype;
    }

    /**
     * Capaci ,
     * @return 
     */
    public String getFp() {
        return fp;
    }

    /**
     * Capaci ,
     * @return 
     */
    public String getCa() {
        return ca;
    } 

    @Override
    public String toString() {
        return "SshInformation{" + "keytype=" + keytype + ", fp=" + fp + ", ca=" + ca + '}';
    }
    
    
}
