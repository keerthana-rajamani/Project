// package com.examly.springapp.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Enumerated;
// import jakarta.persistence.EnumType;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.JoinColumn;
// import java.time.LocalDateTime;

// @Entity
// public class AttendanceLog {
//     @Id
//     @GeneratedValue(strategy=GenerationType.AUTO)
//     private Long id;

//     @ManyToOne
//     @JoinColumn(name="employee_id",nullable=false)
//     private Employee employee;
//     private LocalDateTime timestamp;

//     @Enumerated(EnumType.STRING)
//     private AttendanceLogStatus status;

//     protected AttendanceLog()
//     {

//     }
    
//     public AttendanceLog(Employee employee, LocalDateTime timestamp, AttendanceLogStatus status) {
//         this.employee = employee;
//         this.timestamp = timestamp;
//         this.status = status;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public Employee getEmployee() {
//         return employee;
//     }

//     public void setEmployee(Employee employee) {
//         this.employee = employee;
//     }

//     public LocalDateTime getTimestamp() {
//         return timestamp;
//     }

//     public void setTimestamp(LocalDateTime timestamp) {
//         this.timestamp = timestamp;
//     }

//     public AttendanceLogStatus getStatus() {
//         return status;
//     }

//     public void setStatus(AttendanceLogStatus status) {
//         this.status = status;
//     }
    
// }
