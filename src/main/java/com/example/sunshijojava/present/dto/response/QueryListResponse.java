package com.example.sunshijojava.present.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
@Builder
public class QueryListResponse {
    private List<QueryResponse> list;
}
