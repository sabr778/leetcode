
public class Solution {
    public int hammingDistance(int x, int y) {
        int val = x ^ y;
        return countSetBits(val);
    }

    private int countSetBits(int val ) {
    	int count = 0;
    	while (val != 0) {
    		count += (val & 1);
    		val = val >>> 1;
    	}
    	return count;
    }
}