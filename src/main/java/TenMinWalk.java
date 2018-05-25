public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int path = 0;
        if (walk.length != 10)
            return false;
        
        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    path++;
                    break;
                case 's':
                    path--;
                    break;
                case 'w':
                    path += 2;
                    break;
                case 'e':
                    path -= 2;
                    break;
            }
        }
        
        return path == 0 ? true : false;
    }
}