package com.examly.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.examly.springapp.model.DailyAttendanceSummary;
import com.examly.springapp.repository.DailyAttendanceSummaryRepository;
import java.time.LocalDate;
@Service
public class DailyAttendanceSummaryService {
    @Autowired
    private DailyAttendanceSummaryRepository summaryRepository;

    public DailyAttendanceSummary saveSummary(DailyAttendanceSummary summary)
    {
        return summaryRepository.save(summary);
    }

    public Page<DailyAttendanceSummary> findByEmployeeCodeAndDateRange(
        String employeeCode,LocalDate startDate,LocalDate endDate,Pageable peageable)
        {
            return summaryRepository.findByEmployeeCodeAndDateBetween(
                employeeCode,startDate,endDate,peageable);
        }
}
