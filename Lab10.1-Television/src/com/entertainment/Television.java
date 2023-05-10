package com.entertainment;

import java.util.Arrays;

/*
 * Business class (system class) to model the workings of a television.
 */
public class Television {
    // class-level, shared (static) variables - one copy of each, NOT stored in each object
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba" };

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // instance variables or fields
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;  // otherwise, null if client doesn't say

    private boolean isMuted;  // for muting behavior, getter only (named "isMuted()")
    private int oldVolume;    // for muting behavior, internal use only, NO get/set methods

    // constructors
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();               // delegate to no-arg ctor for the increment
        setBrand(brand);      // delegate to setter for any validation/conversion
    }

    public Television(String brand, int volume) throws InvalidVolumeException {
        this(brand);          // delegate to ctor above me for brand
        setVolume(volume);    // handle volume myself, by delegating to setter
    }

    public Television(String brand, int volume, DisplayType display) throws InvalidVolumeException {
        this(brand, volume);  // delegate to brand-volume ctor for those two
        setDisplay(display);  // handle display myself, by delegating to setter
    }

    // business methods or operations ("action" methods)
    public void mute() {
        if (!isMuted()) {  // not currently muted
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {             // currently muted
            volume = oldVolume;
            isMuted = false;
        }
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    // accessor (get/set) methods - provide "controlled access" to the object's fields
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isValidBrand(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " + brand + ". Valid brands are " +
                    Arrays.toString(VALID_BRANDS) + ".");
        }
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;

        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equals(brand)) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws InvalidVolumeException {
        if (MIN_VOLUME <= volume && volume <= MAX_VOLUME) {  // valid
            this.volume = volume;

            // clear the 'isMuted' flag, in case we're muted
            // try it at home: mute your TV, then change the volume - that will unmute it
            isMuted = false;
        }
        else {
            throw new InvalidVolumeException(String.format(
                    "Invalid volume: %s. Valid range is %s to %s.", volume, MIN_VOLUME, MAX_VOLUME
            ));

//            throw new IllegalArgumentException("Invalid volume: " + volume + ". " +
//                    "Valid range is [" + MIN_VOLUME + "-" + MAX_VOLUME + "].");
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;  // fake implementation
    }

    /*
     * Returns a sentence (as a string) that describes the object.
     * This often includes the object's type, plus the values of its instance variables.
     *
     * Note that, although toString() has direct access to the private fields,
     * it calls the getter methods instead - this is generally considered a best practice.
     */
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: brand=" + getBrand() + ", volume=" + volumeString +
                ", display=" + getDisplay();
    }
}