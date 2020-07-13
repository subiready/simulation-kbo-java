package view;

import controller.Controller;
import modelDTO.TeamScore;

public class StartView {
	public static void main(String[] args) {
		
		//���� �� ��� ���� (Update)
		System.out.println("\n*** KBO�� ��� ������Ʈ (�� ��� ���� ��) ***");
		Controller.selectAll();
		System.out.println("\n*** KBO�� ��� ������Ʈ (�� ��� ���� ��) ***");
		System.out.println(Controller.updateTeam("LG Ʈ����", "�Ե� ���̾���"));
		Controller.selectAll();
		
		//�÷��̿��� ���� ���� �� ����(Delete)
		System.out.println("\n*** �÷��̿��� ���� Ż�� �� (�� ����)***");
		System.out.println(Controller.deleteTeam("�Ե� ���̾���"));
		
		//���ο� �� �߰� (Create)
		System.out.println("\n*** KBO�� �Ұ� (���ο� �� �߰� ��) ***");
		Controller.selectAll();
		System.out.println("\n*** KBO�� �Ұ� (���ο� �� �߰� ��) ***");
		Controller.insertTeam(new TeamScore("LG Ʈ����"));
		Controller.insertTeam(new TeamScore("KT ����"));
		Controller.insertTeam(new TeamScore("�Ｚ ���̿���"));
		Controller.selectAll();
		
		//��� ���� (Read)
		  System.out.println("\n*** 2020 KBO �÷��̿��� ���� �ջջջ�  ***");
	      System.out.println("\n*** 8�� 1��� ***");
	      Controller.changeList();
	      Controller.getRandomTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.print(Controller.firTeam);//1��
	      System.out.print(" vs ");
	      System.out.println(Controller.secTeam);
	      
	      Controller.getRandomNum();
	      Controller.getWinner();
	      Controller.getFirWinner();

	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.println(" -----------------------------------------");
	      
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.println("\n*** 8�� 2��� ***");
	      Controller.getRandomTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.print(Controller.firTeam);//1��
	      System.out.print(" vs ");
	      System.out.println(Controller.secTeam);
	      
	      Controller.getRandomNum();
	      Controller.getWinner();
	      Controller.getSecWinner();

	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      System.out.println(" -----------------------------------------");
	      
	      System.out.println("\n*** 8�� 3��� ***");
	      Controller.getRandomTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      System.out.print(Controller.firTeam);//1��
	      System.out.print(" vs ");
	      System.out.println(Controller.secTeam);
	      
	      Controller.getRandomNum();
	      Controller.getWinner();
	      Controller.getThirdWinner();

	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	      System.out.println("-----------------------------------------");
	      
	      System.out.println("\n*** 8�� 4��� ***");
	      Controller.getRandomTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.print(Controller.firTeam);//1��
	      System.out.print(" vs ");
	      System.out.println(Controller.secTeam);
	      
	      Controller.getRandomNum();
	      Controller.getWinner();
	      Controller.getfourthWinner();

	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.println(" -----------------------------------------");
	      
	      System.out.println("\n*** 4�� 1��� ***");
	      Controller.firTeam = Controller.firWinTeam;
	      Controller.secTeam = Controller.secWinTeam;
	      Controller.versusTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      Controller.getRandomNum();
	      Controller.getTotalNum();
	      Controller.getWinner();
	      Controller.getFirFinalTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.println("-----------------------------------------");

	      System.out.println("\n*** 4�� 2��� ***");
	      Controller.firTeam = Controller.thirdWinTeam;
	      Controller.secTeam = Controller.fourthWinTeam;
	      Controller.versusTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      Controller.getRandomNum();
	      Controller.getTotalNum();
	      Controller.getWinner();
	      Controller.getSecFinalTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      System.out.println("-----------------------------------------");

	      System.out.println("\n*** !!�ѱ� �ø��� �����!! ***");
	      Controller.firTeam = Controller.firFinalTeam;
	      Controller.secTeam = Controller.secFinalTeam;
	      Controller.versusTeam();
	      try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      Controller.getRandomNum();
	      Controller.getTotalNum();
	      System.out.println("\n~~~ �ѱ��ø���  ����� ~~~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n~~~ �� �� �� �� ~~~");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n!!! �� �� �� �� !!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	      Controller.getWinner();
	      
	   }

		
	}

