package lessontable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

class LessonTable implements TableModel{
	private String[] title= {
		"周一","周二","周三","周四","周五","周六","周日"
	};
	private String[][] data=new String[8][7];
	
	public LessonTable() {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[i].length;j++) {
				data[i][j] ="";
			}
		}
	}

	@Override
	public int getRowCount() {
		return 8;
	}

	@Override
	public int getColumnCount() {
		return 7;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return title[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		data[rowIndex][columnIndex]=(String)aValue;
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Main{
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		JTable table=new JTable(new LessonTable());
		JScrollPane panel=new JScrollPane(table);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
//		frame.pack();//计算自己的大小
		frame.setSize(400,400);//
		frame.setVisible(true);
	}
}

/**
 * JTalbe
 * 用JTalbe类可以以表格的形式显示和编辑数据。JTable类的对象并不存储数据，它只是数据的表现。
 * 
 * 数据和表现分离
 * 
 * MVC
 * 数据Model、表现View、控制Control三者分离，各负其责，(Control和View没有直接联系)
 * Model:保存和维护数据，提供接口让外部修改数据，通知View需要刷新
 * View:从Model获得数据，根据数据画出View
 * Control:从用户得到输入，根据输入调整数据
 */
