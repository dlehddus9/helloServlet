package singleton1;

public class Singleton {
    private static Singleton singleton=null;
    private int speed;
    // 캡슐화
    private Singleton() {
        speed=5;
    }
    public static synchronized Singleton  getInstance() {
        if(singleton==null)
        {
            singleton=new Singleton();
        }
        return singleton;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed=speed;
    }
    // 싱글톤이 null이면 singleton을 하나생성하고 만약에 이미 있다면
    //기존의 singleton을 return 해준다.
}
