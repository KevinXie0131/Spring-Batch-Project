package org.myspringbatch.batch.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class MyStepExecutionListener implements StepExecutionListener {
    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("++++++++++++before Step+++++++++++");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("++++++++++++after Step+++++++++++");
        return ExitStatus.COMPLETED;
    }
}
