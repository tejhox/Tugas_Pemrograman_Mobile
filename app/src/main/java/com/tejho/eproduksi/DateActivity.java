package com.tejho.eproduksi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import android.widget.TextView;

public class DateActivity {
    private static Date currentDate;

    public DateActivity() {
        currentDate = new Date();
    }

    public static void setDate(TextView textView) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy", Locale.getDefault());
        String dateString = dateFormat.format(currentDate);
        textView.setText(dateString);
    }

    public void nextDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, 1);
        currentDate = calendar.getTime();
    }

    public void prevDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, -1);
        currentDate = calendar.getTime();
    }
}
