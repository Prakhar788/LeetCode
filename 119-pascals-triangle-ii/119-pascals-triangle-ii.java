class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if(rowIndex == 0){
            return result;
        }
        long temp = 1;
        for(int i = 1; i < rowIndex; i++){
            temp = (temp *(rowIndex - (i - 1))) / i;
            result.add((int)temp);
        }
        result.add(1);
        return result;
    }
}