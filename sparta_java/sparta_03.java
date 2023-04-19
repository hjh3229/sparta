package sparta;

public class sparta_03 {
}

class Obj4_1 {
    int iv;        // 인스턴스 변수
    static int cv; // 클래스 변수(static 변수, 공유 변수)

    void method() {
        int lv;
        lv = 30;
        // 지역변수는 자동으로 초기화가 되지 않기 때문에 사용하려면 반드시 초기화 필요
        System.out.println("lv 지역 변수 = " + lv);
    }
}


class Obj4_1Main {
    public static void main(String[] args) {

        // 클래스 변수 접근 및 사용
        // 접근방법 : 클래스명.클래스변수이름
        Obj4_1.cv = 10;
        System.out.println("ObjVar.cv 클래스 변수 = " + Obj4_1.cv);

        // 인스턴스 변수 생성 및 사용
        // Obj4_1.iv = 20; // Error, 인스턴스를 통해서만 생성 및 사용 가능
        Obj4_1 objVar = new Obj4_1();
        objVar.iv = 20;
        System.out.println("objVar.iv 인스턴스 변수 = " + objVar.iv);

        // 지역 변수 생성 및 사용
        // objVar.lv // Error, 인스턴스로 지역 변수 바로 접근 불가능
        objVar.method(); // 메서드 호출 시 지역 변수 생성
        // 메서드 종료시 지역 변수 삭제
    }
}

class Method5_1 {
    int add(int x, int y) {
        int result = x + y;
        return result; // 값을 반환
    }
}

class Method5_1Main {
    public static void main(String[] args) {
        Method5_1 method = new Method5_1(); // Method5_1 클래스에 만든 메서드 add 를 사용하기 위해 객체 생성

        int result = method.add(3, 5); // add 메서드를 사용해서 입력한 값(3,5)으로 처리된 값을 반환받아 result 변수에 저장
        System.out.println("result = " + result);
    }
}

class Method5_2 {
    void gugudan(int dan) {
        if (!(dan >= 2 && dan <= 9)) {
            System.out.println(dan + "단은 없습니다.");
            return;
        }
        System.out.println(dan + "단 시작!");
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "*" + i + " = " + dan * i);
        }
        System.out.println();
    }

    boolean checkMax(int x, int y) {
        if (x > y) {
            return true;
        } else {
            return false;
            // return 반드시 필요합니다. 만약 없으면 조건문이 false 일 경우, void 가 아닌데 return 문이 없음으로 Error
        }
    }

}

class Method5_2Main {
    public static void main(String[] args) {
        Method5_2 method = new Method5_2();

        method.gugudan(2);
        method.gugudan(5);
        method.gugudan(10);
        method.gugudan(9);

        System.out.println("method.checkMax(10, 8) = " + method.checkMax(10, 8));
        System.out.println("method.checkMax(5, 9) = " + method.checkMax(5, 9));
    }
}