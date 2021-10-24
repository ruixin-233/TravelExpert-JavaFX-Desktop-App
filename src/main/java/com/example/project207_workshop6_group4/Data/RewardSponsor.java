/**
 * Author: Laura Luo
 * Date: Oct 18, 2021
 * Project 207 - WorkShop6
 */

package com.example.project207_workshop6_group4.Data;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class RewardSponsor {
    private SimpleIntegerProperty rwdSponsorId;
    private SimpleStringProperty rwdSponsorName;
    //private SimpleStringProperty rwdDecription;

    public RewardSponsor(int rwdSponsorId, String rwdSponsorName) {
        this.rwdSponsorId = new SimpleIntegerProperty(rwdSponsorId);
        this.rwdSponsorName = new SimpleStringProperty(rwdSponsorName);
    }

    public int getRwdSponsorId() {
        return rwdSponsorId.get();
    }

    public SimpleIntegerProperty rwdSponsorIdProperty() {
        return rwdSponsorId;
    }

    public void setRwdSponsorId(int rwdSponsorId) {
        this.rwdSponsorId.set(rwdSponsorId);
    }

    public String getRwdSponsorName() {
        return rwdSponsorName.get();
    }

    public SimpleStringProperty rwdSponsorNameProperty() {
        return rwdSponsorName;
    }

    public void setRwdSponsorName(String rwdSponsorName) {
        this.rwdSponsorName.set(rwdSponsorName);
    }
}
