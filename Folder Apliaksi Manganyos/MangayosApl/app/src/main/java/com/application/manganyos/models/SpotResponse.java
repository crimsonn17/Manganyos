/*
 *
 *  Created by Muhamamd Sya'ban Nugroho
 *  Desember 2019
 * /
 */

package com.application.manganyos.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class SpotResponse {
    @SerializedName("time")
    private String time;
    @SerializedName("spots")
    private ArrayList<Spot> spotList;

    public String getTime() {
        return time;
    }

    public ArrayList<Spot> getSpotList() {
        return spotList;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSpotList(ArrayList<Spot> spotList) {
        this.spotList = spotList;
    }
}
