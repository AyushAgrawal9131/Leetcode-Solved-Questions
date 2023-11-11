class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Map<Integer,Integer>map = new HashMap<>();
        // for(int i = 0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         map.put(nums[i],map.get(nums[i])+1);
            
        //     }
        //     else{
        //         map.put(nums[i],1);
        //     }
            
        // }
        // for(int i = 0;i<nums.length;i++){
        //     if(map.get(nums[i])>1){
        //         return true;
        //     }
        // }
        // return false;

        HashSet<Integer>set = new HashSet<>();
        for(int i:nums){
            
            if(set.contains(i)){
                return true;
            }   
            set.add(i);     
        }
        return false;
}
}