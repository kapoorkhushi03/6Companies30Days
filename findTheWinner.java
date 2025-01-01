class Solution {
    public int findTheWinner(int n, int k) {
        int curr = 0; 
        int remaining = n; 
        int[] vis = new int[n]; 

        while (remaining > 1) {
            int steps = k - 1; 
            
            
            while (steps > 0) {
                curr = (curr + 1) % n; 
                if (vis[curr] == 0) { 
                    steps--;
                }
            }

            vis[curr] = 1; 
            remaining--;

            
            while (vis[curr] == 1) {
                curr = (curr + 1) % n; 
            }
        }

       
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                return i + 1; 
            }
        }

        return -1; 
    }
}
