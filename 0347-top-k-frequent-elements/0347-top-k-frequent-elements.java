class Solution {
    public int[] topKFrequent(int[] nums, int k) {
 
        //Store number-> freq
        HashMap<Integer, Integer> map = new HashMap<>();

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        //now traverse the map and store the items in heap

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));

        List<Integer> keys = new ArrayList<>(map.keySet());

        //adding every unique number to the heap
        for(int i=0; i<keys.size(); i++){

            int number = keys.get(i);

            minHeap.offer(number);

            //keep only the k most freq numbers
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i] = minHeap.poll();
        }
        return result;

        
    }
}