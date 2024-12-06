package com.example.login_method.domain.login;

import com.example.login_method.domain.member.Member;
import com.example.login_method.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final MemberRepository memberRepository;

}
