/*
 *
 *  Created by Muhamamd Sya'ban Nugroho
 *  Desember 2019
 * /
 */

package com.application.manganyos.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class ReservationResponse {
    @SerializedName("time")
    private String time;
    @SerializedName("reservation")
    private ArrayList<Reservation> reservationList;

    public String getTime() {
        return time;
    }

    public ArrayList<Reservation> getReservationList() {
        return reservationList;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReservationList(ArrayList<Reservation> reservationList) {
        this.reservationList = reservationList;
    }
}
