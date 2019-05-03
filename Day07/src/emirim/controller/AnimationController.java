package emirim.controller;

import emirim.handler.BtnAinmationHandler;
import emirim.thread.AnimationThread;
import emirim.view.AnimationView;

public class AnimationController {

	public static void main(String[] args) {
		AnimationView av = new AnimationView();
		AnimationThread at = new AnimationThread(av);
		BtnAinmationHandler l =new BtnAinmationHandler(av, at);
		av.getBtnFast().addActionListener(l);
		av.getBtnSlow().addActionListener(l);
		av.getBtnStop().addActionListener(l);
		av.getBtnStart().addActionListener(l);
		at.start();
	}

}
