package Beakjoon.step09;
//StringTokenizer �̿�...
import java.util.*;
import java.io.*;

public class Test1316_2 {
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //�ܾ� ����
        int groupWordCount = n; // �׷�ܾ� ��
        
        for(int i=0;i<n;i++) {
        	st = new StringTokenizer(br.readLine());
        	String word = st.nextToken();
        	
        	int[] checkArray = new int[26];
        	checkArray[word.charAt(0)-97] =-1; //�ʱⰪ ����
        	
        	if(word.length()>1) {
        		for(int j=1;j<word.length();j++) {
        			if(checkArray[word.charAt(j)-97]== -1&&word.charAt(j)!=word.charAt(j-1)) {
        				// �� �� ���Ա⵵ �ߴµ� ���� ���ĺ��� �ٸ��� �׷�ܾ�� Ż�� 
        				groupWordCount--;
        				break;
        			}
        			 checkArray[word.charAt(j) - 97] = -1; 
        			 // �ش� ���ĺ��� ������ -1�� �ٲ�(���߿� üũ�� �������� �̹� �� �� ���Ծ��ٴ� ����)
        		}
        	}
        }
        bw.write(String.valueOf(groupWordCount));
        bw.flush();
	}
}
