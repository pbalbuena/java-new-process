package com.pbalbuena;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }


    private static String getInput(){
        System.out.println("Introduce el nombre del proceso que deseas abrir.");
        Scanner in = new Scanner(System.in);
        String output = in.nextLine(); 
        in.close();
        return output;
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Runtime runtime = Runtime.getRuntime();
        try {
            String program = getInput();
            Process p = runtime.exec(program + ".exe");
            p.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
