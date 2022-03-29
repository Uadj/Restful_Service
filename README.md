# Inflearn강의 Spring Boot로 개발하는 RESTful Service 2022.03.29~2022.03.30  
## 파일 구조  
![image](https://user-images.githubusercontent.com/30551889/160680036-f53e3bd1-239b-4ad0-83af-d013cbac7da4.png)  
## ERD JPA
USER 
```
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Size(min=2, message = "Name은 2글자 이상 입력해주세요.")
    private String name;
    @Past
    @ApiModelProperty(notes = "사용자의 등록일을 입력해주세요")
    private Date joinDate;
    @ApiModelProperty(notes = "사용자의 패스워드를 입력해주세요")
    private String password;
    @ApiModelProperty(notes = "사용자의 주민번호를 입력해주세요")
    private String ssn;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;
```
Post     
```
@Id
@GeneratedValue
private Integer id;

private String description;

@ManyToOne(fetch = FetchType.LAZY)
@JsonIgnore
private User user;  
```
모듈 : web, H2, JPA, Security, Jackson xml, Validation, Swagger, HATEOAS, Actuator, HAL explorer

강의 목록

Web Service와 Web APplication의 개요
2분  
Web Service 개발 방법 SOAP과 REST의 이해
10분
Spring Boot 개요
4분   
REST API 설계
7분  
Spring Boot Project 생성
12분  
Spring Boot Project 구조 확인과 실행 방법
15분  
HelloWorld Controller 추가
10분  
HelloWorld Bean 추가
16분  
DispatcherServlet과 프로젝트 동작의 이해
9분  
Path Variable 사용
9분  
User Service API 구현
User 도메인 클래스 생성
12분  
사용자 목록 조회를 위한 API 구현 - GET HTTP Method
11분  
사용자 등록을 위한 API 구현 - POST HTTP Method
11분  
HTTP Status Code 제어
7분   
HTTP Status Code 제어를 위한 Exception Handling
10분  
Spring의 AOP를 이용한 Exception Handling
11분  
사용자 삭제를 위한 API 구현 - DELETE HTTP Method
8분  
RESTful Service 기능 확장  
## Section 3 수업 소개
유효성 체크를 위한 Validation API 사용
12분  
다국어 처리를 위한 Internationalization 구현 방법
10분  
Response 데이터 형식 변환 - XML format
4분  
Response 데이터 제어를 위한 Filtering
9분  
프로그래밍으로 제어하는 Filtering 방법 - 개별 사용자 조회
11분  
프로그래밍으로 제어하는 Filtering 방법 - 전체 사용자 조회
3분  
URI를 이용한 REST API Version 관리
11분  
Request Parameter와 Header를 이용한 API Version 관리
12분  
Spring Boot API 사용  
## Section 4 수업 소개
Level3 단계의 REST API 구현을 위한 HATEOAS 적용
13분  
REST API Documentation을 위한 Swagger 사용
10분  
Swagger Documentation 구현 방법
11분  
REST API Monitoring을 위한 Actuator 설정
4분  
HAL Browser를 이용한 HATEOAS 기능 구현
5분  
Spring Security를 이용한 인증 처리
5분  
Configuration 클래스를 이용한 사용자 인증 처리
8분  
Java Persistence API 사용
## Section 5 수업 소개
Java Persistence API의 개요
4분  
JPA를 사용을 위한 Dependency 추가와 설정
9분  
Spring Data JPA를 이용한 Entity 설정과 초기 데이터 생성
9분  
JPA Service 구현을 위한 Controller, Repository 생성
8분  
JPA를 이용한 사용자 목록 조회 - GET HTTP Method
8분  
JPA를 이용한 사용자 추가와 삭제 - POST/DELETE HTTP Method
12분  
게시물 관리를 위한 Post Entity 추가와 초기 데이터 생성
12분  
게시물 조회를 위한 Post Entity와 User Entity와의 관계 설정
4분  
JPA를 이용한 새 게시물 추가 - POST HTTP Method
8분  
RESTful API 설계 가이드  
## Section 6 수업 소개
Richardson Maturity Model 소개
4분  
REST API 설계 시 고려해야 할 사항
3분  
마치며
1분  
