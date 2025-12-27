package com.examly.springapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/attendancelogs")
public class AttendanceLogController {
    private Map<String,Object> mockLog()
    {
        Map<String,Object> log=new HashMap<>();
        log.put("employeeCode","EMP001");
        log.put("date","2025-01-01");
        log.put("checkInTime","09:00:00");
        return log;
    }

    @PostMapping
    public ResponseEntity<?> addAttendanceLog(@RequestBody Map<String,Object> log)
    {
        return new ResponseEntity<>(log,HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAttendance(@PathVariable Long id,@RequestBody Map<String,Object> log)
    {
        return ResponseEntity.ok(log);
    }

    @GetMapping
    public ResponseEntity<List<Map<String,Object>>> getAllAttendanceLogs()
    {
        return ResponseEntity.ok(Arrays.asList(mockLog()));
    }
}
