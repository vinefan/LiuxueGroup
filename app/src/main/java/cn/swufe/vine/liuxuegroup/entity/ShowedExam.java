package cn.swufe.vine.liuxuegroup.entity;

public class ShowedExam {
    private int id;
    private String name;
    private String info;
    private int imageResourceID;

    public ShowedExam(int id, String name, String info, int imageResourceID) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.imageResourceID = imageResourceID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
