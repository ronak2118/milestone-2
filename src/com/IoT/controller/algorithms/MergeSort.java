package com.IoT.controller.algorithms;

import com.IoT.model.DeviceModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements Merge Sort to sort DeviceModel objects by devId.
 * 
 * @author Prithivi
 */
public class MergeSort {
    
    /**
     * Sorts a list of DeviceModel objects by their devId in ascending or
     * descending order using Merge Sort.
     *
     * @param deviceList the list of DeviceModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    public List<DeviceModel> sortByDevName(List<DeviceModel> deviceList, boolean isDesc) {
        if (deviceList == null || deviceList.isEmpty()) {
            throw new IllegalArgumentException("Device list cannot be null or empty.");
        }
        
        return mergeSort(deviceList, isDesc);
    }

    /**
     * Recursively sorts the list using Merge Sort.
     *
     * @param deviceList the list to be sorted
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the sorted list
     */
    private List<DeviceModel> mergeSort(List<DeviceModel> deviceList, boolean isDesc) {
        if (deviceList.size() <= 1) {
            return deviceList;
        }

        // Split the list into two halves
        int mid = deviceList.size() / 2;
        List<DeviceModel> left = new ArrayList<>(deviceList.subList(0, mid));
        List<DeviceModel> right = new ArrayList<>(deviceList.subList(mid, deviceList.size()));

        // Recursively sort both halves
        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        // Merge the sorted halves
        return merge(left, right, isDesc);
    }

    /**
     * Merges two sorted lists into a single sorted list.
     *
     * @param left the left sorted list
     * @param right the right sorted list
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return the merged sorted list
     */
    private List<DeviceModel> merge(List<DeviceModel> left, List<DeviceModel> right, boolean isDesc) {
        List<DeviceModel> merged = new ArrayList<>();
        int i = 0, j = 0;

        // Merge elements from both lists in sorted order
        while (i < left.size() && j < right.size()) {
            if (shouldTakeLeft(left.get(i).getDevId(), right.get(j).getDevId(), isDesc)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements from left list
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        // Add remaining elements from right list
        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }

    /**
     * Determines whether to take the left element based on the sort order.
     *
     * @param leftId the devId of the left element
     * @param rightId the devId of the right element
     * @param isDesc specifies the sort order (true for descending, false for ascending)
     * @return true if the left element should be taken; false otherwise
     */
    private boolean shouldTakeLeft(int leftId, int rightId, boolean isDesc) {
        return isDesc ? leftId > rightId : leftId < rightId;
    }
}