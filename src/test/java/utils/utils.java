package utils;

import java.util.List;

public class utils {

    public static void toPrintln(List names, Object... val) {
        for (int i = 0; i < val.length; i++) {
            System.out.println("=== " + names.get(i) + ": " + val[i] + " ===");
        }
    }
}
