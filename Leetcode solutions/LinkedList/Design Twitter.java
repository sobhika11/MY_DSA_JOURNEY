class Twitter {

    HashMap<Integer, HashSet<Integer>> followers;
    HashMap<Integer, ArrayList<int[]>> posts;
    int time = 0;

    public Twitter() {
        followers = new HashMap<>();
        posts = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        posts.putIfAbsent(userId, new ArrayList<>());
        posts.get(userId).add(new int[]{time++, tweetId});
    }
    
    public List<Integer> getNewsFeed(int userId) {

        followers.putIfAbsent(userId, new HashSet<>());
        followers.get(userId).add(userId);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0] - a[0]); 
        for(int foll : followers.get(userId)) {
            ArrayList<int[]> arr = posts.getOrDefault(foll, new ArrayList<>());
            for(int[] tweet : arr) {
                pq.add(tweet);
            }
        }

        List<Integer> result = new ArrayList<>();
        
        int count = 0;
        while(!pq.isEmpty() && count < 10) {
            result.add(pq.poll()[1]);
            count++;
        }

        return result;
    }
    
    public void follow(int followerId, int followeeId) {
        followers.putIfAbsent(followerId, new HashSet<>());
        followers.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followerId == followeeId) return; 
        if(followers.containsKey(followerId))
            followers.get(followerId).remove(followeeId);
    }
}