public class Solution {
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == x) cnt++;
        }
        return cnt;
    }
}
