package my;

import java.util.ArrayList;
import my.Pos;

class Graph {
	public ArrayList<Pos> func;
	private int range;
	private int max_x;
	private int max_y;

	Graph() {
		this.func = new ArrayList<>();
		this.range = 100;
		calc();
		getMax();
	}

	Graph(int range) {
		this.func = new ArrayList<>();
		this.range = range;
		calc();
		getMax();
	}

	private void calc() {
		int move_x = 0;
		int move_y = 5;
		for (int x = 0 - move_x; x <= range - move_x; x++) {
			int pos_x = x + move_x;
			int pos_y = (int) (Math.log(x) * Math.sin(x)) + move_y; // *
			func.add(x + move_x, new Pos(pos_x, pos_y));
		}
	}

	private void getMax() {
		max_x = range;
		max_y = func.get(0).y;
		for (int x = 1; x <= max_x; x++)
			max_y = Math.max(max_y, func.get(x).y);
	}

	public void draw() {
		for (int y = max_y; y >= 0; y--) {
			System.out.printf("%-3d", y);
			for (int x = 0; x <= max_x; x++)
				// 일치
				if ((func.get(x).x == x) && (func.get(x).y == y))
					System.out.print("■");
				// 중간 잇기
				else if ((x != max_x) && (func.get(x).y < y) && (func.get(x + 1).y > y))
					System.out.print("▲");
				else if ((x != 0) && (func.get(x - 1).y > y) && (func.get(x).y < y))
					System.out.print("▼");
				// 불일치
				else
					System.out.print("□");
			System.out.println();
		}
	}
}