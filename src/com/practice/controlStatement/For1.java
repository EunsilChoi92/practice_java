package com.practice.controlStatement;

public class For1 {
    public static void main(String[] args) {
        //1. 반복문
        //- 반복문은 어떤 작업(코드들)이 반복적으로 실행되도록 할 때 사용됨
        //- 반복문의 종류: for문, while문, do-while문
        //- for문은 반복 횟수를 알고 있을 때 주로 사용, while문은 조건에 따라 반복할 때 주로 사용
        //- while문과 do-while문은 조건을 먼저 검사하느냐, 나중에 검사하느냐의 차이점이 있고 동작 방식은 동일함


        //2. for문
        //- 주어진 횟수만큼 실행문을 반복 실행할 때 적합한 반복 제어문
        //- for문 실행 순서: for(①초기화식; ②조건식; ④증감식) {
        //                      ③ 실행문
        //                  }

        int sum = 0;
        sum = sum + 1;  //sum = 0 + 1               -> sum += 1
        sum = sum + 2;  //sum = (0 + 1) + 2         -> sum += 2
        sum = sum + 3;  //sum = ((0 + 1) + 2) + 3   -> sum += 3
        sum = sum + 4;
        sum = sum + 5;
        System.out.println("1 ~ 5까지의 합: " + sum);

        int sum1 = 0;
        //i는 1이라고 초기화를 할건데, i가 100 이하일때까지만 반복시킬거고 반복문을 한 번 실행할 때마다 i는 1씩 증가한다.
        //  -> 100번 실행
        for(int i=1; i<=100; i++) {
            sum1 = sum1 + i;
            //i: 1 -> sum1 = 0 + 1;
            //i: 2 -> sum1 = (0 + 1) + 2;
            //i: 3 -> sum1 = ((0 + 1) + 2) + 3;
            // ....
            //i: 99 -> sum1 = ~~~ + 99;
            //i: 100 -> sum1 = ~~~ + 100;
            //i: 101 -> 반복 끝
        }

        System.out.println("1 ~ 100까지의 합: " + sum1);

        System.out.println("\n-----------------------------------------------\n");

        //1부터 10까지의 숫자를 출력하도록 해봅시다!
        //- 예시
        // 1
        // 2
        // 3
        // ...
        // 10
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println("\n-----------------------------------------------\n");


        //3. 초기화식
        //- 초기화식의 역할은 조건식과 실행문, 증감식에서 사용할 변수를 초기화하는 역할을 함
        //- 초기화식이 필요 없을 경우 생략할 수 있음

        int k = 1;
        for(; k<=100; k++) { }

        //- 초기화식은 둘 이상이 있을 수도 있고, 증감식도 둘 이상이 있을 수 있음
        //- 이러한 경우 쉼표로 구분함

        for(int i=0, j=100; i<=50 && j>=500; i++, j--) { }

        System.out.println("\n-----------------------------------------------\n");

        int sum2 = 0;

        for(int i=1; i<=100; i++) {
            sum2 += i;
            //i: 1 -> sum2 += 1;
            //..
            //i: 99 -> sum2 += 99;
            //i: 100 -> sum2 += 100;
            //i: 101 -> 끝!
        }

        System.out.println("1 ~ 100의 합: " + sum2);

        //1부터 100까지의 합을 구할건데, i를 for문 밖에서 출력하고 싶다!!

        int i;
        int sum3 = 0;
        for(i=1; i<=100; i++) { //증감연산자 단독 사용할 때에는 ++i도 사용 가능
            sum3 += i;
        }
        System.out.println("i = " + i);
        System.out.println("sum3: " + sum3);

        System.out.println("\n-----------------------------------------------\n");


        //4. 중첩 for문
        //- for문 내부에 또 다른 for문을 내포하는 것
        //- 구구단 2단 출력

        for(int m=2; m<=9; m++) {   //2 ~ 9 -> 8번
            //2단 제일 앞에는 개행을 안 넣으려면? -> 만약에 단을 가리키는 변수가 2일 경우에는 개행을 넣지 않겠다.
            //                                -> 만약에 단을 가리키는 변수가 2가 아니라면 개행을 넣겠다.
            if(m != 2) System.out.println();
            System.out.println("*** " + m + "단 ***");   //*** 2단 ***

            //m = 2 / n = 1, 2, 3, 4, 5, 6, 7, 8, 9
            //m = 3 / n = 1, 2, 3, 4, 5, 6, 7, 8, 9
            //m = 4 / n = 1, 2, 3, 4, 5, 6, 7, 8, 9
            //m = 5 / n = 1, 2, 3, 4, 5, 6, 7, 8, 9
            //      ...
            //m = 9 / n = 1, 2, 3, 4, 5, 6, 7, 8, 9 -> 총 72번

            for(int n=1; n<=9; n++) {   //1 ~ 9 -> 9번
                System.out.println(m + " X " + n + " = " + (m * n));
                //2 X 1 = 2
                //2 X 2 = 4
                //2 X 3 = 6
                //2 X 4 = 8
                //...
                //2 X 9 = 18
            }
        }
    }
}
