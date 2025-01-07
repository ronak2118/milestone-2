package com.IoT.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern DevNAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern Dev_ID_PATTERN = Pattern.compile("^\\d{7}$");
    private static final Pattern Type_PATTERN = Pattern.compile("^(sensor|microprocessor|electric)$");
    private static final Pattern Amount_PATTERN = Pattern.compile("^\\d{1}$");
    private static final Pattern Total_PATTERN = Pattern.compile("^\\d{1}$");
    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the name contains only alphabets and spaces.
     *
     * @param DevName the name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidDevName(String DevName) {
        return !isNullOrEmpty(DevName) && DevNAME_PATTERN.matcher(DevName).matches();
    }

    /**
     * Validates if the LMU ID is exactly 7 digits.
     *
     * @param DevId the LMU ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidDevId(String DevId) {
        return !isNullOrEmpty(DevId) && Dev_ID_PATTERN.matcher(DevId).matches();
    }

    /**
     * Validates if the program is one of the allowed options.
     *
     * @param Type the program to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidType(String Type) {
        return !isNullOrEmpty(Type) && Type_PATTERN.matcher(Type).matches();
    }

    /**
     * Validates if the contact number starts with 98 and has 10 digits in total.
     *
     * @param Amount the contact number to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidAmount(String Amount) {
        return !isNullOrEmpty(Amount) && Amount_PATTERN.matcher(Amount.toLowerCase()).matches();
    }

    /**
     * Validates if the age is between 18 and 70 (inclusive).
     *
     * @param Total the age to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTotal(String Total) {
        return !isNullOrEmpty(Total) && Total_PATTERN.matcher(Total.toLowerCase()).matches();
    }

    /**
     * Generic field validation utility that checks for non-empty and specific criteria.
     *
     * @param value      the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }

    public static boolean isValidAge(short age) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}