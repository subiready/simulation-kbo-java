package model;

import java.util.ArrayList;
import java.util.Random;

import modelDTO.TeamScore;

public class TeamDAO {
	private static TeamScore[] kboTeam;
	   private static TeamDAO instance = new TeamDAO(); // singleton design pattern
	   public static ArrayList<String> list = new ArrayList<>();

	// �迭�� ����� ������ ������ index ������ ���� ����
	   public static int count = 5;
	   public static int ranNum;
	   public static int firtotalnum;
	   public static int sectotalnum;
	   public static int firTeam;
	   public static int secTeam;
	   static int [] firscore = new int[9];
	   static int [] secscore = new int[9];

	private TeamDAO() {}
	
	public static TeamDAO getInstance() {
		return instance;
	}
	
	 // byte code�� �޸𸮿� �ε��� �� �ѹ��� ���� ����
	   // �����ڰ� ��������� ȣ�� �Ұ��� ��? �̸��� ����
	   static {
	      kboTeam = new TeamScore[] { new TeamScore("��ȭ �̱۽�"),
							            new TeamScore("��� Ÿ�̰Ž�"),
							            new TeamScore("NC ���̳뽺"),
							            new TeamScore("SK ���̹���"),
							            new TeamScore("�λ� ���"),
							            new TeamScore("LG Ʈ����"),null,null};
	   }

	
	//�� �迭�� ����
	public void insert(TeamScore v) {
		kboTeam[count++] = v;
	}
	
	// �������� �迭 ������ ����
	   public String delete(String team) {
	      for (int i = 0; i < kboTeam.length; i++) {
	         if (kboTeam[i].getTeam().equals(team)) {// id1�� id2 �� -> true -> ���� -> �޼ҵ� ����ǹ���
	            kboTeam[i] = null;
	            return team + " �÷��̿��� Ż��";
	         }
	      }
	      return "�����ϰ��� �ϴ� team�� ���׿�"; // if��� �� return ������ �ȵǾ��� ���� ����Ǵ� line
	   }

	   // ���� �ٲٱ� (��������team, �ٲ�����newName)
	   public String update(String team, String newName) {
	      for (int i = 0; i < kboTeam.length; i++) {
	         if (kboTeam[i].getTeam().equals(team)) {
	            kboTeam[i].setTeam(newName);
	            return team + " ����" + newName + "(��)�� ���� ����!";
	         }
	      }
	      return "������ �������� �ʴ� ���̶� ���ٲ���";
	   }

	   // �迭 ��� ��ȯ
	   public TeamScore[] selectAll() {
	      return kboTeam;
	   }

	   public void changeList() {
	      for(int i=0; i<kboTeam.length; i++) {
	         list.add(kboTeam[i].getTeam());
	      }
	      System.out.println();
	      
	   }

	   public String RandomTeam() {
	      Random random = new Random();
	      ranNum = random.nextInt(count);
	      return list.get(ranNum);
//	      list.remove(ranNum);
//	      System.out.println("����! "+list);
//	      count--;
	   }
	   public static void removeList(String team) {
	      list.remove(ranNum);
	      count--;
	   }
	   
	   public void randomNum() {
	      Random random = new Random();

	      for(int i=0; i<9; i++) {
	         firscore[i] = random.nextInt(3);
	         secscore[i] = random.nextInt(3);
	         firtotalnum += firscore[i];
	         sectotalnum += secscore[i];
	         System.out.println("<"+(i+1)+"ȸ> "+firscore[i]+"  :  "+secscore[i]);
	      }
	   }
	   
	   public int totalNum() {
	      System.out.println("--- ���� ---");
	      
	      System.out.println(firtotalnum+"  :  "+sectotalnum);
	      if(firtotalnum > sectotalnum) {
	         return firtotalnum;
	      }
	      return sectotalnum;
	   }
	   
}
