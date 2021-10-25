package riskmanagement.iterator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import riskmanagement.model.RiskMatrixEntry;

public class RiskIteratorTest {
	
	private static List<String> expectedResultList = new ArrayList<>();
	
	static {
		expectedResultList.add("RiskMatrixEntry [likelihoodEnum=HIGHLY_PROBABLE, severityEnum=CATASTROPHIC, value=25, rating=VERYHIGH]");
		expectedResultList.add("RiskMatrixEntry [likelihoodEnum=PROBABLE, severityEnum=SIGNIFICANT, value=16, rating=VERYHIGH]");
		expectedResultList.add("RiskMatrixEntry [likelihoodEnum=OCCASIONAL, severityEnum=MODERATE, value=9, rating=MEDIUM]");
		expectedResultList.add("RiskMatrixEntry [likelihoodEnum=REMOTE, severityEnum=LOW, value=4, rating=LOW]");
		expectedResultList.add("RiskMatrixEntry [likelihoodEnum=IMPROBABLE, severityEnum=NEGLIGIBLE, value=1, rating=LOW]");
	}
	
	@Test
	public void testRiskIterator() {
		
		RiskMatrix riskmatrix = new RiskMatrix();
		int count =0;
		for (RiskIterator<RiskMatrixEntry> iter = riskmatrix.getIterator(); iter.hasNext();) {
			RiskMatrixEntry riskMatrixEntry = (RiskMatrixEntry) iter.next();
			assertEquals(riskMatrixEntry.toString(),expectedResultList.get(count));
			count++;
		}
	}

}
