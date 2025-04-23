package com.partner.contract.agreement.controller;

import com.partner.contract.agreement.service.AgreementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/agreements/internal")
public class AgreementInternalController {
    private final AgreementService agreementService;

    @GetMapping("/categories/check/{categoryId}")
    public Map<String, Boolean> existsByCategory(@PathVariable Long categoryId) {
        return Map.of("exists", agreementService.existsByCategory(categoryId));
    }
}
