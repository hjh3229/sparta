package sparta;

public class sparta_05 {
}

class Overloading8_1 {

    int add(int a, int b) {
        System.out.println("int add(int a, int b)");
        return a + b;
    }

//    void add(int a, int b) { // 반환 타입이 다르다고 오버로딩이 성립되지는 않음
//        System.out.println("void add(int a, int b)");
//        System.out.println("a + b = " + a + b);
//    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b)");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("long add(long a, int b)");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("long add(int a, long b)");
        return a + b;
    }

}

class Overloading8_1Main {
    public static void main(String[] args) {
        Overloading8_1 test = new Overloading8_1();
        System.out.println(test.add(10, 20));
        System.out.println(test.add(13L, 17L));
        System.out.println(test.add(5L, 10));
        System.out.println(test.add(12, 23L));

        System.out.println();

        // 그런데 이때 위에 int add(int a, int b)  를 주석한다면
        test.add(10, 20); // 여기에 Ambiguous method call Error 가 발생합니다.
        // int, int 는 (long, int) , (int, long) 2개의 메서드 모두 가능하기 때문에 컴퓨터가 하나를
        // 마음대로 선택할 수가 없어서 발생하는 오류입니다.

    }
}

class Tv9_1 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv9_1() {
        power = false;
        channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다. this 는 이전 챕터에서 잠깐 봤었죠! 매개변수와 인스턴스변수를 구분하기 위해 사용하겠습니다.
    public Tv9_1(String color, long price) {
        power = false; // this.power, power 둘다 지금 상황에서는 인스턴스 변수를 명확하게 판단 할 수 있기 때문에 어떤걸 사용해도 상관 없습니다.
        channel = 1;
        this.color = color;
        this.price = price;
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        power = !power;
        if (power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        channel--;
        System.out.println("채널 감소");
    }

}

class Tv9_1Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv9_1 생성
        Tv9_1 tv = new Tv9_1();
        System.out.print("기본 생성자 TV: ");
        tv.power();

        // 진열 용 Tv9_1 생성
        Tv9_1 exTv = new Tv9_1("보라색", 3456789);
        System.out.print("오버로딩 생성자 TV: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);

        // 근데 이때 주의할 점!
        // 기본 생성자는 없고 오버로딩한 생성자만 있을 경우!
        // 컴파일러는 기본 생성자를 만들어주지 않기 때문에 기본 생성자를 사용하려고 하면 Error 발생!
        // 위 기본 생성자를 주석 하세요!!!!
        Tv9_1 tv2 = new Tv9_1(); // Error 발생, 기본 생성자가 없기 때문에 매개 변수를 넣으라고 intellij 가 요구합니다.

    }
}

class Tv10_1 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv10_1() {
        this.power = false;
        this.channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다.
    public Tv10_1(String color, long price) {
        this.power = false;
        this.channel = 1;
        this.color = color;
        this.price = price;
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_1 changeColor(String color) { // 반환 타입으로 자기자신인 Tv 선언
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this 는 자기 자신을 가리키는 참조변수!
    }

}

class Tv10_1Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_1 생성
        Tv10_1 tv = new Tv10_1();
        System.out.print("기본 생성자 Tv10_1: ");
        tv.power();

        // 진열 용 Tv10_1 생성
        Tv10_1 exTv = new Tv10_1("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_1: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // 진열 용 Tv10_1 의 색깔을 수정하고 수정된 객체를 참조변수에 저장하겠습니다.
        Tv10_1 exTvThis = exTv.changeColor("파란색");
        // 색깔이 변경된 Tv의 주소가 저장된 참조변수 exTvThis 를 사용하여 변경된 색깔 확인
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        // 당연히 exTv 이걸로 확인해도 색깔이 변경되어 있습니다.
        System.out.println("exTv.color = " + exTv.color);
    }
}

class Tv10_2 {
    // 속성 : 변수 선언
    boolean power; // 전원상태
    int channel;  // 채널
    String color; // 색깔
    long price; // 가격

    // 위 속성에서 필수로 초기값이 필요한 값들을 초기화 해주는 기본 생성자
    public Tv10_2() {
        this.power = false;
        this.channel = 1;
    }

    //  오버로딩 한 생성자 - 매장 진열 용 일 경우에는 가격과 색깔의 초기화가 필요합니다.
    public Tv10_2(String color, long price) {
        // 아래 초기화 내용은 위에 기본생성자와 완전히 똑같습니다.
        // 이럴 때 this() 를 사용합니다.
        // this.power = false;
        // this.channel = 1;

        this(); // 기본 생성자를 호출합니다.
        // Tv10_2() // 이렇게는 불가능 합니다!

        this.color = color;
        this.price = price;

        // this(); // 생성자 호출은 반드시 첫 줄에서만 가능합니다.
    }

    // 기능 : 메서드 선언
    void power() {  // 전원 기능
        this.power = !power;
        if (this.power) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }

    void channelUp() { // 채널 증가
        this.channel++;
        System.out.println("채널 증가");
    }

    void channelDown() { // 채널 감소
        this.channel--;
        System.out.println("채널 감소");
    }

    // 색깔을 수정하고 자기 자신을 반환하는 메서드
    Tv10_2 changeColor(String color) { // 반환 타입으로 자기자신인 Tv 선언
        this.color = color;
        System.out.println("색깔 변경 완료!");
        return this; // this 는 자기 자신을 가리키는 참조변수!
    }

}

class Tv10_2Main {
    public static void main(String[] args) {
        // 기본 초기화된 Tv10_2 생성
        Tv10_2 tv = new Tv10_2();
        System.out.print("기본 생성자 Tv10_2: ");
        tv.power();

        // 진열 용 Tv10_2 생성
        Tv10_2 exTv = new Tv10_2("보라색", 3456789);
        System.out.print("오버로딩 생성자 Tv10_2: ");
        exTv.power();
        System.out.println("exTv.color = " + exTv.color);
        System.out.println("exTv.price = " + exTv.price);
        System.out.println();

        // 진열 용 Tv10_2 의 색깔을 수정하고 수정된 객체를 참조변수에 저장하겠습니다.
        Tv10_2 exTvThis = exTv.changeColor("파란색");
        // 색깔이 변경된 Tv의 주소가 저장된 참조변수 exTvThis 를 사용하여 변경된 색깔 확인
        System.out.println("색깔이 변경되었는지 확인 exTvThis.color : " + exTvThis.color);
        // 당연히 exTv 이걸로 확인해도 색깔이 변경되어 있습니다.
        System.out.println("exTv.color = " + exTv.color);
    }
}