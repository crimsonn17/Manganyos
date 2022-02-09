/*
 *
 *  Created by Muhamamd Sya'ban Nugroho
 *  Desember 2019
 * /
 */

package com.application.manganyos.models;

import com.google.gson.annotations.SerializedName;

public class InternetTimeResponse {
    @SerializedName("time")
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }
}

