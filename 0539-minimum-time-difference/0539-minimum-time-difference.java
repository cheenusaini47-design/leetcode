class Solution {
    public int findMinDifference(List<String> timepoints) {
        int[] mi = new int[timepoints.size()];
        for(int i = 0 ;i<timepoints.size();i++){
            String hr = timepoints.get(i).substring(0,2);
             String min = timepoints.get(i).substring(3);
             int minsval = Integer.parseInt(hr)*60+  Integer.parseInt(min);
             mi[i]= minsval;
        }
        Arrays.sort(mi);
        int minn = Integer.MAX_VALUE;
        for(int i = 0 ;i<mi.length-1;i++){
            int diff = mi[i+1] - mi[i];
            minn = Math.min( minn, diff);

        }
        return Math.min(minn,24*60-mi[mi.length-1]+ mi[0]);

    }
}