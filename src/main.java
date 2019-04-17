import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


// �ڹ� �ڵ带 ���ؼ� ����
import java.awt.AlphaComposite;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.Descriptor;

public class main{

	public static char alphabetBoard[][] = new char[5][5];
	public static boolean oddFlag = false; //���ڼ� ���
	public static String zCheck ="";
	
	public static void main(String[] args) {
		ImageIcon s_back = new ImageIcon("./img/start_page.png");

		JFrame s_frame = new JFrame(); 
		JLabel s_label  = new JLabel(s_back);
		JPanel s_panel = new JPanel();
		
        JButton s_btn = new JButton(new ImageIcon("./img/start_btn.png"));
        JButton c_btn = new JButton(new ImageIcon("./img/cancel_btn.png"));
		
		s_frame.setTitle("3114 ������ȣ ��ȣ���� ������Ʈ"); 
		s_frame.setPreferredSize(new Dimension(870, 630)); 
		s_frame.setLocation(0, 0);
		s_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		s_panel.add(s_btn);
        s_panel.add(c_btn);
		
        Container conn = s_frame.getContentPane();
        
        s_btn.setBorderPainted(false);  //��ư ��� �����ϰ�!
        s_btn.setFocusPainted(false);
        s_btn.setContentAreaFilled(false);
        
        s_btn.setLocation(100, 270);
        s_btn.setSize(200,300);
        conn.add(s_btn);
        
        c_btn.setBorderPainted(false);  
        c_btn.setFocusPainted(false);
        c_btn.setContentAreaFilled(false);
        
        c_btn.setLocation(550, 270);
        c_btn.setSize(200,300); 
        conn.add(c_btn);
        
		s_frame.add(s_panel);
		s_panel.add(s_label);
		
		s_frame.pack(); 
		s_frame.setVisible(true);
		
		// ȭ�� ��ȯ
		ImageIcon m_back = new ImageIcon("./img/main_page.png");
		
		JFrame frame = new JFrame(); 
		JLabel ma_label = new JLabel("");
		
		JTextField m_text = new JTextField(100);
        JTextField m_text1 = new JTextField(100);
        
		JLabel m_label  = new JLabel(m_back);
		JPanel m_panel = new JPanel();
		
		JButton e_btn = new JButton(new ImageIcon("./img/encry_btn.png"));
        JButton d_btn = new JButton(new ImageIcon("./img/decry_btn.png"));
        JButton r_btn = new JButton(new ImageIcon("./img/reset.png"));
		
        m_panel.add(m_text);
        m_panel.add(m_text1);
		
		frame.setTitle("������ȣ ��ȣ���� ������Ʈ"); 
		frame.setPreferredSize(new Dimension(870, 630)); 
		frame.setLocation(0, 0); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		frame.add(m_panel);
		m_panel.add(m_label);
		m_panel.add(e_btn);
        m_panel.add(d_btn);
		m_panel.add(r_btn);
		
		frame.pack();
		frame.setVisible(false);
		
        Container con = frame.getContentPane();
        
        m_text.setSize(300,40);
        m_text.setLocation(315, 170);
        con.add(m_text);
        
        m_text1.setSize(340,40);
        m_text1.setLocation(315, 300);
        con.add(m_text1);
        
        ma_label.setLocation(320, -230);
	    con.add(ma_label);
	    
        e_btn.setBorderPainted(false);  
        e_btn.setFocusPainted(false);
        e_btn.setContentAreaFilled(false);
        
        e_btn.setLocation(100, 300);
        e_btn.setSize(200,300);
        con.add(e_btn);
        
        d_btn.setBorderPainted(false);  
        d_btn.setFocusPainted(false);
        d_btn.setContentAreaFilled(false);
        
        d_btn.setLocation(550, 300);
        d_btn.setSize(200,300);
        con.add(d_btn);
        
        r_btn.setBorderPainted(false);  
        r_btn.setFocusPainted(false);
        r_btn.setContentAreaFilled(false);
        
        r_btn.setLocation(330, 300);
        r_btn.setSize(200,300);
        con.add(r_btn);
        
        frame.add(m_panel);
		m_panel.add(m_label);
		

//		---------------------------------------------------------
//		------------------------- ��ȣȭ --------------------------
		  ImageIcon encry = new ImageIcon("./img/encry_page.png"); //�̹��� ������ ���� ��� ��ư �����
		  JLabel e_bg  = new JLabel(encry);
	              
	      JPanel e_panel = new JPanel();
	      JFrame e_frame = new JFrame();
	      JLabel e_label = new JLabel("");
	      
	      e_label.setFont(new Font("����ǹ��� ����", Font.PLAIN, 35));
	      
	      e_frame.setUndecorated(false);

	      e_label.setSize(590, 800);
	      e_frame.setLocation(250, 100);
	      e_frame.setSize(425,335);	
	      e_frame.setTitle("��ȣȭ");
	      
	      Container c = e_frame.getContentPane();
	      
	      e_label.setLocation(40, -240);
		  c.add(e_label);
		  
	      e_panel.add(e_bg);
	      e_frame.add(e_panel);
	      
// 		---------------------------------------------------------	
//		------------------------- ��ȣȭ --------------------------
	      ImageIcon decry = new ImageIcon("./img/decry_page.png"); //�̹��� ������ ���� ��� ��ư �����
		  JLabel d_bg  = new JLabel(decry);
		              
	      JPanel d_panel = new JPanel();
	      JFrame d_frame = new JFrame();
	      JLabel d_label = new JLabel("");
	      
	      d_label.setFont(new Font("����ǹ��� ����", Font.PLAIN, 35));
		      
		  d_frame.setUndecorated(false);
		  d_label.setSize(550, 800);
		  d_frame.setLocation(250, 100);
		  d_frame.setSize(425,335);		
		  d_frame.setTitle("��ȣȭ");
		  
		  Container co = d_frame.getContentPane();
		  d_label.setLocation(85, -240);
		  co.add(d_label);
		  
		  d_panel.add(d_bg);
		  d_frame.add(d_panel);
		  
//	 	---------------------------------------------------------	
		      	      
//		��ư �̺�Ʈ��
		s_btn.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	            s_frame.setVisible(false);
	            frame.setVisible(true);
	          }
	    });
		c_btn.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	            s_frame.setVisible(false);
	          }
	    });  
		r_btn.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	            m_text.setText("");
	            m_text1.setText("");
	          }
	    });  
	    e_btn.addActionListener(new ActionListener() { //��ȣȭ
	        public void actionPerformed(ActionEvent e) {
	        	e_frame.setVisible(true);
            	
            	String decryption;
    			String encryption;
    			
            	String key = m_text.getText();
            	String str = m_text1.getText();
            	
            	String blankCheck="";
    			int blankCheckCount=0;

    			setBoard(key);							//��ȣȭ�� ���� ��ȣ�� ����
    			
    			for( int i = 0 ; i < str.length() ; i++ ) {
    				if(str.charAt(i)==' '){ //��������
    					str = str.substring(0,i)+str.substring(i+1,str.length());
    					blankCheck+=10;
    				}
    				else{
    					blankCheck+=0;
    				}
    				if(str.charAt(i)=='z') { //z�� q�� �ٲ��༭ ó����.
    					str = str.substring(0,i)+'q'+str.substring(i+1,str.length());
    					zCheck+=1;
    				}
    				else {
    					zCheck+=0;
    				}
    			}
    			
    			encryption = strEncryption(key, str);
    			

    			//��ºκ�
    			e_label.setText(" " + encryption);


    			for( int i = 0 ; i < encryption.length() ; i++ ) {
    				if(encryption.charAt(i)==' ') //��������
    					encryption = encryption.substring(0,i)+encryption.substring(i+1,encryption.length());
    			}
    			
    			decryption = strDecryption(key, encryption, zCheck);
    			
    			for( int i = 0 ; i < decryption.length() ; i++){
    				if(blankCheck.charAt(i)=='1'){
    					decryption = decryption.substring(0,i)+" "+decryption.substring(i,decryption.length());
    				}
    			}
    			
            }
    		
    		private String strDecryption(String key, String str, String zCheck) {
    			ArrayList<char[]> playFair = new ArrayList<char[]>(); //�ٲٱ� �� ���ھ�ȣ�� ������ ��
    			ArrayList<char[]> decPlayFair = new ArrayList<char[]>(); //�ٲ� ���� ���ھ�ȣ ������ ��
    			int x1 = 0 , x2 = 0 , y1 = 0, y2 = 0; //���� ��ȣ �� ������ ������ ��,�� ��
    			String decStr ="";

    			int lengthOddFlag = 1;
    			    			
    			for( int i = 0 ; i < str.length() ; i+=2 ){
    				char[] tmpArr = new char[2];
    				tmpArr[0] = str.charAt(i);
    				tmpArr[1] = str.charAt(i+1);
    				playFair.add(tmpArr);
    			}
    			
    			
    			for(int i = 0 ; i < playFair.size() ; i++ ){
    				char[] tmpArr = new char[2];
    				for( int j = 0 ; j < alphabetBoard.length ; j++ ){
    					for( int k = 0 ; k < alphabetBoard[j].length ; k++ ){
    						if(alphabetBoard[j][k] == playFair.get(i)[0]){
    							x1 = j;
    							y1 = k;
    						}
    						if(alphabetBoard[j][k] == playFair.get(i)[1]){
    							x2 = j;
    							y2 = k;
    						}
    					}
    				}
    				
    				if(x1==x2) { //���� ���� ��� ���� �ٷ� �Ʒ��� ����
    					tmpArr[0] = alphabetBoard[x1][(y1+4)%5];
    					tmpArr[1] = alphabetBoard[x2][(y2+4)%5];
    				}
    				else if(y1==y2){ //���� ���� ��� ���� �ٷ� �� �� ����    				
    					tmpArr[0] = alphabetBoard[(x1+4)%5][y1];
    					tmpArr[1] = alphabetBoard[(x2+4)%5][y2];
    				}
    				else { //��, �� �ٸ���� ���� �밢���� �ִ� ��.    				
    					tmpArr[0] = alphabetBoard[x2][y1];
    					tmpArr[1] = alphabetBoard[x1][y2];
    				}	
    				decPlayFair.add(tmpArr); 				
    			}
    			
    			for(int i = 0 ; i < decPlayFair.size() ; i++) { //�ߺ� ���ڿ� ��������
    				if(i!=decPlayFair.size()-1 && decPlayFair.get(i)[1]=='x'&& decPlayFair.get(i)[0]==decPlayFair.get(i+1)[0]){	
    					decStr += decPlayFair.get(i)[0];
    				}
    				else{
    					decStr += decPlayFair.get(i)[0]+""+decPlayFair.get(i)[1];
    				}
    			}
    			
    			
    			
    			for(int i = 0 ; i < zCheck.length() ; i++ ) { //z��ġ ã�Ƽ� q�� ��������
    				if( zCheck.charAt(i) == '1' ) 
    					decStr = decStr.substring(0,i)+'z'+decStr.substring(i+1,decStr.length());   				
    			}

    			if(oddFlag) decStr = decStr.substring(0,decStr.length()-1);
    
    			return decStr;
    		}

    		private String strEncryption(String key, String str){
    			ArrayList<char[]> playFair = new ArrayList<char[]>();
    			ArrayList<char[]> encPlayFair = new ArrayList<char[]>();
    			int x1 = 0 , x2 = 0 , y1 = 0, y2 = 0;
    			String encStr ="";	
    			
    			for( int i = 0 ; i < str.length() ; i+=2 ){ // arraylist ����
    				char[] tmpArr = new char[2];
    				tmpArr[0] = str.charAt(i);
    				try{
    					if( str.charAt(i) == str.charAt(i+1)){ //���� �ݺ��Ǹ� x�߰�   					
    						tmpArr[1] = 'x';
    						i--;
    					}else{
    						tmpArr[1] = str.charAt(i+1);
    					}
    				}catch(StringIndexOutOfBoundsException e){
    					tmpArr[1] = 'x'; 
    					oddFlag = true;
    				}
    				playFair.add(tmpArr);
    			}
    			
    			for(int i = 0 ; i < playFair.size() ; i++ ){

    				char[] tmpArr = new char[2];
    				for( int j = 0 ; j < alphabetBoard.length ; j++ ){ //���ھ�ȣ�� ���� ��ġüũ
    					for( int k = 0 ; k < alphabetBoard[j].length ; k++ ){
    						if(alphabetBoard[j][k] == playFair.get(i)[0]){
    							x1 = j;
    							y1 = k;
    						}
    						if(alphabetBoard[j][k] == playFair.get(i)[1]) {
    							x2 = j;
    							y2 = k;
    						}
    					}
    				}
    				
    				
    				if(x1==x2){ //���� �������
    					tmpArr[0] = alphabetBoard[x1][(y1+1)%5];
    					tmpArr[1] = alphabetBoard[x2][(y2+1)%5];
    				}
    				else if(y1==y2){ //���� ���� ���
    					tmpArr[0] = alphabetBoard[(x1+1)%5][y1];
    					tmpArr[1] = alphabetBoard[(x2+1)%5][y2];
    				} 
    				else {//��, �� ��� �ٸ����
    					tmpArr[0] = alphabetBoard[x2][y1];
    					tmpArr[1] = alphabetBoard[x1][y2];
    				}
    				encPlayFair.add(tmpArr);
    			}
    			
    			for(int i = 0 ; i < encPlayFair.size() ; i++){
    				encStr += encPlayFair.get(i)[0]+""+encPlayFair.get(i)[1]+" ";
    			}
    			return encStr;
    		}

    		private void setBoard(String key) {
    			String keyForSet = "";					// �ߺ��� ���ڰ� ���ŵ� ���ڿ��� ������ ���ڿ�.
    			boolean duplicationFlag = false;		// ���� �ߺ��� üũ�ϱ� ���� flag ����.
    			int keyLengthCount = 0;					// alphabetBoard�� keyForSet�� �ֱ� ���� count����.
    			
    			key += "abcdefghijklmnopqrstuvwxyz"; 	// Ű�� ��� ���ĺ��� �߰�.

    			
    			// �ߺ�ó��
    			for( int i = 0 ; i < key.length() ; i++ ) {
    				for( int j = 0 ; j < keyForSet.length() ; j++ ){
    					if(key.charAt(i)==keyForSet.charAt(j)){
    						duplicationFlag = true;
    						break;
    					}
    				}
    				if(!(duplicationFlag)) keyForSet += key.charAt(i);
    				duplicationFlag = false;
    			}
    			//�迭�� ����
    			for( int i = 0 ; i < alphabetBoard.length ; i++ ){
    				for( int j = 0; j <alphabetBoard[i].length ; j++ ){
    					alphabetBoard[i][j] = keyForSet.charAt(keyLengthCount++);
    				}
    			}		
            }
        });
		
		d_btn.addActionListener(new ActionListener() { //��ȣȭ
            public void actionPerformed(ActionEvent e) {
            	d_frame.setVisible(true);
            	
            	String decryption;
    			String encryption;
    			
            	String key = m_text.getText();
            	String str = m_text1.getText();           	
            	String blankCheck="";
    			int blankCheckCount=0;

    			setBoard(key);							//��ȣȭ�� ���� ��ȣ�� ����
    			
    			for( int i = 0 ; i < str.length() ; i++ ) {
    				if(str.charAt(i)==' '){ //��������
    					str = str.substring(0,i)+str.substring(i+1,str.length());
    					blankCheck+=10;
    				}
    				else{
    					blankCheck+=0;
    				}
    				if(str.charAt(i)=='z'){ //z�� q�� �ٲ��༭ ó����.
    					str = str.substring(0,i)+'q'+str.substring(i+1,str.length());
    					zCheck+=1;
    				}
    				else {
    					zCheck+=0;
    				}
    			}
    			
    			encryption = strEncryption(key, str);
    			

    			//��ºκ�
    			e_label.setText(" " + encryption);


    			for( int i = 0 ; i < encryption.length() ; i++ ) {
    				if(encryption.charAt(i)==' ') //��������
    					encryption = encryption.substring(0,i)+encryption.substring(i+1,encryption.length());
    			}
    			
    			decryption = strDecryption(key, encryption, zCheck);
    			
    			for( int i = 0 ; i < decryption.length() ; i++){
    				if(blankCheck.charAt(i)=='1'){
    					decryption = decryption.substring(0,i)+" "+decryption.substring(i,decryption.length());
    				}
    			}    			
    			d_label.setText("" + decryption);
    		}
    		
    		private String strDecryption(String key, String str, String zCheck) {
    			ArrayList<char[]> playFair = new ArrayList<char[]>(); //�ٲٱ� �� ���ھ�ȣ�� ������ ��
    			ArrayList<char[]> decPlayFair = new ArrayList<char[]>(); //�ٲ� ���� ���ھ�ȣ ������ ��
    			int x1 = 0 , x2 = 0 , y1 = 0, y2 = 0; //���� ��ȣ �� ������ ������ ��,�� ��
    			String decStr ="";

    			int lengthOddFlag = 1;
    			
    			
    			for( int i = 0 ; i < str.length() ; i+=2 ){
    				char[] tmpArr = new char[2];
    				tmpArr[0] = str.charAt(i);
    				tmpArr[1] = str.charAt(i+1);
    				playFair.add(tmpArr);
    			}
    			
    			
    			for(int i = 0 ; i < playFair.size() ; i++ ){

    				char[] tmpArr = new char[2];
    				for( int j = 0 ; j < alphabetBoard.length ; j++ ){
    					for( int k = 0 ; k < alphabetBoard[j].length ; k++ ){
    						if(alphabetBoard[j][k] == playFair.get(i)[0]){
    							x1 = j;
    							y1 = k;
    						}
    						if(alphabetBoard[j][k] == playFair.get(i)[1]){
    							x2 = j;
    							y2 = k;
    						}
    					}
    				}
    				
    				if(x1==x2){ //���� ���� ��� ���� �ٷ� �Ʒ��� ����
    					tmpArr[0] = alphabetBoard[x1][(y1+4)%5];
    					tmpArr[1] = alphabetBoard[x2][(y2+4)%5];
    				}
    				else if(y1==y2){ //���� ���� ��� ���� �ٷ� �� �� ����
    					tmpArr[0] = alphabetBoard[(x1+4)%5][y1];
    					tmpArr[1] = alphabetBoard[(x2+4)%5][y2];
    				}
    				else {//��, �� �ٸ���� ���� �밢���� �ִ� ��.
    					tmpArr[0] = alphabetBoard[x2][y1];
    					tmpArr[1] = alphabetBoard[x1][y2];
    				}		
    				decPlayFair.add(tmpArr);
    			}
    			
    			for(int i = 0 ; i < decPlayFair.size() ; i++){ //�ߺ� ���ڿ� ��������
    				if(i!=decPlayFair.size()-1 && decPlayFair.get(i)[1]=='x'&& decPlayFair.get(i)[0]==decPlayFair.get(i+1)[0]){	
    					decStr += decPlayFair.get(i)[0];
    				}
    				else{
    					decStr += decPlayFair.get(i)[0]+""+decPlayFair.get(i)[1];
    				}
    			}
    			
    			
    			
    			for(int i = 0 ; i < zCheck.length() ; i++ ){//z��ġ ã�Ƽ� q�� ��������
    				if( zCheck.charAt(i) == '1' ) 
    					decStr = decStr.substring(0,i)+'z'+decStr.substring(i+1,decStr.length());
    			}
			
    			if(oddFlag) decStr = decStr.substring(0,decStr.length()-1);

    			return decStr;
    		}

    		private String strEncryption(String key, String str){
    			ArrayList<char[]> playFair = new ArrayList<char[]>();
    			ArrayList<char[]> encPlayFair = new ArrayList<char[]>();
    			int x1 = 0 , x2 = 0 , y1 = 0, y2 = 0;
    			String encStr ="";
    			
    			
    			
    			for( int i = 0 ; i < str.length() ; i+=2 ){ // arraylist ����
    				char[] tmpArr = new char[2];
    				tmpArr[0] = str.charAt(i);
    				try{
    					if( str.charAt(i) == str.charAt(i+1)) //���� �ݺ��Ǹ� x�߰�
    					{
    						tmpArr[1] = 'x';
    						i--;
    					}else{
    						tmpArr[1] = str.charAt(i+1);
    					}
    				}catch(StringIndexOutOfBoundsException e){
    					tmpArr[1] = 'x'; 
    					oddFlag = true;
    				}
    				playFair.add(tmpArr);
    			}
    			
    			for(int i = 0 ; i < playFair.size() ; i++ ){
    				char[] tmpArr = new char[2];
    				for( int j = 0 ; j < alphabetBoard.length ; j++ ){ //���ھ�ȣ�� ���� ��ġüũ    				
    					for( int k = 0 ; k < alphabetBoard[j].length ; k++ ){
    						if(alphabetBoard[j][k] == playFair.get(i)[0]){
    							x1 = j;
    							y1 = k;
    						}
    						if(alphabetBoard[j][k] == playFair.get(i)[1]){
    							x2 = j;
    							y2 = k;
    						}
    					}
    				}
    				
    				if(x1==x2){ //���� �������
    					tmpArr[0] = alphabetBoard[x1][(y1+1)%5];
    					tmpArr[1] = alphabetBoard[x2][(y2+1)%5];
    				}
    				else if(y1==y2){ //���� ���� ���
    					tmpArr[0] = alphabetBoard[(x1+1)%5][y1];
    					tmpArr[1] = alphabetBoard[(x2+1)%5][y2];
    				} 
    				else{ //��, �� ��� �ٸ����
    					tmpArr[0] = alphabetBoard[x2][y1];
    					tmpArr[1] = alphabetBoard[x1][y2];
    				}
    				
    				encPlayFair.add(tmpArr);
    				
    			}
    			
    			for(int i = 0 ; i < encPlayFair.size() ; i++){
    				encStr += encPlayFair.get(i)[0]+""+encPlayFair.get(i)[1]+" ";
    			}

    			return encStr;
    		}

    		private void setBoard(String key) {
    			String keyForSet = "";					// �ߺ��� ���ڰ� ���ŵ� ���ڿ��� ������ ���ڿ�.
    			boolean duplicationFlag = false;		// ���� �ߺ��� üũ�ϱ� ���� flag ����.
    			int keyLengthCount = 0;					// alphabetBoard�� keyForSet�� �ֱ� ���� count����.
    			
    			key += "abcdefghijklmnopqrstuvwxyz"; 	// Ű�� ��� ���ĺ��� �߰�.

    			// �ߺ�ó��
    			for( int i = 0 ; i < key.length() ; i++ ) {
    				for( int j = 0 ; j < keyForSet.length() ; j++ ){
    					if(key.charAt(i)==keyForSet.charAt(j)){
    						duplicationFlag = true;
    						break;
    					}
    				}
    				if(!(duplicationFlag)) keyForSet += key.charAt(i);
    				duplicationFlag = false;
    			}
    			//�迭�� ����
    			for( int i = 0 ; i < alphabetBoard.length ; i++ ){
    				for( int j = 0; j <alphabetBoard[i].length ; j++ ){
    					alphabetBoard[i][j] = keyForSet.charAt(keyLengthCount++);
    				}
    			}		
            }
        });
	}
}