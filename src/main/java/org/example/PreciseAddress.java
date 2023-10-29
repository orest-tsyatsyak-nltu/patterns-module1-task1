package org.example;

public class PreciseAddress implements Address {

    private String latitude;

    private String longitude;

    public PreciseAddress(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getTextualRepresentation() {
        return "latitude = " + latitude + ", longitude = " + longitude;
    }
}
