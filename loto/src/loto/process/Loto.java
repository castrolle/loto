package loto.process;

import java.io.FileNotFoundException;
import java.util.List;

import loto.enums.RandomNumbers;
import loto.load.CSVLoader;
import loto.model.ResultVO;
import loto.model.RevengeResultVO;

public class Loto {
	public static void main(String[] args) throws FileNotFoundException {

		List<RevengeResultVO> revengeResult = CSVLoader.loadRevengeResult();
		List<ResultVO> result = CSVLoader.loadResult();
		Counter.loadRevengeResult(revengeResult);
		Counter.loadResult(result);
		Counter.monteCarlo();

		int[][] options = new int[1][5];
		for (int j = 0; j < 1; j++) {
			for (int i = 0; i < 5; i++) {
				options[j][i] = Counter
						.getRandomNumber(RandomNumbers.MONTECARLO);
				System.out.print(options[j][i] + " ");
			}
			System.out.println();
		}
		// System.out.println(options);
	}
}
