package view;

import modelDTO.TeamScore;

public class EndView {
	
	//���� ���� ��� �� ���
	public static void printAllTeams(TeamScore[] kboTeam) {
		
		for(int i = 0; i < kboTeam.length; i++) {
			if(kboTeam[i]!=null) {
				System.out.println(kboTeam[i].getTeam() + " ");
			}
		}
		
	}

}
