package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    //빈 -> 스프링 컨테이너가 관리하는 자바객체
    // -component annotation 자동등록 사용(스프링이 확인하고 자체적으로 bean으로 등록)
    // -configuration을 이용해 bean 직접 등록
    @Bean
    public MemberService memberService() {

        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {

        return new MemoryMemberRepository();
    }
}