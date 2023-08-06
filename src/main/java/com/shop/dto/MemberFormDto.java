package com.shop.dto;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemberFormDto { // 회원 가입 화면으로부터 넘어오는 가입 정보를 담을 dto

    private String name;

    private String email;

    private String password;

    private String address;
}
