/**
 * Created by jusk2 on 2017-01-16.
 */
public class HanoiTowerSolu {

  public void hanoiTower(int num, String from, String by, String to) {

    if (num==1)
      System.out.println("원반 1을 " + from +"에서 " + to + "로 이동");
    else{
      hanoiTower(num-1, from, to, by);
      System.out.println("원반 " + num + "을(를) " + from +"에서 " + to + "로 이동");
      hanoiTower(num-1, by, from, to);
    }
  }
}
