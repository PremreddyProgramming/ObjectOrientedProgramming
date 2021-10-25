package riskmanagment.main;

import java.util.Scanner;

import riskmanagement.abstractfactory.ChoiceAbstractFactory;
import riskmanagement.abstractfactory.ChoiceAbstractFactoryProvider;
import riskmanagement.iterator.RiskIterator;
import riskmanagement.iterator.RiskMatrix;
import riskmanagement.model.RiskMatrixEntry;
import riskmanagement.organization.Organization;
import riskmanagement.risktype.AbstractRisk;

public class RiskManagementTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do {
			System.out.println(
					"This is Just a display system which shows different risks based on Organization and Risk Markets");
			System.out.println("Press 1.Organization 2. Risk Type 3. Want to View Risk Rating Matrix ? 4. Quit");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Press 1. AbcCorporation 2. PqrCorporation 3. XyzCorporation");
			} else if (choice == 2) {
				System.out.println("Press 1. CapitalRisk 2. CreditRisk 3. MarketRisk");

			} else if (choice == 3) {
				RiskMatrix riskmatrix = new RiskMatrix();
				for (RiskIterator<RiskMatrixEntry> iter = riskmatrix.getIterator(); iter.hasNext();) {
					RiskMatrixEntry riskMatrixEntry = (RiskMatrixEntry) iter.next();
					System.out.println(riskMatrixEntry);
				}

				continue;
			}
			int secondchoice = sc.nextInt();
			ChoiceAbstractFactory choiceFactroy = ChoiceAbstractFactoryProvider.getFactory(choice);
			Object obj = choiceFactroy.choose(secondchoice);

			if (choice == 1) {
				Organization org = (Organization) obj;
				System.out.println(org.getOrgHistory());
				System.out.println(org.getOrgRiskScore());
			} else if (choice == 2) {
				AbstractRisk abstractRisk = (AbstractRisk) obj;
				System.out.println(abstractRisk.calculateImpact());
			}

		} while (choice != 4);
	}

}
