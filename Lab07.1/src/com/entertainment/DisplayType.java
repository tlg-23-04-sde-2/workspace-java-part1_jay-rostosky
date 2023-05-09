package com.entertainment;

/*
 * This provides for exactly 5 instances of DisplayType.
 * An enum type has a FIXED number of NAMED instances.
 *
 * These are DisplayType objects, NOT Strings.
 *
 * They are referenced as
 *  DisplayType.LED
 *  DisplayType.OLED
 *  DisplayType.PLASMA
 *  DisplayType.LCD
 *  DisplayType.CRT
 */
public enum DisplayType {
    LED, OLED, PLASMA, LCD, CRT
}