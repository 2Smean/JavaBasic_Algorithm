package InflearnJava.basic.pack;

import InflearnJava.basic.pack.a.User;

public class PackageMain3 {
    User userA = new User();
    InflearnJava.basic.pack.b.User userB = new InflearnJava.basic.pack.b.User(); // import 는 하나만 할 수 있기 때문에 하나는 전체 경로를 다 적어줘야한다.
}
