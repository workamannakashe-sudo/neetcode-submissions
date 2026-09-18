class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
      
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        // Find top k frequent
        for (int i = 0; i < k; i++) {

            int max = 0;
            int element = 0;

            for (int num : map.keySet()) {

                if (map.get(num) > max) {
                    max = map.get(num);
                    element = num;
                }
            }

            result[i] = element;
            map.remove(element);
        }

        return result;
    }
}
