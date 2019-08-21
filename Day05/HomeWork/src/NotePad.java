import java.awt.*;  
import javax.swing.*;  
import javax.swing.filechooser.*;  
import javax.swing.text.StyledEditorKit;  
import java.awt.event.*;  
import java.io.*;  
import java.util.*;

public class NotePad extends JFrame  {  
 JTextArea text;  
 Container pane;  
 JMenuBar nb = new JMenuBar();  
 JMenu file;  
 JMenuItem newI,openI,saveI,closeI,infoI,helpI;  
 JFileChooser open = new JFileChooser();//파일 및 디렉토리 선택 컴포넌트 선언  
   
   
 public NotePad()  
 {  
  pane=getContentPane(); //JFrame 디자인을 위한 컨텐츠 영역 선언  
  pane.setLayout(new BorderLayout()); //JFrame 정렬  
  setJMenuBar(nb); // 메뉴바 붙임  
   
  // 메뉴 및 메뉴 아이템 생성  
  file = new JMenu("파일(F)");  
    
  //파일 메뉴 내용 생성  
  newI = new JMenuItem("새파일");  
  openI = new JMenuItem("열기");  
  saveI = new JMenuItem("저장");  
  closeI = new JMenuItem("닫기");  
  
  // 메뉴에 내용 붙임  
  file.add(newI);  
  file.add(openI);  
  file.add(saveI);  
  file.add(closeI);   
    
  // 메뉴 완성  
  nb.add(file);   
   
  // 메뉴에서 새파일 클릭했을때  
  newI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    text.setText(""); // text내용을 모두 지운다  
   }  
  });  
   
  // 메뉴에서 열기 클릭했을때
  openI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    int re = open.showOpenDialog(NotePad.this); //파일열기 다이얼로그창을 띄운다  
    if (re==JFileChooser.APPROVE_OPTION)     //리턴 상태 확인  
    {  
     String fN;  
     String dir;  
     String str;  
      
     File file_open = open.getSelectedFile(); // 선택한 파일명을 가져온다  
     
     FileInputStream fis;   //파일 시스템의 파일 입력 바이트 취급 스트림 선언  
     ByteArrayOutputStream bo;  //데이터 바이트 배열에 기입해지는 출력 스트림 선언  
      try  
      {  	
       fis = new FileInputStream(file_open); // FileInputStream객체를 생성  
       bo = new ByteArrayOutputStream();     // ByteArrayOutputStream객체를 생성  
       int i = 0;  
       while ((i = fis.read()) != -1) // 파일이 끝날때까지 읽어준다 
       {  
        bo.write(i);                  //len 바이트를 바이트 배열 출력 Stream에 기입  
       }  
        text.setText(bo.toString()); // 화면에 뿌려준다  
       fis.close();                 // FileInputStream을 닫는다.                  
       bo.close();                  // ByteArrayOutputStreamm을 닫는다.  
      }  
      catch(FileNotFoundException fe)  
      {}  
      catch(IOException ie)  
      {}  
    }  
   }  
  });  
   
  //메뉴에서 저장 클릭했을때
  saveI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    int re = open.showSaveDialog(NotePad.this);  
    if (re==JFileChooser.APPROVE_OPTION) // 파일저장 다이얼로그를 띄운다  
    {  
     File file_open = open.getSelectedFile(); // 저장할 파일명을 가져온다  
   
     try  
     {  
     PrintWriter pw   = new PrintWriter(new BufferedWriter(new FileWriter(file_open))); // PrintWriter객체를 생성한다.  
     pw.write(text.getText()); // 화면의 내용을 파일에 쓴다  
     pw.close();  
     }  
       
     catch(FileNotFoundException ie2)  
        {}  
     catch(IOException ie)  
        {}  
    }  
   }  
  });  
   
  //메뉴에서 닫기를 클릭했을 때
  closeI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    dispose(); // 창을 닫고   
    System.exit(0); // 종료한다  
   }  
  });  
 
  {  
  } 
  text = new JTextArea();  
   
  // 화면에 보여질 text들의 상태에 따른 색상 지정  
  text.setCaretColor(Color.black);   
  text.setSelectedTextColor(Color.white);  
  text.setSelectionColor(Color.blue);  
  text.setBackground(Color.white);  
   
  pane.add(new JScrollPane(text));  
  
 }  
   
 public static void main(String[] args)  
 {  
	 Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호를 입력해 주세요:");
		int num = sc.nextInt();
		System.out.println("다시 입력해 주세요:");
		int num2 = sc.nextInt();
		if(num==num2) {
			System.out.println("메모장을 실행 하시겠습까?(y/n):");
			String a = sc.next();
			if(a.equalsIgnoreCase("y") || a.equalsIgnoreCase("Y")) {
				NotePad note = new NotePad(); // 객체생성  
				  note.setSize(400,300); // 사이즈 지정  
				  note.setVisible(true); // 화면에 보이게 함  
			}
			else if(a.equalsIgnoreCase("n") || a.equalsIgnoreCase("N")) {
				System.exit(0);
			}
		}
		else {
			System.out.println("비밀번호가 틀렸습니다. 다시 입력해 주세요:");
			int b =  sc.nextInt();
			if(b == num) {
				NotePad note = new NotePad(); // 객체생성  
				  note.setSize(400,300); // 사이즈 지정  
				  note.setVisible(true); // 화면에 보이게 함  
			}
		}
		
  }  //main
}  //class