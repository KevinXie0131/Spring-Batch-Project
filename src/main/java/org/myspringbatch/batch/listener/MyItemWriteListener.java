package org.myspringbatch.batch.listener;

import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

public class MyItemWriteListener implements ItemWriteListener {
    @Override
    public void beforeWrite(List list) {
        System.out.println("before Write");
    }

    @Override
    public void afterWrite(List list) {
        System.out.println("after Write");
    }

    @Override
    public void onWriteError(Exception e, List list) {
        System.out.println("Write Error");
    }
}
