package chap04;

public class Stack<E> {
	private int max;
	private int ptr;
	private E[] stk; // ���� ��ü

	// ������ �� ���ܣ������� ��� ����
	@SuppressWarnings("serial")
	public static class EmptystackException extends RuntimeException {
		public EmptystackException() {
		}
	}

	// ������ �� ���ܣ������� ���� ��
	@SuppressWarnings("serial")
	public static class OverflowstackException extends RuntimeException {
		public OverflowstackException() {
		}
	}
	//������
	@SuppressWarnings("unchecked")
	public Stack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max]; // ���� ��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� �����ϴ�.
			max = 0;
		}
	}
	// ���ÿ� x�� Ǫ��
		public E push(E x) throws OverflowstackException {
			if (ptr >= max) // ������ ���� ��
				throw new OverflowstackException();
			return stk[ptr++] = x;
		}
		// ���ÿ��� �����͸� �� (������� �����͸� ����)
		public E pop() throws EmptystackException {
			if (ptr <= 0) // ������ ��� ����
				throw new EmptystackException();
			return stk[--ptr];
		}

		// ���ÿ��� �����͸� ��ũ(������� �����͸� ���� ��)
		public E peek() throws EmptystackException {
			if (ptr <= 0) // ������ ��� ����
				throw new EmptystackException();
			return stk[ptr - 1];
		}

		// ���ÿ��� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
		public int indexOf(E x) {
			for (int i = ptr - 1; i >= 0; i--) // ������ʺ��� ���� �˻�
				if (stk[i].equals(x))
					return i; // �˻�����
			return -1; // �˻�����
		}

		// ������ ���
		public void clear() {
			ptr = 0;
		}

		// ������ �뷮�� ��ȯ
		public int capacity() {
			return max;
		}

		// ���ÿ� �׿��ִ� ������ ���� ��ȯ
		public int size() {
			return ptr;
		}

		// ������ ��� �ִ°�?
		public boolean isEmpty() {
			return ptr <= 0;
		}

		// ������ ���� á�°�?
		public boolean isFull() {
			return ptr >= max;
		}

		// ���� ���� �����͸� �ٴڡ������� ���ʷ� �����
		public void dump() {
			if (ptr <= 0)
				System.out.println("������ ������ϴ�.");
			else {
				for (int i = 0; i < ptr; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
		}
	}