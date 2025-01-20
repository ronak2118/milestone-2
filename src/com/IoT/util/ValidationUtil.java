package com.IoT.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern DEV_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]{1,40}$");
    private static final Pattern DEV_ID_PATTERN = Pattern.compile("^[1-9]\\d{0,9}$"); // 1 to 10 digits, cannot start with 0
    private static final Pattern SERIAL_NUMBER_PATTERN = Pattern.compile("^.{4,10}$"); // 4 to 20 characters
    private static final Pattern TYPE_PATTERN = Pattern.compile("^(sensor|microprocessor|electric)$");
    private static final Pattern AMOUNT_PATTERN = Pattern.compile("^\\d{1,20}$"); // 1 to 20 digits
    private static final Pattern TOTAL_PATTERN = Pattern.compile("^\\d{1,20}$"); // 1 to 20 digits
    private static final Pattern QUANTITY_PATTERN = Pattern.compile("^\\d{1,20}$"); // 1 to 20 digits

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isValidDevName(String devName) {
        return !isNullOrEmpty(devName) && DEV_NAME_PATTERN.matcher(devName).matches();
    }

    public static boolean isValidDevId(String devId) {
        return !isNullOrEmpty(devId) && DEV_ID_PATTERN.matcher(devId).matches();
    }

    public static boolean isValidSerialNumber(String serialNumber) {
        return !isNullOrEmpty(serialNumber) && SERIAL_NUMBER_PATTERN.matcher(serialNumber).matches();
    }

    public static boolean isValidType(String type) {
        return !isNullOrEmpty(type) && TYPE_PATTERN.matcher(type).matches();
    }

    public static boolean isValidAmount(String amount) {
        return !isNullOrEmpty(amount) && AMOUNT_PATTERN.matcher(amount).matches();
    }

    public static boolean isValidTotal(String total) {
        return !isNullOrEmpty(total) && TOTAL_PATTERN.matcher(total).matches();
    }

    public static boolean isValidQuantity(String quantity) {
        return !isNullOrEmpty(quantity) && QUANTITY_PATTERN.matcher(quantity).matches();
    }

    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
}