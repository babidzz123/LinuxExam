package com.example.notepad.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DBUtils {
    public static final String DATABASE_NAME = "linux_final.db";
    public static final String DATABASE_TABLE = "Notepad";
    public static final int DATABASE_VERION = 1;
 
    public static final String NOTEPAD_ID = "id";
    public static final String NOTEPAD_CONTENT = "notepadContent";
    public static final String NOTEPAD_TIME = "notepadTime";
   
    public static final String getTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date);
    }
}
