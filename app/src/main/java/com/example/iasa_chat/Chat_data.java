package com.example.iasa_chat;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Chat_data{
    private String nick;
    private String msg;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Chat_data(String nick, String msg){
        this.nick=nick;
        this.msg=msg;
    }
    public Chat_data(){
        this("nick","msg");
    }
}