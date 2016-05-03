package com.bvd.deutscheverben.Datai;

import java.util.List;

/**
 * Created by Vadim on 26.09.2015.
 */
public class Verb {
    private long mIdVerb = -1;
    private String mVerb = null;
    private String mGrundVerb = null;
    private long mVerbRaiting = -1;
    private List<VerbBedeutung> mBedeutungen;

    private boolean mIsReflexiv = false;
    private boolean mIsModal = false;
    private boolean mIsTransitiv = false;

    private boolean mIsVerivied = false;

    public int getBedeutungenCount() {
        return mBedeutungen.size();
    }

    public VerbBedeutung getBedeutung(int index) {
        if (!mBedeutungen.isEmpty() && index >= 0 && index < mBedeutungen.size())
            return mBedeutungen.get(index);
        else
            return null;
    }

    public List<VerbBedeutung> getBedeutungen() {
        return mBedeutungen;
    }

    public void addBedeutung(VerbBedeutung bedeutung) {
        //this.mBedeutungen = mBedeutungen;
    }

    public void setBedeutungen(List<VerbBedeutung> bedeutungen) {
        //this.mBedeutungen = mBedeutungen;
    }

    public String getGrundVerb() { return mGrundVerb; }
    public void setGrundVerb(String grundVerb) { this.mGrundVerb = grundVerb; }

    public long getIdVerb() {
        return mIdVerb;
    }
    public void setIdVerb(long idVerb) {
        this.mIdVerb = idVerb;
    }

    public String getVerb() {
        return mVerb;
    }
    public void setVerb(String verb) {
        this.mVerb = verb;
    }

    public long getVerbRaiting() {
        return mVerbRaiting;
    }
    public void setVerbRaiting(long verbRaiting) {
        this.mVerbRaiting = verbRaiting;
    }

    public boolean isVerivied() { return this.mIsVerivied; }
    public void setVerivied(boolean verivied) { this.mIsVerivied = verivied; }

    public boolean isReflexiv() { return mIsReflexiv; }
    public void setReflexiv(boolean isReflexiv) { this.mIsReflexiv = isReflexiv; }

    public boolean isTransitiv() { return mIsTransitiv; }
    public void setTransitiv(boolean isTransitiv) { this.mIsTransitiv = isTransitiv; }

    public boolean isModal() { return mIsModal; }
    public void setModal(boolean isModal) { this.mIsModal = isModal; }

}
