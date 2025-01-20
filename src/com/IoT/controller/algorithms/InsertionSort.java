package com.IoT.controller.algorithms;

import com.IoT.model.DeviceModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Implements Insertion Sort to sort DeviceModel objects by devId.
 * 
 * @author Prithivi
 */
public class InsertionSort {
    List<DeviceModel> deviceSortList;

    public InsertionSort() {
        deviceSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of DeviceModel objects by their total in ascending order.
     *
     * @param deviceList the list of DeviceModel objects to be sorted
     * @return the sorted list
     */
    public List<DeviceModel> sortByTotal(List<DeviceModel> deviceList) {
        this.deviceSortList.clear();
        this.deviceSortList.addAll(deviceList);
        
        if (deviceSortList == null || deviceSortList.isEmpty()) {
            throw new IllegalArgumentException("Device list cannot be null or empty.");
        }

        // Perform Insertion Sort
        for (int i = 1; i < deviceSortList.size(); i++) {
            DeviceModel key = deviceSortList.get(i);
            int j = i - 1;

            // Move elements of deviceSortList[0..i-1], that are greater than key's total,
            // to one position ahead of their current position
            while (j >= 0 && deviceSortList.get(j).getTotal() > key.getTotal()) {
                deviceSortList.set(j + 1, deviceSortList.get(j));
                j = j - 1;
            }
            deviceSortList.set(j + 1, key);
        }

        return deviceSortList;
    }
}
