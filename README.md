### 시스템 디자인 



### 예상 모듈 구조
```
/ecommerce-project
 ├── common         (공통 모듈: DTO, 유틸, 공통 설정)
 ├── external      (외부 연동 모듈: 결제, 배송, 메시징)
 ├── auth          (인증 및 권한 관리)
 ├── member          (회원 관리)
 ├── product       (상품 관리)
 ├── order         (주문 및 결제)
 ├── inventory     (재고 관리)
 ├── notification  (알림, 이메일, SMS)
 ├── application   (API 서버, 실행 가능한 Spring Boot 모듈)
```
