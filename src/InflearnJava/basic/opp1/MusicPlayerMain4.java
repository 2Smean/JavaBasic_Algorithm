package InflearnJava.basic.opp1;

public class MusicPlayerMain4 {
    public static void main(String[] args) { //player. 을 하면 멤버변수(필드)(f)와 메서드(m)이 나온다.
        MusicPlayer player = new MusicPlayer();
        //음악 플레이어를 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }
}
