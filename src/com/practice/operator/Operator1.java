package com.practice.operator;

public class Operator1 {
    public static void main(String[] args) {
        //1. 연산자와 연산식
        //- 연산(operations): 프로그램에서 데이터를 처리하여 결과를 산출하는 것
        //- 연산자(operator): 연산에 사용되는 표시나 기호
        //- 피연산자(operand): 연산되는 데이터
        //- 연산식(expressions): 연산자와 피연산자를 이용하여 연산의 과정을 기술한 것

        //x + y
        //x - y
        //x * t + z
        //x == y
        //- +, -, *, ==은 연산자이고 x, y, z 변수는 피연산자


        //2. 연산자
        //87P 참고
        //- 연산자는 필요로 하는 피연산자의 수에 따라 단항, 이항, 삼항 연산자로 구분됨
        //- 단항 연산자: ++x;
        //- 이항 연산자: x + y;
        //- 삼항 연산자: (sum > 90) ? "A" : "B";
        //- 연산식은 반드시 하나의 값을 산출하므로 하나의 값이 올 수 있는 곳이면 어디든지 값 대신 사용 가능
        //      -> int result = x + y;
        //- 연산식은 다른 연산식의 피연산자 위치에도 올 수 있음
        //      -> boolean result = (x + y) < 5;


        //3. 연산의 방향과 우선순위
        //- 90P 참고
        //- 여러 가지 연산자들이 섞여 있다면 헷갈릴 수 있으므로 괄호를 사용해서 먼저 처리해야 할 연산식을 묶는 것이 좋음
        //- 단항, 이항, 삼항 연산자 순으로 우선순위를 가짐
        //- 산술, 비교, 논리, 대입 연산자 순으로 우선순위를 가짐
        //- 단항과 대입 연산자를 제외한 모든 연산의 방향은 왼쪽에서 오른쪽
        //- 복잡한 연산식에는 괄호를 사용해서 우선순위를 정해줌




    }
}
