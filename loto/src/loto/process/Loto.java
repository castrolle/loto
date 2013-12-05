package loto.process;

import java.io.FileNotFoundException;
import java.util.List;

import loto.enums.RandomNumbers;
import loto.load.CSVLoader;
import loto.model.RevengeResultVO;

public class Loto {
	public static void main(String[] args) throws FileNotFoundException {

		List<RevengeResultVO> result = CSVLoader.load();
		Counter.loadData(result);
		System.out.println(Counter.getRandomNumber(RandomNumbers.MONTECARLO));
	}
}
