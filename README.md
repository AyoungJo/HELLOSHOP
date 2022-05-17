# HELLO SHOP
[실전! 스프링 부트와 JPA 활용1 - 웹 애플리케이션 개발](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1/dashboard)
<br>**인프런 강의 - 스프링 부트와 JPA 활용1 by 김영한** 강의를 통해 실습된 프로젝트 입니다.<br>

강의 정리 및 설명은 Velog에서 확인 가능합니다. 👉
[Velog](https://velog.io/@joajoa/series/%EC%8A%A4%ED%94%84%EB%A7%81-%EB%B6%80%ED%8A%B8%EC%99%80-JPA-%ED%99%9C%EC%9A%A9)

<img src="https://user-images.githubusercontent.com/102283529/168781189-fa6f0c81-171e-46a1-bb5f-b249fa5dcc66.png" width="700px">

HELLO SHOP - 상품을 등록하고 주문할 수 있는 쇼핑몰

스프링 부트와 JPA를 활용한 회원, 상품, 주문 도메인이 있는 간단한 자바 웹 애플리케이션 입니다.

## 🔧 프레임워크
* IntelliJ
* H2 Database
* Postman ( MemberApiController.java )
* Springboot
* Hibernate
* Bootstrap

## 사용 기술
* JPA
* Thymeleaf
* Lombok

### ⌨ 백엔드
* Java

### 🖥 프론트 엔드
* CSS
* HTML
* Javascript

## 주요 기능
**주요 기능을 보기에 앞서 알고가야 할 내용!** <br>
강의에서는 스프링부트와 JPA 활용 방법을 익히기 위해 간단하게 구현하였습니다. 
1. 회원 가입 기능은 구현하였으나 로그인 기능은 추가하지 않았습니다
2. 회원과 관리자를 따로 구분하지 않았습니다.
3. 상품 주문 시 등록된 회원 중에 상품을 주문하고자 하는 회원을 골라 주문하도록 하였습니다.
4. pk값을 따로 재조정하는 기능은 추가하지 않았습니다.
5. 앨범, 도서, 영화 엔티티 중에 도서 엔티티만 사용하였습니다.


* 회원 기능  
1. 회원 등록<br>
회원 이름은 필수로 입력해야합니다.
<img src="https://user-images.githubusercontent.com/102283529/168790052-f1300bf6-e617-4645-bb0f-b3e0080db26c.png" width="600px">
2. 회원 목록
<img src="https://user-images.githubusercontent.com/102283529/168791074-086b4cda-b296-44f6-a606-c1d52b161bdc.png" width="600px">

* 상품 기능
1. 상품 등록<br>
상품명, 가격, 수량은 필수로 입력해야합니다.
 <img src="https://user-images.githubusercontent.com/102283529/168790286-6dabea24-76da-4733-b9e1-62e7659cd4e5.png" width="600px">
 
2. 상품 목록
  <img src="https://user-images.githubusercontent.com/102283529/168791452-b89ecf5f-e435-4615-a2ca-2a634a5e604a.png" width="600px"> 
  
3. 상품 수정<br>
  정보를 수정하고자 하는 상품을 선택해 수정 하고 수정된 내역을 확인할 수 있습니다.
  <img src="https://user-images.githubusercontent.com/102283529/168791568-ba2ba5dd-f7e0-489d-953b-b2efd95c7309.png" width="600px">
  <img src="https://user-images.githubusercontent.com/102283529/168791680-7891851c-6cc5-47fa-830e-7445e4e34d3f.png" width="600px">


* 주문 기능 
 1. 상품 주문
 <img src="https://user-images.githubusercontent.com/102283529/168790500-2dac2a9d-1001-4c6d-990c-1cf1c07726ea.png" width="600px">

 2. 주문 내역 조회<br>
 찾고자하는 회원명과 주문상태 선택을 통해 원하는 정보를 검색할 수 있습니다.
<img src="https://user-images.githubusercontent.com/102283529/168794171-f520bc43-9562-4f69-a30a-b96f2ad4deed.png" width="600px">
                                                                                                                              
 3.주문 취소<br>                                                                                                                             
 CANCEL 버튼을 누르면 주문이 취소됩니다.
 
 <img src="https://user-images.githubusercontent.com/102283529/168794206-3a41927d-cc1e-4e7c-9389-74e624e69f62.png" width="600px">
