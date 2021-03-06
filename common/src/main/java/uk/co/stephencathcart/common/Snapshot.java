package uk.co.stephencathcart.common;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects;
import java.io.Serializable;
import java.util.Date;

/**
 * Pojo that represents a snapshot. A snapshot is generated by the smart speed
 * camera monitor and includes details of both the vehicle captured and the
 * camera. Capture date uses ISO 8601 format.
 *
 * @author Stephen Cathcart
 */
public class Snapshot implements Serializable {

    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date captureDate;
    private VehicleType vehicleType;
    private String registration;
    private int currentSpeed;
    private SmartSpeedCamera camera;
    private boolean speeding;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public SmartSpeedCamera getCamera() {
        return camera;
    }

    public void setCamera(SmartSpeedCamera camera) {
        this.camera = camera;
    }

    public Date getCaptureDate() {
        return captureDate;
    }

    public void setCaptureDate(Date captureDate) {
        this.captureDate = captureDate;
    }

    public boolean isSpeeding() {
        return speeding;
    }

    public void setSpeeding(boolean speeding) {
        this.speeding = speeding;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("vehicleType", vehicleType)
                .add("registration", registration)
                .add("currentSpeed", currentSpeed)
                .add("camera", camera)
                .add("isSpeeding", speeding)
                .toString();
    }
}
