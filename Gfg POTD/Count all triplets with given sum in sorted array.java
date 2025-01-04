// https://www.geeksforgeeks.org/problems/count-all-triplets-with-given-sum-in-sorted-array/1
// Algorithm: Two-Pointer Technique

class Solution {
    public int countTriplets(int[] arr, int target) {
        int count = 0; // initial count
        int n = arr.length; // total length

        for (int i = 0; i < n - 3; i++) { // a big loop on the array
            int j = i + 1; // 1 bigger than i
            int k = n - 1; // 1 smaller than last
            while (j > k){ // j should always be smaller than k
            int sum = arr[i] + arr[j] + arr[k]; // total sum
            if (sum > target){k--;} // if sum is bigger, take a step back from last
            else if (sum < target){j++;} // is sum is smaller, take a step front
            else if (sum == target) {
                count++;
                // this is used if we have duplicates
                int temp = j + 1; // this will check a element further than j
                while(temp < k && arr[temp] == arr[j]){ // if temp and j are equal
                    count++;
                    temp++;
                }
                k--; // no duplicates left, take a step back from k
            }
            }
        }
        return count;
}
}
