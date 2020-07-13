package controller;

import model.TeamDAO;
import modelDTO.TeamScore;
import view.EndView;

public class Controller {
	private static TeamDAO homerun = TeamDAO.getInstance();
	public static String firTeam;
	public static String secTeam;
	
	public static String firWinTeam;
	public static String secWinTeam;
	public static String thirdWinTeam;
	public static String fourthWinTeam;

	public static String firFinalTeam;
	public static String secFinalTeam;

	public static String winnerTeam;
	
	//���� �� �Ұ�
	public static void selectAll() {
		EndView.printAllTeams(homerun.selectAll());
	}
	
	//���� �� ��� ����
	public static String updateTeam(String team, String newName) {
		return homerun.update(team, newName);
	}
	
	//���ο� �� ����
	public static void insertTeam(TeamScore newTeam) {
		homerun.insert(newTeam);
	}
	
	//�÷��̿��� ���� ������ ����
	public static String deleteTeam(String team) {
		return homerun.delete(team);
	}
	
	//�÷��̿��� ���� �� ����
	public static void getRandomTeam() {
	      firTeam = homerun.RandomTeam();
	      TeamDAO.removeList(firTeam);
	      secTeam = homerun.RandomTeam();
	      TeamDAO.removeList(secTeam);
	   }
	
	//���� �� ����
	public static int totalScore() {
		return homerun.totalNum();
	}

	public static void changeList() {
		homerun.changeList();
		
	}
	
	public static void versusTeam() {
	    System.out.println(firTeam+" vs "+secTeam);
	}
	
	//���� ���
	public static void getTotalNum() {
	      homerun.totalNum();
	}
	
	//1ȸ�� �� ����
	public static void getRandomNum() {
	      homerun.randomNum();
	}
	
	//���� �� �¸���
	public static void getWinner() {
	      if (TeamDAO.firtotalnum > TeamDAO.sectotalnum) {
	         winnerTeam = firTeam;
	      }else {
	         winnerTeam = secTeam;
	      }
	      System.out.println(winnerTeam+" ��");
	      TeamDAO.firtotalnum = 0;
	      TeamDAO.sectotalnum = 0;
	   }
	
	
	//8�� 1��� �¸���
	public static void getFirWinner() {
	      firWinTeam = winnerTeam;
	      System.out.println(firWinTeam +" 4�� ����!");
	}
	//8�� 2��� �¸���
	public static void getSecWinner() {
	      secWinTeam = winnerTeam;
	      System.out.println(secWinTeam +" 4�� ����!");
	}
	//8�� 3��� �¸���
	public static void getThirdWinner() {
	      thirdWinTeam = winnerTeam;
	      System.out.println(thirdWinTeam +" 4�� ����!");
	}
	//8�� 4��� �¸���
	public static void getfourthWinner() {
	      fourthWinTeam = winnerTeam;
	      System.out.println(fourthWinTeam +" 4�� ����!");
	}
	//4�� 1��� �¸���
	public static void getFirFinalTeam() {
	      firFinalTeam = winnerTeam;
	      System.out.println(firFinalTeam +" �ѱ��ø��� ����!");
	}
	//4�� 2��� �¸���   
	public static void getSecFinalTeam() {
	      secFinalTeam = winnerTeam;
	      System.out.println(secFinalTeam +" �ѱ��ø��� ����!");
	}

}
