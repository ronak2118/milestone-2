package com.IoT.controller.algorithms;

import com.IoT.model.IoT;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prithivi
 */
public class SelectionSort {
    List<IoT> deviceSortList;

    
    public SelectionSort(){
        deviceSortList = new ArrayList<>();
    }
    /**
     * Sorts a list of StudentModel objects by their LMU ID in ascending or
     * descending order.
     *
     * @param deviceList the list of StudentModel objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<IoT> sortByLmuId(List<IoT> deviceList, boolean isDesc) {
        this.deviceSortList.clear();
        this.deviceSortList.addAll(deviceList);
        if (deviceSortList == null || deviceSortList.isEmpty()) {
            throw new IllegalArgumentException("device list cannot be null or empty.");
        }

        for (int i = 0; i < deviceSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(deviceSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(deviceSortList, i, extremumIndex);
            }
        }

        return deviceSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param studentSortList the list of StudentModel objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<IoT> deviceSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < deviceSortList.size(); j++) {
            if (shouldSwap(deviceSortList.get(j).getDevId(), deviceSortList.get(extremumIndex).getDevId(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param studentSortList the list of StudentModel objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<IoT> studentSortList, int i, int j) {
        IoT temp = studentSortList.get(i);
        studentSortList.set(i, studentSortList.get(j));
        studentSortList.set(j, temp);
    }
}
