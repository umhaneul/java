package controller;

import emirim.audio.BGMusic;
import emirim.thread.KakaoThread;
import handler.KakaoHandler;
import views.KakaoView;

public class KakaoController {
	
	public static void main(String[] args) {
		KakaoView view=new KakaoView();
		KakaoHandler l = new KakaoHandler(view);
		view.addKeyListener(l);
		new BGMusic();
		KakaoThread kt = new KakaoThread(view);
		kt.start();
	}
}
