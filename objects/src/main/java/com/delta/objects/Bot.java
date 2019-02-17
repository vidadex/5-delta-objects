package com.delta.objects;

import android.util.Log;

public class Bot {
    public final static String creatorName = "UWEM";

    private String name = "ROBOT";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void talk(String whatToSay){
        Log.e(getName(), whatToSay);
    }
}
