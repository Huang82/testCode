
import java.util.*;

// 簡單練習圖形演算法
// 尋找誰有球

public class graph {

    static class peopleData {
        String name;
        ArrayList<peopleData> friend;
        boolean isBall;
    
        peopleData(String name, ArrayList<peopleData> friend, Boolean isBall) {
            this.name = name;
            this.friend = friend;
            this.isBall = isBall;
        }
    
    }

    public static void main(String[] args) {

        // 第一層朋友
        peopleData andy = new peopleData("andy", new ArrayList<peopleData>(), false);
        peopleData kan = new peopleData("kan", new ArrayList<peopleData>(), false);
        peopleData candy = new peopleData("candy", new ArrayList<peopleData>(), false);

        // 第二層朋友的朋友
        peopleData km = new peopleData("km", new ArrayList<peopleData>(), false);
        peopleData ream = new peopleData("ream", new ArrayList<peopleData>(), false);
        peopleData candio = new peopleData("candio", new ArrayList<peopleData>(), false);
        peopleData andio = new peopleData("andio", new ArrayList<peopleData>(), false);
        peopleData kenven = new peopleData("kenven", new ArrayList<peopleData>(), false);
        peopleData white = new peopleData("white", new ArrayList<peopleData>(), false);
        peopleData ant = new peopleData("ant", new ArrayList<peopleData>(), false);
        peopleData joe = new peopleData("joe", new ArrayList<peopleData>(), false);

        joe.friend.add(new peopleData("aaa", new ArrayList<peopleData>(), false));

        // 增加朋友名單
        andy.friend.add(km);
        andy.friend.add(ream);
        andy.friend.add(kenven);

        kan.friend.add(candio);
        kan.friend.add(andio);
        kan.friend.add(kenven);
        kan.friend.add(white);

        candy.friend.add(ant);
        candy.friend.add(joe);

        kenven.friend.add(andy);

        ArrayList<peopleData> qeqe = new ArrayList<peopleData>();

        qeqe.add(andy);
        qeqe.add(kan);
        qeqe.add(candy);

        findIsball(qeqe);
    }

    public static void findIsball(ArrayList<peopleData> q) {

        ArrayList<String> findedName = new ArrayList<String>();

        ArrayList<peopleData> friend_T = new ArrayList<peopleData>();

        int index = 1;

        while (q.size() != 0) 
        {

            peopleData t = q.remove(0);

            if (t.isBall) {

                System.out.println(t.name + " have ball !!");
                System.out.println("the graph is on the " + index + " layer.");
                return;

            } else {

                if (findedName.indexOf(t.name) == -1)
                    findedName.add(t.name);

                if (t.friend.size() != 0) {

                    for (peopleData f : t.friend) {
                        if (findedName.indexOf(f.name) == -1) {
                            findedName.add(f.name);
                            friend_T.add(f);
                        }
                    }

                }

            }

            if (q.size() == 0 && friend_T.size() != 0) {
                System.out.println("");
                index++;
                q.addAll(friend_T);
                friend_T.clear();
            }

        }

        System.out.println("No Ball!");

    }


}
