package domain;

public class LikesInfo {
    private int count;
    private int canLike;
    private int canPublish;
    private int userLike;


    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }


    public int getUserLike() {
        return userLike;
    }

    public void setUserLike(int userLike) {
        this.userLike = userLike;
    }
}
