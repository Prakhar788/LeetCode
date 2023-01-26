class Solution {
    public int twoEggDrop(int n) {
	int count=1;
	for(int i=n-1; i>0; i-=count)
		count++;
	return count;
}
}