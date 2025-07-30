class Solution {

            private Map<String, PriorityQueue<String>> graph = new HashMap<>();
            private LinkedList<String> result = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        for(List<String> ticket : tickets) {
            graph.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>()).add(ticket.get(1));
        }

        dfs("JFK");

        return result;
    }

    private void dfs(String airport) {
        PriorityQueue<String> destination = graph.get(airport);

        while(destination != null && !destination.isEmpty()) {
            dfs(destination.poll());
        }

        result.addFirst(airport);
    }
}