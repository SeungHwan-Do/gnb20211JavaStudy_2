import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TempConverter extends JFrame{

	public TempConverter() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel lab1 = new JLabel("ȭ�� �µ�");
		JLabel lab2 = new JLabel("���� �µ�");
		JTextField f1 = new JTextField(15);
		JTextField f2 = new JTextField(15);
		
		JButton b = new JButton("��ȯ");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String ct = f2.getText();	//f2�� �Էµ� ���ڸ� �����´�
				int c,f;
				if (ct.equals(""))	//f2�� �ƹ��͵� �Էµ��� �ʴ´ٸ�
					c = 0;		//c�� 0���� �д�
				else
					c = Integer.parseInt(ct);	//wrapperŬ���� �̿�, ct�� ������ �ٲپ� c�� �����Ѵ�
				
				String ft = f1.getText();	//f1�� �Էµ� ���ڸ� �����´�
				if (ft.equals(""))	//f2�� �ƹ��͵� �Էµ��� �ʴ´ٸ�
					f = 0;		//f�� 0���� �д�
				else
					f = Integer.parseInt(ft);	//ft�� ������ �ٲپ� f�� �����Ѵ�
				
				
				if(f == 0) {	//f�� 0�� ���
					f = (int)(9/5*c+32);	//�����µ��� ȭ���µ��� �ٲپ� f�� ����
					f1.setText(Integer.toString(f));	//wrapperŬ���� �̿�, f�� String���� �ٲپ� f1 �ؽ�Ʈ�� ����
				}
				else if(c == 0 ) {	//c�� 0�� ���
					c = (int)((f-32)*5/9);	//ȭ���µ��� �����µ��� �ٲپ� c�� ����
					f2.setText(Integer.toString(c));}	//c�� String���� �ٲپ� f2�ؽ�Ʈ�� ����
				}
			});
		
		panel.add(lab1);   panel.add(f1);
		panel.add(lab2);   panel.add(f2);
		panel.add(b);
		
		setSize(280,150);
		setTitle("�µ���ȯ��");
		setVisible(true);
	}
	public static void main(String[] args) {
		new TempConverter(); 
		}
}
