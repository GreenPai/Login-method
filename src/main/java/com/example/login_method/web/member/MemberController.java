package com.example.login_method.web.member;

import com.example.login_method.domain.member.Member;
import com.example.login_method.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 회원가입을 위한 컨트롤러입니다.
 */


@RequiredArgsConstructor
@Controller
@Slf4j
@RequestMapping("/members")
public class MemberController {
    private final MemberRepository memberRepository;



}
