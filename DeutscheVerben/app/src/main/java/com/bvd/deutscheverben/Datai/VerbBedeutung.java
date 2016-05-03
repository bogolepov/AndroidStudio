package com.bvd.deutscheverben.Datai;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vadim on 26.09.2015.
 */
public class VerbBedeutung {
    public class Preposition {
        private String mValue = null;
        private String mInfo = null;
        private Kasus mKasus = Kasus.NONE;

        Preposition() {
            //
        }

        String getValue() { return mValue; }
        void setValue(String value) { mValue = value; }

        String getInfo() { return mInfo; }
        void setInfo(String info) { mInfo = info; }

        Kasus getKasus() { return mKasus; }
        void setKasus(Kasus kasus) { mKasus = kasus; }
    }

    private long mIdBedeutung = -1;
    private String mUbersetzung = null;
    private List<String> mSynonime;
    private List<String> mAntonime;
    private List<Preposition> mPrepositions;
    private String mBenutzung = null;
    private String mPerfektHilfsWort = null;
    
    public String getUbersetzung() {
        return mUbersetzung;
    }
    public void setUbersetzung(String ubersetzung) {
        mUbersetzung = ubersetzung;
    }

    public String getSynonime(){
        return mSynonime.isEmpty() ? "" : TextUtils.join(", ", mSynonime);
        /*
        String resValue = null;
        for (String val : mSynonime) {
            if (resValue != null) resValue += ", ";
            resValue += val;
        }
        return resValue;
        */
    }
    public void setSynonime(ArrayList<String> arrSynonime){
        //
    }

    public String getAntonime(){
        return mAntonime.isEmpty() ? "" : TextUtils.join(", ", mAntonime);
    }
    public void setAntonime(ArrayList<String> arrAntonime){
        //
    }

    public String getBenutzung() {
        return mBenutzung;
    }
    public void setBenutzung(String benutzung) {
        mBenutzung  = benutzung;
    }

    public String getPerfektHilfsWort() {
        return mPerfektHilfsWort;
    }
    public void setPerfektHilfsWort(String perfektHilfsWort) {
        mPerfektHilfsWort = perfektHilfsWort;
    }

    public long getIdBedeutung() {
        return mIdBedeutung;
    }
    public void setIdBedeutung(long id) {
        mIdBedeutung = id;
    }
}
