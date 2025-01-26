package com.problem_statements.hospital_patient_management;
import java.util.ArrayList;
public interface MedicalRecord {
    void addRecord(String record);
    ArrayList<String> viewRecords();
}