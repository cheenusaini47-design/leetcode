class Solution {
    public void bt(List<Integer> l,int f,int n,int k, List<List<Integer>> res){
        if(l.size()== k){
            res.add( new ArrayList<>(l));
            return;
        }
        for(int i = f ; i <= n;i=i+1){
            l.add(i);
            bt(l,i+1,n,k,res);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        bt(l,1,n,k,res);
        return res;
        
    }
}