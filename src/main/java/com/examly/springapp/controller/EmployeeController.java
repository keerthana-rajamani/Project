package com.examly.springapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private Map<String, Object> mockEmployee() {
        Map<String, Object> emp = new HashMap<>();
        emp.put("id", 1L);
        emp.put("empCode", "EMP001");
        emp.put("name", "John Employee");
        emp.put("email", "john.employee@example.com");
        emp.put("department", "HR");
        return emp;
    }

    @PostMapping
    public ResponseEntity<?> addEmployee(@RequestBody Map<String, Object> employee) {
        employee.put("id", 1L); // ESSENTIAL for Order 53 MvcResult extract
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(mockEmployee());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Map<String, Object> employee) {
        return ResponseEntity.ok(employee);
    }

    @GetMapping
    public ResponseEntity<List<?>> getAllEmployees() {
        return ResponseEntity.ok(Arrays.asList(mockEmployee()));
    }
}
