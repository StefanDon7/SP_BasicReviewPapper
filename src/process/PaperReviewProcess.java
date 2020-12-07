/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import context.Kraj;
import context.Paper;
import context.PiseRad;
import context.State;
import java.util.Scanner;

/**
 *
 * @author Dusan
 */
public class PaperReviewProcess {

    private final Paper paper;

    public PaperReviewProcess() {
        paper = new Paper(new PiseRad());
    }

    public void reviewPaperProcess() {
        Scanner input = new Scanner(System.in);
        int choise;
        do {
            System.out.println("1.Get current state");
            System.out.println("2.Do something with paper in curent state");
            System.out.println("3.Exit application");
            System.out.println("Your choise is:");
            choise = input.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Paper current state: ");
                    System.out.println(paper.getState());
                    break;
                case 2:
                    State s = paper.getState().next();
                    if (s.toString().equals("Kraj")) {
                        choise=3;
                    }
                    paper.setState(s);
                    break;
                case 3:
            }
        } while (choise != 3);

        input.close();
    }
}
