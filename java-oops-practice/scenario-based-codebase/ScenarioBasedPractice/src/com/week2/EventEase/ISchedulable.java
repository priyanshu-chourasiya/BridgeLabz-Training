package com.week2.EventEase;

public interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}

