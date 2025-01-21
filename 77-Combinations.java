class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combine = new ArrayList<>();
         backTrack(1,combine,n,new ArrayList<>(),k);
        return combine;
    }
    public void backTrack(int index,List<List<Integer>> combine,int n,List<Integer>current,int k){
        if(current.size()==k){
         combine.add(new ArrayList<>(current));
         return;
        }

        for(int i=index;i<=n;i++){
            current.add(i);
            backTrack(i+1,combine,n,current,k);
            current.remove(current.size()-1);
        }
    }
}