class keisan {
	public static void main(String args[])
	{
    	// ���́F�Q�̐��l�����
    	int in0 = new java.util.Scanner(System.in).nextInt();
    	int in1 = new java.util.Scanner(System.in).nextInt();
    	System.out.println(in0+","+in1);
    	
    	// �����F�����Z
    	int add = in0+in1;
    	// �����F�����Z
    	int sub = in0-in1;
    	// �����F�|���Z
		int a = in0*in1;
    	// �����F����Z
		int b = in0/in1;
    	// �����F�]��
    	int c = in0%in1;
    	// �v�Z���ʂ��o��
    	System.out.println("�����Z�F"+add);
    	System.out.println("�����Z�F"+sub);
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(+c);
	}
}

