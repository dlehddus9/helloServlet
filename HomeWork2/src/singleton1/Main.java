package singleton1;

public class Main {
    public static void main(String[] args) {
        System.out.println("시작");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3=Singleton.getInstance();
        // 싱글톤 패턴이지만 우선 객체 3개를 생성해본다.

        System.out.println("각 객체의 주소값 출력");
        System.out.print(obj1+" ");
        System.out.print(obj2+" ");
        System.out.println(obj3+" ");
        // 객체의 주소값을 print

        System.out.println("각 개체의 현재속도출력");
        System.out.print(obj1.getSpeed()+" ");
        System.out.print(obj2.getSpeed()+" ");
        System.out.println(obj3.getSpeed()+" ");


        obj1.setSpeed(10); //ojb1의 속도만 10으로변경
        System.out.println("ojb1의 속도10으로변경");
        System.out.print(obj1.getSpeed()+" ");
        System.out.print(obj2.getSpeed()+" ");
        System.out.println(obj3.getSpeed());
        //모든 객체의 속도가 10으로변경되는것을 확인

        obj2.setSpeed(20); //obj2의 속도만 20으로 변경
        System.out.println("ojb2의 속도20으로변경");
        System.out.print(obj1.getSpeed()+" ");
        System.out.print(obj2.getSpeed()+" ");
        System.out.println(obj3.getSpeed());

        if(obj1==obj2){
            System.out.println("obj1과 obj2 는 같은 인스턴스이다.");
        }
        else {
            System.out.println("obj1과 obj2는 다른 인스턴스이다.");
        }
        System.out.println("종료");
    }
}
