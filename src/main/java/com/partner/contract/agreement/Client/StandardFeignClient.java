package com.partner.contract.agreement.Client;

import com.partner.contract.agreement.Client.dto.DocumentExistsResponseDto;
import com.partner.contract.common.enums.AiStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("standard-service")
public interface StandardFeignClient {

    @GetMapping("/standards/internal/exists")
    DocumentExistsResponseDto doesStandardExistByCategoryIdAndAiState(@RequestParam Long categoryId,
                                                                      @RequestParam AiStatus aiState);
}
