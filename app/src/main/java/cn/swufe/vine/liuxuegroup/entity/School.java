package cn.swufe.vine.liuxuegroup.entity;

public class School {
    private String schoolAbbr;
    private int logoImgID;

    public School(String schoolAbbr, int logoImgID) {
        this.schoolAbbr = schoolAbbr;
        this.logoImgID = logoImgID;
    }

    public String getSchoolAbbr() {
        return schoolAbbr;
    }

    public void setSchoolAbbr(String schoolAbbr) {
        this.schoolAbbr = schoolAbbr;
    }

    public int getLogoImgID() {
        return logoImgID;
    }

    public void setLogoImgID(int logoImgID) {
        this.logoImgID = logoImgID;
    }
}
