package InflearnJava.basic.access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() { //If 와 Else 문으로 조건문을 만들어도 되지만, 아래 처럼 검증로직과 실행로직으로 나누어 조건을 검색할 수 있다.
        //검증 로직 return 을 만나면 빠져나간다
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        //실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
