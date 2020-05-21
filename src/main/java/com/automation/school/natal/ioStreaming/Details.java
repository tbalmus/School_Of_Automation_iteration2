package com.automation.school.natal.ioStreaming;

import java.util.ArrayList;
import java.util.List;

public class Details {
    private int count;
    private List<Long> lines;

    public Details() {
        this.count = 0;
        this.lines=new ArrayList<>();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Long> getLines() {
        return lines;
    }

    public void setLines(List<Long> lines) {
        this.lines = lines;
    }
    public void incrementCount(){
        this.count++;
    }
    public void addLine(Long l){
        this.lines.add(l);
        incrementCount();
    }
    public String displayLines(){
        StringBuilder s=new StringBuilder();
        for (Long l : this.getLines())
            s.append(l).append("; ");
          return s.toString();
    }

}
