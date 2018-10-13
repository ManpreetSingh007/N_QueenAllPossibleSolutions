package nQueens;

import java.util.ArrayList;

public class TestMainline {

	public static void main(String[] args) {
		System.out.println("Author - Manpreet Singh");
		GameBoard size5 = new GameBoard(5);
		ArrayList<GameBoard> solution = new ArrayList<GameBoard>();
	    solution = size5.getAllSolutions();
		System.out.println(solution);
	}

}
