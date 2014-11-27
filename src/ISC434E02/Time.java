package ISC434E02;

import java.util.ArrayList;

public class Time {
	 public boolean earlier(ArrayList<Integer> t1, ArrayList<Integer> t2) {
	 	if (t1.get(0) * 60 + t1.get(1) < t2.get(0) * 60 + t1.get(1)) {
	 		return true;
	 	}
	 	return false;
	 }

	 public ArrayList<Integer> nextSecond(ArrayList<Integer> currentTime) {
	 	if (currentTime.get(2) == 59) {
	 		currentTime.set(2, 0);
	 		if (currentTime.get(1) == 59) {
	 			currentTime.set(1, 0);
	 			currentTime.set(0, (currentTime.get(1) + 1) % 24);
	 		}
	 		else {
	 			currentTime.set(1, currentTime.get(1) + 1);
	 		}
	 	}
	 	else {
	 		currentTime.set(2, currentTime.get(2) + 1);
	 	}
	 	return currentTime;
	 }
}