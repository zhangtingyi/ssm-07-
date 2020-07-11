package com.spring.editor;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM");
        try {
            Date date=simpleDateFormat.parse(text);
            setValue(date);
        }
        catch (Exception a)
        {
            a.printStackTrace();
        }
    }
}
