package com.problem_statements.library_management_system;

public interface Reservable{
    void reserveItem(String borrowerName);

    boolean checkAvailability();
}