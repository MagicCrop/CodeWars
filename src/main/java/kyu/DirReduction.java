package kyu;

import java.util.ArrayList;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        int oldLength = arr.length;
        int newLength = 0;
        while (newLength != oldLength) {
            oldLength = arr.length;
            arr = reduce(arr);
            newLength = arr.length;
        }
        return arr;
    }
    
    public static String[] reduce(String[] arr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1 && ((arr[i].equals("NORTH") && arr[i + 1].equals("SOUTH")) || (arr[i].equals("SOUTH") && arr[i + 1].equals("NORTH")) || (arr[i].equals("WEST") && arr[i + 1].equals("EAST")) || (arr[i].equals("EAST") && arr[i + 1].equals("WEST")))) {
                i++;
            } else {
                list.add(arr[i]);
            }
        }
        String[] stockArr = new String[list.size()];
        stockArr = list.toArray(stockArr);
        return stockArr;
    }
}

//better solution
//public static String[] dirReduc(String[] arr) {
//    final Stack<String> stack = new Stack<>();
//
//    for (final String direction : arr) {
//        final String lastElement = stack.size() > 0 ? stack.lastElement() : null;
//
//        switch(direction) {
//            case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//            case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//            case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//            case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//        }
//    }
//    return stack.stream().toArray(String[]::new);
//}