// https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1

public int maxWater(int arr[]) {
    int n = arr.length; // Length of the input array
    
    // If the array has less than 3 elements, no water can be trapped
    if(n < 3){
        return 0;
    }
    
    int left[] = new int[n];  // Array to store the max height to the left of each bar
    int right[] = new int[n]; // Array to store the max height to the right of each bar
    
    // Populate the left array with maximum heights from the left
    left[0] = arr[0];
    for(int i = 1; i < n; i++){
        left[i] = Math.max(left[i-1], arr[i]);
    }
    
    // Populate the right array with maximum heights from the right
    right[n-1] = arr[n-1];
    for(int i = n-2; i >= 0; i--){
        right[i] = Math.max(right[i+1], arr[i]);
    }
    
    int ans = 0; // Variable to store the total trapped water
    
    // Calculate trapped water for each bar
    for(int i = 0; i < n; i++){
        ans += Math.min(left[i], right[i]) - arr[i]; // Water trapped = min(left max, right max) - current height
    }
    
    return ans; // Return the total trapped water
}
```

This should make it clear what each part of the code is doing!
