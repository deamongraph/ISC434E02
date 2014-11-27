package ISC434E02;

import java.util.ArrayList;

/**
 *
 * @author deamon3
 */
public class MyTime {

    /*{hora,minuto"*/
    public boolean earlier(ArrayList<Integer> t1, ArrayList<Integer> t2) {
        boolean resp = false;
        int t1mins = (t1.get(0) * 60) + t1.get(1);
        int t2mins = (t2.get(0) * 60) + t2.get(1);
        if (t1mins < t2mins) {
            resp = true;
        }
        return resp;
    }

    public ArrayList<Integer> nextSecond(ArrayList<Integer> currentTime) {
        ArrayList<Integer> newCurrent = new ArrayList<>();
        newCurrent.add(currentTime.get(0));
        newCurrent.add(currentTime.get(1));
        if ((currentTime.get(2) + 1) < 60) {
            newCurrent.add(currentTime.get(2) + 1);//agregar un segundo
        }
        return newCurrent;
    }

}
