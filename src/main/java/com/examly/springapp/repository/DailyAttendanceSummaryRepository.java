package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.examly.springapp.model.DailyAttendanceSummary;
import java.time.LocalDate;

public interface DailyAttendanceSummaryRepository extends JpaRepository<DailyAttendanceSummary, Long> {
    Page<DailyAttendanceSummary> findByEmployeeCodeAndDateBetween(String employeeCode, LocalDate startDate, LocalDate endDate, Pageable pageable);
}
