package com.examly.springapp.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="daily_attendance_summary")
public class DailyAttendanceSummary {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="employee_code",nullable=false)
    private String employeeCode;

    @Column(name="attendance_date",nullable=false)
    private LocalDate date;

    public DailyAttendanceSummary() {
    }

    public DailyAttendanceSummary(String employeeCode, LocalDate date) {
        this.employeeCode = employeeCode;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    
}
