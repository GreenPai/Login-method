package com.example.login_method.domain.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


import java.util.HashMap;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private static HashMap<Long, Member> store = new HashMap<>();




}
