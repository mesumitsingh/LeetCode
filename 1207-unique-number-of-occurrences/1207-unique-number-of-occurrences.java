class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> list = new ArrayList<>(); 
        int count=0; 

        HashSet<Integer> set = new HashSet<>(); 
        for(int num: arr){
            set.add(num);
        }

        List<Integer> setAsList = new ArrayList<>(set); 

        List<Integer> arrList = new ArrayList<>(); 
        for(int num: arr){
            arrList.add(num); 
        }

        for(int i=0; i<set.size(); i++){
            for(int j=0; j<arr.length; j++){
                if(arrList.get(j).equals(setAsList.get(i))){
                    count++;
                }
            }
            if(count!=0){
                list.add(count); 
            }
            count=0;
        }

        return list.size() == new HashSet<>(list).size() && !list.isEmpty(); 
    }
}