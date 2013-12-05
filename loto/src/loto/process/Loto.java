package loto.process;

import java.io.FileNotFoundException;
import java.util.List;

import loto.enums.RandomNumbers;
import loto.load.CSVLoader;
import loto.model.ResultVO;
import loto.model.RevengeResultVO;

public class Loto {
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		List<RevengeResultVO> revengeResult = CSVLoader.loadRevengeResult();
		List<ResultVO> result = CSVLoader.loadResult();
		Counter.loadRevengeResult(revengeResult);
		Counter.loadResult(result);
		Counter.monteCarlo();

		final int n = 32;
		final int m = 7;
		int[][] options = new int[n][m];
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < m; i++) {
				options[j][i] = Counter
						.getRandomNumber(RandomNumbers.MONTECARLO);
				Thread.sleep(options[j][i]*3);
				System.out.print(options[j][i] + " ");
			}
			System.out.println();
		}
		// System.out.println(options);
	}
}
