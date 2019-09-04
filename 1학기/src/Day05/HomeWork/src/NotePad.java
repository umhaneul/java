import java.awt.*;  
import javax.swing.*;
import java.awt.event.*;
import java.io.*;  
import java.util.*;

public class NotePad extends JFrame  {  
 JTextArea text;  
 Container pane;  
 JMenuBar nb = new JMenuBar();  
 JMenu file;  
 JMenuItem newI,openI,saveI,closeI,infoI,helpI;  
 JFileChooser open = new JFileChooser();//���� �� ���丮 ���� ������Ʈ ����  
   
   
 public NotePad()  
 {  
  pane=getContentPane(); //JFrame �������� ���� ������ ���� ����  
  pane.setLayout(new BorderLayout()); //JFrame ����  
  setJMenuBar(nb); // �޴��� ����  
   
  // �޴� �� �޴� ������ ����  
  file = new JMenu("����(F)");  
    
  //���� �޴� ���� ����  
  newI = new JMenuItem("������");  
  openI = new JMenuItem("����");  
  saveI = new JMenuItem("����");  
  closeI = new JMenuItem("�ݱ�");  
  
  // �޴��� ���� ����  
  file.add(newI);  
  file.add(openI);  
  file.add(saveI);  
  file.add(closeI);   
    
  // �޴� �ϼ�  
  nb.add(file);   
   
  // �޴����� ������ Ŭ��������  
  newI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    text.setText(""); // text������ ��� �����  
   }  
  });  
   
  // �޴����� ���� Ŭ��������
  openI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    int re = open.showOpenDialog(NotePad.this); //���Ͽ��� ���̾�α�â�� ����  
    if (re==JFileChooser.APPROVE_OPTION)     //���� ���� Ȯ��  
    {  
     String fN;  
     String dir;  
     String str;  
      
     File file_open = open.getSelectedFile(); // ������ ���ϸ��� �����´�  
     
     FileInputStream fis;   //���� �ý����� ���� �Է� ����Ʈ ��� ��Ʈ�� ����  
     ByteArrayOutputStream bo;  //������ ����Ʈ �迭�� ���������� ��� ��Ʈ�� ����  
      try  
      {  	
       fis = new FileInputStream(file_open); // FileInputStream��ü�� ����  
       bo = new ByteArrayOutputStream();     // ByteArrayOutputStream��ü�� ����  
       int i = 0;  
       while ((i = fis.read()) != -1) // ������ ���������� �о��ش� 
       {  
        bo.write(i);                  //len ����Ʈ�� ����Ʈ �迭 ��� Stream�� ����  
       }  
        text.setText(bo.toString()); // ȭ�鿡 �ѷ��ش�  
       fis.close();                 // FileInputStream�� �ݴ´�.                  
       bo.close();                  // ByteArrayOutputStreamm�� �ݴ´�.  
      }  
      catch(FileNotFoundException fe)  
      {}  
      catch(IOException ie)  
      {}  
    }  
   }  
  });  
   
  //�޴����� ���� Ŭ��������
  saveI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    int re = open.showSaveDialog(NotePad.this);  
    if (re==JFileChooser.APPROVE_OPTION) // �������� ���̾�α׸� ����  
    {  
     File file_open = open.getSelectedFile(); // ������ ���ϸ��� �����´�  
   
     try  
     {  
     PrintWriter pw   = new PrintWriter(new BufferedWriter(new FileWriter(file_open))); // PrintWriter��ü�� �����Ѵ�.  
     pw.write(text.getText()); // ȭ���� ������ ���Ͽ� ����  
     pw.close();  
     }  
       
     catch(FileNotFoundException ie2)  
        {}  
     catch(IOException ie)  
        {}  
    }  
   }  
  });  
   
  //�޴����� �ݱ⸦ Ŭ������ ��
  closeI.addActionListener(new ActionListener()  
  {  
   public void actionPerformed(ActionEvent e)  
   {  
    dispose(); // â�� �ݰ�   
    System.exit(0); // �����Ѵ�  
   }  
  });  
 
  {  
  } 
  text = new JTextArea();  
   
  // ȭ�鿡 ������ text���� ���¿� ���� ���� ����  
  text.setCaretColor(Color.black);   
  text.setSelectedTextColor(Color.white);  
  text.setSelectionColor(Color.blue);  
  text.setBackground(Color.white);  
   
  pane.add(new JScrollPane(text));  
  
 }  
   
 public static void main(String[] args)  
 {  
	 Scanner sc = new Scanner(System.in);
		System.out.print("��й�ȣ�� �Է��� �ּ���:");
		int num = sc.nextInt();
		System.out.println("�ٽ� �Է��� �ּ���:");
		int num2 = sc.nextInt();
		if(num==num2) {
			System.out.println("�޸����� ���� �Ͻðڽ���?(y/n):");
			String a = sc.next();
			if(a.equalsIgnoreCase("y") || a.equalsIgnoreCase("Y")) {
				NotePad note = new NotePad(); // ��ü����  
				  note.setSize(400,300); // ������ ����  
				  note.setVisible(true); // ȭ�鿡 ���̰� ��  
			}
			else if(a.equalsIgnoreCase("n") || a.equalsIgnoreCase("N")) {
				System.exit(0);
			}
		}
		else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ּ���:");
			int b =  sc.nextInt();
			if(b == num) {
				NotePad note = new NotePad(); // ��ü����  
				  note.setSize(400,300); // ������ ����  
				  note.setVisible(true); // ȭ�鿡 ���̰� ��  
			}
		}
		
  }  //main
}  //class