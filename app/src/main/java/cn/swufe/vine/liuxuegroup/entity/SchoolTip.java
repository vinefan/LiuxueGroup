package cn.swufe.vine.liuxuegroup.entity;

public class SchoolTip {
    private int rank;
    private String title;
    private int remarkNum;
    private int loveNum;
    private boolean isLoved;
    private boolean isCollated;

    public SchoolTip(int rank, String title, int remarkNum, int loveNum, boolean isLoved, boolean isCollated) {
        this.rank = rank;
        this.title = title;
        this.remarkNum = remarkNum;
        this.loveNum = loveNum;
        this.isLoved = isLoved;
        this.isCollated = isCollated;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRemarkNum() {
        return remarkNum;
    }

    public void setRemarkNum(int remarkNum) {
        this.remarkNum = remarkNum;
    }

    public int getLoveNum() {
        return loveNum;
    }

    public void setLoveNum(int loveNum) {
        this.loveNum = loveNum;
    }

    public boolean isLoved() {
        return isLoved;
    }

    public void setLoved(boolean loved) {
        isLoved = loved;
    }

    public boolean isCollated() {
        return isCollated;
    }

    public void setCollated(boolean collated) {
        isCollated = collated;
    }
}
