package com.benatt.androidtemplate.data.models;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * @author ben-mathu
 * @date 4/26/23
 */
@Entity
public class Example {
    @PrimaryKey
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
