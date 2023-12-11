package scheduler;


public class User  {
    private String id;
    private Score score;
    
    public User(String id, Score score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return this.id;
    }

    public void addJob(Job job) {
    }
    
}
