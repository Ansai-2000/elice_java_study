package day12_27.ex05;

class Cafe {
    // 멤버 변수 선언 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
    public String menu;
    public int price;

    // 여기에 생성자 메서드를 작성해주세요.
    Cafe(String menu, int price){
        this.menu = menu;
        this.price = price;
    }

    Cafe(String menu){
        this(menu,3000);
    }

    public void printMenuInfo() {
        System.out.println(menu + "은 " + price + "원입니다.");
    }
}

// Main 부분은 수정하지 말아주세요! 채점이 정상적으로 진행되지 않을 수 있습니다.
public class Main {
    public static void main(String args[]) {

        Cafe cafe = new Cafe("아이스크림");
        Cafe cafe2 = new Cafe("아이스크림", 3000);

        cafe.printMenuInfo();
        cafe2.printMenuInfo();
    }
}