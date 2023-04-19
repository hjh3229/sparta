package sparta;
import java.util.Arrays;


class Control1_3 {
    public static void main(String[] args) {
        char ch = 'p';

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("해당 문자는 영문 대문자입니다.");
        } else {
            System.out.println("해당 문자는 영문자가 아닙니다.");
        }

        int score = 70;

        if (score >= 90) {
            System.out.println("A등급입니다.");
        } else if(score >= 80) {
            System.out.println("B등급입니다.");
        } else if(score >= 70) {
            System.out.println("C등급입니다.");
        }
    }
}

class Control1_4 {
    public static void main(String[] args) {

        char ch = 'b';
        if (ch >= 'a' && ch <= 'z')
            System.out.println("해당 문자는 영문 소문자입니다.");


        int score = 87;

        if (score >= 90) {
            if(score >= 95){
                System.out.println("A++등급입니다.");
            }else {
                System.out.println("A등급입니다.");
            }
        } else if(score >= 80) {
            if(score >= 85){
                System.out.println("B++등급입니다.");
            }else {
                System.out.println("B등급입니다.");
            }
        } else if(score >= 70) {
            if(score >= 75){
                System.out.println("C++등급입니다.");
            }else {
                System.out.println("C등급입니다.");
            }
        }else {
            System.out.println("D등급입니다.");
        }

        if (score >= 90) {
            if(score >= 95){
                System.out.println("A++등급입니다.");
            }else {
                System.out.println("A등급입니다.");
            }
        } else if(score >= 80) {
            if(score >= 85){
                System.out.println("B++등급입니다.");
            }else {
                System.out.println("B등급입니다.");
            }
        } else if(score >= 70) {
            if(score >= 75){
                System.out.println("C++등급입니다.");
            }else {
                System.out.println("C등급입니다.");
            }
        }else {
            System.out.println("D등급입니다.");
        }
    }
}

class Control2_1 {
    public static void main(String[] args) {
        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            case 0: case 13:
                System.out.println("이런식으로 case 문을 사용할 수 있습니다.");
                break;
            case 15:
            default: monthString = "Invalid month";
        }
        System.out.println(monthString);
    }
}

class Control3_3 {
    public static void main(String[] args) {
        // 초기화 시 변수 2개 사용 가능합니다. 단, 타입이 같아야 한다.
        for (int i = 1, j = 10; i <= 10; i++, j--) {
            System.out.println("i는 현재 " + (i) + "입니다.");
            System.out.println("j는 현재 " + (j) + "입니다.");
        }
        System.out.println();
        // 이렇게 변수 2개를 사용하여 조건식을 구성할 수 있습니다.
        for (int k = 1, t = 10; k <= 10 && t > 2; k++, t--) {
            System.out.println("k는 현재 " + (k) + "입니다.");
            System.out.println("t는 현재 " + (t) + "입니다.");
        }
    }
}

class Control3_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        for (int e : arr) {
            System.out.print(e + " ");
        }
    }
}

class Control4_1 {
    public static void main(String[] args) {
        // 괄호 { } 안의 내용을 20번 반복
        // 1. 1 ~ 10 사이의 난수를 20개 출력하시오.
        // 1,2,3,4,5,6,7,8,9,10

        // 2. -5 ~ 5 사이의 난수를 20개 출력하시오.
        // -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5
        for (int i = 0; i < 20; i++) {
            // 1번
//            System.out.println(Math.random() * 10); // 1. 0.0 * 10 <= x * 10 < 1.0 * 10
//            System.out.println((int)(Math.random() * 10)); // 2. 0 <= (int)(x * 10) < 10
//            System.out.println((int)(Math.random() * 10) + 1); // 3. 1 <= (int)(x * 10) + 1 < 11

            // 2번
//            System.out.println((int)(Math.random() * 11)); // 0 ~ 10
            System.out.println((int)(Math.random() * 11) - 5); // -5 ~ 5
        }
    }
}

class Control5_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            sum += ++i;
        }
    }
}

class Control5_3 {
    public static void main(String[] args) {
        int j = 1;

        do {
            System.out.println("do / while 문이 " + j + "번째 반복 실행중입니다.");
            j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.
        } while (j < 20);

        System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
    }
}

class Control6_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            if(sum > 100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}

class Control6_2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            // 3의 배수는 건너뜀 : 3, 6, 9
            if (i % 3 == 0)
                continue;
            System.out.println("i = " + i);
        }
    }
}

class Control6_3 {
    public static void main(String[] args) {
        allLoop :
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}

class Control6_4 {
    public static void main(String[] args) {
        int i = 2;
        allLoop :
        while (true) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    break allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            i++;
        }
    }
}

class Control6_5 {
    public static void main(String[] args) {
        allLoop : for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 5) {
                    continue allLoop;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}

class Arrays1_1 {
    public static void main(String[] args) {
//        int[] age; // 참조변수 베열 age 생성
//        age = new int[5]; // 배열의 생성
        int[] age = new int[5]; // 선언과 생성 동시에
        age[3] = 28;
        System.out.println("age[3] = " + age[3]);

        int beatitudoAge = age[3];
        System.out.println("beatitudoAge = " + beatitudoAge);

        System.out.println("age 배열의 전체값 확인");
        System.out.println("age[0] = " + age[0]);
        System.out.println("age[1] = " + age[1]);
        System.out.println("age[2] = " + age[2]);
        System.out.println("age[3] = " + age[3]);
        System.out.println("age[4] = " + age[4]);
    }
}

class Arrays2_1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("배열의 길이 = " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        // index 범위를 벗어나는 경우 Error 발생
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}


class Arrays3_1 {

    public static void main(String[] args) {

        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        //  배열을 가리키는 참조 변수 arr 을 출력
        System.out.println("arr = " + arr);
        // 메모리 주소와 비슷한 문자열이 출력 -> 실제 주소는 아닙니다.
        // [I@7a81197d -> [(배열을 뜻함), I(int 타입을 뜻함), @(위치를 뜻함)

        // 예외 확인 하기 - char[]
        char[] chArr = {'a', 'b', 'c', 'd'};
        System.out.println(chArr); // abcd 가 출력되는데 이는 println 메서드의 기능 때문!

        // 배열의 요소 하나씩 출력하기
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Arrays.toString(배열) : 배열의 모든 요소를 문자열로 만들어서 반환한다.
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}

class Arrays3_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("원본 = " + Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) {
            int num = (int) (Math.random() * 10); // 0 ~ 9 의 랜덤 수

            int tmp = numArr[0]; // 배열의 첫 번째 수로 계속 초기화 된다.

            // 랜덤한 위치의 값과 배열의 첫 번째 수가 서로 바뀐다.
            numArr[0] = numArr[num];
            numArr[num] = tmp;

            System.out.println(i + 1 + " 번째 변경 : " + Arrays.toString(numArr));
        }

        System.out.println("결과 = " + Arrays.toString(numArr));
    }
}

class Arrays4_1 {
    public static void main(String[] args) {
        String str = "ABCDEFG";
        char ch = str.charAt(3);
        System.out.println("ch = " + ch); // ch = D

        String str2 = str.substring(1, 4);
        System.out.println("str2 = " + str2); // str2 = BCD

        String str3 = str.substring(1);
        System.out.println("str3 = " + str3); // str3 = BCDEFG

        String str4 = str.substring(1, str.length());
        System.out.println("str4 = " + str4); // str4 = BCDEFG

        char[] chArr = str.toCharArray();
        System.out.println("Arrays.toString(chArr) = " + Arrays.toString(chArr));
    }
}

class Arrays4_2 {
    public static void main(String[] args) {
        String[] strArr = {"축구", "야구", "골프", "테니스"};
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr));

        String[] strArr2 = new String[4];
        System.out.println("Arrays.toString(strArr2) = " + Arrays.toString(strArr2));
    }
}

class Arrays5_1 {
    public static void main(String[] args) {
        int[][] score = {
                {88, 35, 100},
                {84, 60, 55},
                {100, 99, 72},
                {33, 54, 77}
        };

        //길이 확인하기
        System.out.println("score.length = " + score.length);
        System.out.println("score[0].length = " + score[0].length);

        System.out.println();
        // 출력 예 1 : Arrays.toString()
        System.out.println("Arrays.toString()");
        System.out.println("Arrays.toString(score[0]) = " + Arrays.toString(score[0]));
        System.out.println("Arrays.toString(score[1]) = " + Arrays.toString(score[1]));
        System.out.println("Arrays.toString(score[2]) = " + Arrays.toString(score[2]));
        System.out.println("Arrays.toString(score[3]) = " + Arrays.toString(score[3]));

        System.out.println();
        // 출력 예 2 : for
        System.out.println("for");
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.println("score[" + i + "][" + j + "] = " + score[i][j]);
            }
            System.out.println();

        }

        System.out.println();
        // 출력 예 3 : 향상된 for
        System.out.println("향상된 for");
        for (int[] ints : score) {
            for (int it : ints) {
                System.out.println("anInt = " + it);
            }
            System.out.println();
        }
    }
}

class Arrays6_3 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 8, 5, 9, 2, 10, 7, 6, 4};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println();

        Arrays.sort(arr); // 오름차순으로 정렬됩니다.
        System.out.println("sort");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}