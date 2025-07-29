class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {

        Map<String , PriorityQueue<String>> map = new HashMap<>();

        for(List<String> ticket : tickets){
            String from = ticket.get(0);
            String to = ticket.get(1);

            if(!map.containsKey(from)){
                map.put(from, new PriorityQueue<String>());
            }

            map.get(from).add(to);
        }

        LinkedList<String> result = new LinkedList<>();

        dfs("JFK", map , result);

         
        return result;
    }

    private void dfs(String airport ,Map<String , PriorityQueue<String>> map , List<String> result ){
            PriorityQueue<String> destinations = map.get(airport);

            while(destinations != null && !destinations.isEmpty()){
                dfs(destinations.poll(),map, result);
            }

            result.addFirst(airport);
        
    }
}