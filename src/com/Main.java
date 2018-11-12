package com;

public class Main {
    static int i = 5;
    int j = 6;

    void does(int e) {
        int r = 5;

        class Local {
            final static int q = 4;
            int w = j;
            int t = e;
            int y = r;
        }
        Local local = new Local();
    }

    void does2(int e) {
        int r = 5;
        class Local {
            final static int q = 4;
            int w = j;
            int t = e;
            int y = r;
        }
    }

    public static void main(String[] args) {

    }
}
