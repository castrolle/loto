package loto.process;

import java.util.ArrayList;
import java.util.List;

import loto.model.RevengeResultVO;

public class Loto {
	public static void main(String[] args) {

		List<RevengeResultVO> result = new ArrayList<RevengeResultVO>();
		RevengeResultVO r = new RevengeResultVO(1, 2, 5, 34, 43, 23, 16, 45,
				22, "03/12/2013");
		result.add(r);

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
		System.out.println(Counter.RESUTLS);
	}
}
