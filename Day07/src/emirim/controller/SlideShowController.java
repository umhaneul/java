package emirim.controller;

import emirim.view.SlideShowView;

import java.awt.event.ActionListener;

import emirim.handler.BtnSlideHandler;
import emirim.thread.SlideShowThread;
public class SlideShowController {

	
	public static void main(String[] args) {
		SlideShowView ssv = new SlideShowView();
		SlideShowThread sst = new SlideShowThread(ssv);
		BtnSlideHandler l = new BtnSlideHandler(ssv, sst);
		ssv.getBtnFast().addActionListener(l);
		ssv.getBtnMiddle().addActionListener(l);
		ssv.getBtnSlow().addActionListener(l);
		
		sst.start();
	}
}
