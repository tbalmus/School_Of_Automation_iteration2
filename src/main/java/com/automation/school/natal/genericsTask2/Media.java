package com.automation.school.natal.genericsTask2;

import java.time.LocalDate;

public abstract class Media {
    protected final String name;
    protected final LocalDate issueDate;

    public Media(String name) {
        this.name = name;
        this.issueDate = LocalDate.now();
    }

    public Media(String name, LocalDate issueDate) {
        this.name = name;
        this.issueDate = issueDate;
    }

    public String getName() {
        return name;
    }


    public LocalDate getIssueDate() {
        return issueDate;
    }

    public abstract void issue();

}
