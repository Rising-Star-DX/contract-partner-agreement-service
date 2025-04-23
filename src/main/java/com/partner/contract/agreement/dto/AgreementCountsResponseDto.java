package com.partner.contract.agreement.dto;

import lombok.Data;

@Data
public class AgreementCountsResponseDto {
    Long id;
    Long count;

    public AgreementCountsResponseDto(Long id, Long count) {
        this.id = id;
        this.count = count;
    }
}
