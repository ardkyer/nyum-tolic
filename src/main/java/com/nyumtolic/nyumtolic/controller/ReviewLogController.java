package com.nyumtolic.nyumtolic.controller;

import com.nyumtolic.nyumtolic.domain.ReviewLog;
import com.nyumtolic.nyumtolic.service.ReviewLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/review-logs")
@RequiredArgsConstructor
public class ReviewLogController {

    private final ReviewLogService reviewLogService;

    @GetMapping
    public List<ReviewLog> getAllReviewLogs() {
        return reviewLogService.getAllReviewLogs();  // 모든 리뷰 기록
    }

    @GetMapping("/user/{userId}")
    public List<ReviewLog> getReviewLogsByUser(@PathVariable Long userId) {
        return reviewLogService.getReviewLogsByUserId(userId);  // 특정 사용자의 리뷰 기록
    }
}

