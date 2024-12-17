package com.example.Task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StampingAPI implements Visitor {
    private String groupId;

    @Override
    public void visit(Task<?> task) {
        task.setHeader("groupId", groupId);

    }
}