package db.mysql;
class TestApp{
	public static void main(String[] args){
		/*
		1.����Ϸ��� DB�� �´� ����̹� �ε�(Ŭ���� �ε�)
		    Class.forName("���ϴ� Ŭ������")
		2.DB���� 
		3.������ ����
		4.DB���� ��ü ����
		*/
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� ����!!");
		}catch(ClassNotFoundException e){
			e.printStackTrace(); //�����ڰ� ������ �м��ϱ� ���� ���
			System.out.println("����̹��� ã�� �� �����ϴ٤̤�");//������ ���� ģ���� �޽���
		}

	}
}
