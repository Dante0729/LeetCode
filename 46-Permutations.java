class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permute = new ArrayList<>();
        if(nums.length==0){
            return permute;
        }
        permutation(0,nums,new ArrayList(),permute);
        return permute;
    }
    public void permutation(int index,int[] nums,List<Integer> list,List<List<Integer>> permute){
           
        if(list.size()==nums.length){
            permute.add(new ArrayList<>(list));
            return;
        }
            
        
        for(int i=index;i<nums.length;i++){
            if (list.contains(nums[i])) {
                continue; 
            }
            list.add(nums[i]);
            permutation(index,nums,list,permute);
            list.remove(list.size()-1);
        }
    }
}