package com.example.android.yodha;

public class Stories {
    private String mText;
    private String mText2;
    private  int mImageresourceid;
    private  String murl;

    public Stories(String Text,String Text2,int ImageResourceId,String url) {
        mText=Text;
        mText2=Text2;
        mImageresourceid=ImageResourceId;
        murl=url;
    }

    public  String getmText() {
        return mText;
    }
    public String getmText2(){return  mText2;}


    public  String getmUrl() {
        return murl;
    }

    public int getmImageresourceid() {
        return mImageresourceid;
    }

}