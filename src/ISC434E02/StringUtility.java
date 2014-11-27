
package ISC434E02;

import java.util.ArrayList;

public class StringUtility {

    public String concat(ArrayList<String> bag, String sep) {
        String result = "";
        for (int i = 1; i < bag.size(); i++) {
        	result += bag.get(i) + sep;
        }
        return result;
    }
}
