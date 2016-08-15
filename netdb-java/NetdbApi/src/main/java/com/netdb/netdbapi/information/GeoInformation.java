package com.netdb.netdbapi.information;

import java.io.Serializable;

/**
 * This class is the representation of inline_model, Obtain all geoinformation
 * about an response
 *
 * @author dalgarins
 */
public class GeoInformation implements Serializable{
        
    private String city;
    private String area_code; 
    private String dma_code;
    private double latitude;
    private double longitude;
    private String country_code;
    private String country_name;
    private String continent;

    public GeoInformation() {
    }

    public GeoInformation(String city, String area_code, String dma_code, double latitude, double longitude, String country_code, String country_name, String continent) {
        this.city = city;
        this.area_code = area_code;
        this.dma_code = dma_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country_code = country_code;
        this.country_name = country_name;
        this.continent = continent;
    }

    /**
     * The name of the city where the device is located. ,
     * @return String with the name of the city
     */
    public String getCity() {
        return city;
    }

    /**
     * The area code for the device's location. Only available for the US. ,
     * @return String with the area code
     */
    public String getArea_code() {
        return area_code;
    }

    /**
     * The designated market area code for the area where the device is located. Only available for the US. ,
     * @return String with the dmacode
     */
    public String getDma_code() {
        return dma_code;
    }

    /**
     * The latitude for the geolocation of the device. ,
     * @return double with the latitud
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * The longitude for the geolocation of the device. ,
     * @return double withe the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * The 2-letter country code for the device location. ,
     * @return String with the county_code
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     * The name of the country where the device is located. ,
     * @return String withe country name
     */
    public String getCountry_name() {
        return country_name;
    }

    /**
     * The name of the continent where the device is located.
     * @return String with the continent
     */
    public String getContinent() {
        return continent;
    }  

    @Override
    public String toString() {
        return "GeoInformation{" + "city=" + city + ", area_code=" + area_code + ", dma_code=" + dma_code + ", latitude=" + latitude + ", longitude=" + longitude + ", country_code=" + country_code + ", country_name=" + country_name + ", continent=" + continent + '}';
    }    
}
