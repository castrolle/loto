package loto.process;

import java.util.List;
import java.util.Random;

import loto.enums.RandomNumbers;
import loto.model.RevengeResultVO;

public class Counter {
	public static int[] RESUTLS = new int[46];
	public static int[] MAX = new int[7];
	public static int[] MIN = new int[7];
	public static long TOTAL;
	public static double[] relativeFrequency = new double[46];
	public static double[] cumulativeFrequency = new double[46];

	public static void loadData(List<RevengeResultVO> result) {
		for (RevengeResultVO revengeResultVO : result) {
			Counter.RESUTLS[revengeResultVO.getR1()]++;
			Counter.RESUTLS[revengeResultVO.getR2()]++;
			Counter.RESUTLS[revengeResultVO.getR3()]++;
			Counter.RESUTLS[revengeResultVO.getR4()]++;
			Counter.RESUTLS[revengeResultVO.getR5()]++;
			Counter.RESUTLS[revengeResultVO.getR6()]++;
			Counter.RESUTLS[revengeResultVO.getR7()]++;
			Counter.RESUTLS[revengeResultVO.getR8()]++;
		}

		Counter.TOTAL = 0;
		for (int i = 0; i < Counter.RESUTLS.length; i++) {
			Counter.TOTAL += Counter.RESUTLS[i];
		}

		double cumulative = 0;
		double var = 0;
		for (int i = 0; i < Counter.RESUTLS.length; i++) {
			var = (double) Counter.RESUTLS[i] / Counter.TOTAL;
			cumulative += var;
			Counter.relativeFrequency[i] = var;
			Counter.cumulativeFrequency[i] = cumulative;
		}
	}

	public static int getRandomNumber(RandomNumbers type) {
		int number = 0;
		Random random = new Random();
		double var = 0;
		if (type == RandomNumbers.MONTECARLO) {
			double rand = random.nextDouble();
			for (int i = 0; i < cumulativeFrequency.length; i++) {
				if(rand > var && rand < cumulativeFrequency[i]){
					return i;
				}
				var = cumulativeFrequency[i];
			}
		}
		return number;
	}

}
