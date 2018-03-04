package com.lounah.silkapp.data.model;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.lounah.silkapp.data.converters.TimeStampConverter;
import com.stfalcon.chatkit.commons.models.IMessage;
import com.stfalcon.chatkit.commons.models.IUser;

import java.util.Date;

@Entity
public class Message {

    @NonNull
    @PrimaryKey
    private final int from_id;

    private final int to_id;

    private final String text;

    @TypeConverters(TimeStampConverter.class)
    private final Date date;

    private final String status;

    public Message(int from_id, int to_id, String text, Date date, String status) {
        this.from_id = from_id;
        this.to_id = to_id;
        this.text = text;
        this.date = date;
        this.status = status;
    }



    public int getFrom_id() {
        return from_id;
    }

    public int getTo_id() {
        return to_id;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
}


