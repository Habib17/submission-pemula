package com.example.habib.listviewproject;

public class SocialType {
    public SocialType(int mImg, String mCountryName, String mDesc) {
        this.mImg = mImg;
        this.mCountryName = mCountryName;
        this.mDesc = mDesc;
    }

    int mImg;
    String mCountryName;

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc;
    }

    String mDesc;

    public int getmImg() {
        return mImg;
    }

    public void setmImg(int mImg) {
        this.mImg = mImg;
    }

    public String getmCountryName() {
        return mCountryName;
    }

    public void setmCountryName(String mCountryName) {
        this.mCountryName = mCountryName;
    }

    public SocialType() {
    }


}
