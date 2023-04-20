package sparta;

public class sparta_04 {
}

class Time5_1 {
    int hour;
    int minute;
    int second;
}

class Method5_3 {
    static void initObj(Time5_1 time, int hour, int minute, int second) {
        time.hour = hour;
        time.minute = minute;
        time.second = second;
    }
}

class Method5_3Main {
    public static void main(String[] args) {
        Time5_1 t1 = new Time5_1();
        t1.hour = 100;
        t1.minute = 20;
        t1.second = 43;

        Time5_1 t2 = new Time5_1();
        t2.hour = 22;
        t2.minute = 30;
        t2.second = 23;

        Time5_1 t3 = new Time5_1();
        t3.hour = 45;
        t3.minute = 40;
        t3.second = 52;

        System.out.println("t1.hour = " + t1.hour);
        System.out.println("t2.hour = " + t2.hour);
        System.out.println("t3.hour = " + t3.hour);
        System.out.println();

        // 하나하나 인스턴스를 만들고 위처럼 인스턴스 변수를 초기화 하려니 매우 귀찮지 않나요?
        // 물론 '생성자' 라는 개념이 뒤에 나오지만 일단은 메서드를 사용하여 코드의 수를 확 줄여 보겠습니다.

        Time5_1 t4 = new Time5_1();
        Time5_1 t5 = new Time5_1();
        Time5_1 t6 = new Time5_1();

        Method5_3.initObj(t4, 100, 20, 43);
        Method5_3.initObj(t5, 22, 30, 23);
        Method5_3.initObj(t6, 45, 40, 52);

        System.out.println("t4.hour = " + t4.hour);
        System.out.println("t5.hour = " + t5.hour);
        System.out.println("t6.hour = " + t6.hour);

        // 이처럼 메서드를 사용하니 코드의 수가 굉장히 많이 줄어 가독성이 좋아졌습니다.
    }
}

class CallStack5_1 {

    static void firstMethod() {
        System.out.println("firstMethod()");
        secondMethod();
    }

    static void secondMethod() {
        System.out.println("secondMethod()");
        thirdMethod();
    }

    static void thirdMethod() {
        System.out.println("thirdMethod()");
        finalMethod();
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}

class CallStack5_2 {

    static void firstMethod() {
        secondMethod();
        System.out.println("firstMethod()");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("secondMethod()");
    }

    static void thirdMethod() {
        finalMethod();
        System.out.println("thirdMethod()");
    }

    static void finalMethod(){
        System.out.println("finalMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}

class Data6_1 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_1Main {
    public static void main(String[] args) {

        Data6_1 data  = new Data6_1();
        data.x = 10;
        data.y = 20;

        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수 x, y 값 확인");
        System.out.println("data 인스턴스 변수 x = " + data.x);
        System.out.println("data 인스턴스 변수 y = " + data.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data 클래스의 인스턴스 변수를 입력한다.
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        changeParameter(data.x, data.y);
        System.out.println();

        // changeParameter(data.x, data.y); 여기서의 data.x 와 data.y 는
        // data 의 인스턴스 변수의 값 그자체가 복사되어 넘어갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 매개변수의 값을 바꿔도
        // 영향을 받지 않습니다.
        System.out.println("Data6_1 클래스로 만든 data 인스턴스의 인스턴스 변수의 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 x = " + data.x);
        System.out.println("changeParameter 메서드 수행 후 data 인스턴스 변수 y = " + data.y);
    }

    static void changeParameter(int x, int y) { // 기본형
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 x = " + x);
        System.out.println("입력 받은 매개변수 y = " + y);

        System.out.println();
        System.out.println("입력 받은 매개변수 x 와 y의 값을 변경 한 후 확인");
        x = 100;
        y = 200;
        System.out.println("변경 한 후 x = " + x);
        System.out.println("변경 한 후 y = " + y);
        System.out.println("changeParameter 메서드 끝");
    }
}

class Data6_2 {
    Data6_3  data2 = new Data6_3(); // 참조형
}

class Data6_3 {
    int x; // 기본형
    int y; // 기본형
}

class Data6_2Main {
    public static void main(String[] args) {

        Data6_2 data  = new Data6_2();
        data.data2.x = 10;
        data.data2.y = 20;

        System.out.println("Data6_2 클래스로 만든 data 인스턴스의 data2인스턴스의 인스턴스 변수 값 확인");
        System.out.println("참조변수 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("참조변수 data2의 인스턴스 변수 y = " + data.data2.y);
        System.out.println();

        // changeParameter 메서드 의 매개변수에 Data6_2 클래스의 참조형 변수인 data2 를 입력
        System.out.println("입력받은 매개변수의 값을 바꾸는 메서드 수행");
        System.out.println();

        // changeParameter(Data6_3 data2); 여기서 data.data2 는
        // data 인스턴스의 참조형 변수 data2의 주소값이 넘어 갑니다.
        // 따라서 changeParameter 메서드에서 입력받은 data2의 주소값을 통해
        // data2 의 인스턴스에 접근하여 인스턴스 변수를 바꾸기 때문에 영향을 받습니다.
        System.out.println("Data6_3 클래스로 만든 data 인스턴스의 참조변수 data2의 인스턴스 변수 값이 변경되었는지 확인");
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 x = " + data.data2.x);
        System.out.println("changeParameter 메서드 수행 후 data2의 인스턴스 변수 y = " + data.data2.y);
    }

    static void changeParameter(Data6_3 data2) {
        System.out.println();
        System.out.println("changeParameter 메서드 시작");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값 확인");
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x = " + data2.x);
        System.out.println("입력 받은 매개변수 data2의 인스턴스 y = " + data2.y);

        System.out.println();
        System.out.println("입력 받은 매개변수 data2의 인스턴스 x 와 y의 값을 변경 한 후 확인");
        data2.x = 100;
        data2.y = 200;
        System.out.println("변경 한 후 data2의 인스턴스 x = " + data2.x);
        System.out.println("변경 한 후 data2의 인스턴스 y = " + data2.y);
        System.out.println("changeParameter 메서드 끝");
    }
}

class Data3 { int x; }

class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3(); // Data3에 d라는 인스턴스를 생성하고 Data3에 객체를 생성한 후 주소를 d에 저장
        d.x = 10; // 변수 x의 값을 10으로 한다.

        Data3 d2 = copy(d); // copy를 호출하고 d의 주소를 넘김, copy가 반환한 주소를 d2에 저장
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x ="+d2.x);
//        d.x =10
//        d2.x =10
    }

    static Data3 copy(Data3 d) { // 이 d는 copy메서드에 새로 만든 인스턴스로 이름만 같을 뿐 main에 있는 d와는 별개(주소를 넘겨받아서 주소는 같음)
        Data3 tmp = new Data3(); // Data3에 tmp라는 인스턴스를 생성하고 Data3에 객체를 생성한 후 주소를 tmp에 저장
        tmp.x = d.x; // d가 가리키는 x의 값을 tmp가 가리키는 x에 저장(tmp가 가리키는 x는 copy에서 생성한 x라 기본값 0이였음)
        return tmp; // 복사한 객체의 주소를 반환
    }
}

class StaticMethod7_1 {
    int num1, num2; // 인스턴스 변수 선언

    // 클래스 변수 선언
//    static int num1 = 10, num2 = 20;

    static int add(int num1, int num2) { // 메서드 반환타입 앞에 static 이 붙었기 때문에 static 메서드가 됩니다.

        System.out.println();
        System.out.println("매개변수로 입력 받은 num1, num2 확인");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // 여기서 매개 변수에 있는 num1, num2 와 위에 인스턴스 변수로 선언한 num1, num2 는 같은 걸까요?
        // 기본형 매개변수에서 배웠듯이 같지 않습니다. 서로 영향을 받지 않습니다.

        // 여기서의 num1 과 num2 는 단지 인스턴스 변수와 이름만 같은 지역변수일 뿐 메서드가 종료되면 사라집니다.
        // 인스턴스 변수는 클래스 메서드에서 사용하지 못합니다.

        // 그렇다면 추가로 StaticMethod7_1 에 선언한 변수를 사용하고 싶다면?
        // 인스턴스 변수가 아닌 클래스 변수를 선언해야합니다. static 타입 변수이름;

        // 위에 클래스 변수의 주석을 풀고 인스턴스 변수는 주석을 해주세요!

        // 자 그럼 이제 클래스 변수로 선언을 했으니까
        // 매개 변수에 있는 num1, num2 와 위에 클래스 변수로 선언한 num1, num2 는 같은 걸까요?
        // 그렇지 않습니다. 위에서 말씀드렸듯이 num1, num2는 매개변수이자 클래스 변수와 이름만 같습니다.
        // 또한 클래스 변수 를 사용하려면 클래스명.클래스변수 로 만 접근 가능합니다.

        // 이렇게 클래스 메서드에서 클래스 변수를 사용할 수 있습니다. 아래 주석 풀어주세요!

//        System.out.println("클래스변수 확인");
//        System.out.println("StaticMethod7_1.num1 = " + StaticMethod7_1.num1);
//        System.out.println("StaticMethod7_1.num2 = " + StaticMethod7_1.num2);

        System.out.println("num1 + num2 = " + (num1 + num2));
        return num1 + num2;
    }


}

class StaticMethod7_1Main {

    public static void main(String[] args) {
        StaticMethod7_1 methodTest = new StaticMethod7_1(); // 객체 생성
        methodTest.num1 = 10;
        methodTest.num2 = 20;

         methodTest.add(methodTest.num1, methodTest.num2); // add 는 static 메서드 이기 때문에 객체로 생성된 참조변수로는 접근할 수 없습니다.

        // 클래스이름.메서드이름() 방식으로 static 메서드를 호출
        StaticMethod7_1.add(methodTest.num1, methodTest.num2);
    }
}