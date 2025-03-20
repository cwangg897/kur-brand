package com.kurbrand.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberQueryService memberQueryService;
    private final MemberCommandService memberCommandService;



}
