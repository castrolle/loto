package loto.load;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import loto.model.ResultVO;
import loto.model.RevengeResultVO;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.CsvToBean;
import au.com.bytecode.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

public class CSVLoader {

	public static List<RevengeResultVO> loadRevengeResult()
			throws FileNotFoundException {

		FileReader fr = new FileReader("results/revancha_2013.csv");
		CSVReader reader = new CSVReader(fr, ';');

		// Define strategy
		// Header name to bean property name mapping
		Map<String, String> columnMapping = new HashMap<String, String>();
		columnMapping.put("id", "id");
		columnMapping.put("r1", "r1");
		columnMapping.put("r2", "r2");
		columnMapping.put("r3", "r3");
		columnMapping.put("r4", "r4");
		columnMapping.put("r5", "r5");
		columnMapping.put("r6", "r6");
		columnMapping.put("r7", "r7");
		columnMapping.put("r8", "r8");
		columnMapping.put("r9", "r9");
		columnMapping.put("r10", "r10");
		columnMapping.put("r11", "r11");
		columnMapping.put("r12", "r12");
		columnMapping.put("date", "date");

		HeaderColumnNameTranslateMappingStrategy<RevengeResultVO> strategy = new HeaderColumnNameTranslateMappingStrategy<RevengeResultVO>();
		strategy.setType(RevengeResultVO.class);
		strategy.setColumnMapping(columnMapping);

		CsvToBean csv = new CsvToBean();
		List<RevengeResultVO> list = csv.parse(strategy, reader);

		return list;

	}

	public static List<ResultVO> loadResult() throws FileNotFoundException {

		FileReader fr = new FileReader("results/result_2013.csv");
		CSVReader reader = new CSVReader(fr, ';');

		// Define strategy
		// Header name to bean property name mapping
		Map<String, String> columnMapping = new HashMap<String, String>();
		columnMapping.put("id", "id");
		columnMapping.put("r1", "r1");
		columnMapping.put("r2", "r2");
		columnMapping.put("r3", "r3");
		columnMapping.put("r4", "r4");
		columnMapping.put("r5", "r5");
		columnMapping.put("r6", "r6");
		
		columnMapping.put("date", "date");

		HeaderColumnNameTranslateMappingStrategy<ResultVO> strategy = new HeaderColumnNameTranslateMappingStrategy<ResultVO>();
		strategy.setType(ResultVO.class);
		strategy.setColumnMapping(columnMapping);

		CsvToBean csv = new CsvToBean();
		List<ResultVO> list = csv.parse(strategy, reader);

		return list;

	}

}
