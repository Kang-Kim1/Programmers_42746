# Programmers_42746
## 프로그래머스 - 가장 큰 수 (https://programmers.co.kr/learn/courses/30/lessons/42746)
Comparator 를 이용한 정렬 문제로 답을 구할 수 있는 문제.
Output은 주어진 정수를 나열하였을 때 가장 큰 수를 반환해야 함 되어야 함.
처음엔 Integer 연산으로 결과값을 만들어보려 했지만, String으로 변환 & 정렬을 통해 훨씬 효율적인 방법으로 해답을 만들어낼 수 있었음.

실행 순서는 다음과 같다 : 
1. Input int[] > String[]로 변환
2. Comparator를 사용하여 String 정렬
    - String s1, s2 를 args로 받는 Comparator로 두 스트링의 Concat. 값이 더 큰 것부터 정렬
3. 정렬한 Array 의 모든 값 Concat.
4. 결과값이 0인 경우에 대한 추가 조건문
    - 맨 앞자리가 0이면 0 반환

