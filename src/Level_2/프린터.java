package Level_2;

import java.util.*;

public class 프린터 {

	public static void main(String[] args) {
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;

		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;

		// 목표 result
//		int result = 1;
		int result = 5;

		// 확인
		System.out.println(solution(priorities, location));
		System.out.println(solution(priorities, location) == result);

	}

	static int solution(int[] priorities, int location) {
		int answer = 0;

		ArrayList<Integer> tmp = new ArrayList<>();

		for (int i : priorities) {
			tmp.add(i);
		}

		while (Collections.max(tmp) != 0) {
			for (int i = 0; i < tmp.size(); i++) {
				if (tmp.get(i) == Collections.max(tmp)) {
					tmp.set(i, 0);
					answer++;
					if (i == location) {
						return answer;
					}
				}

			}
		}
		return 0;
	}

}
