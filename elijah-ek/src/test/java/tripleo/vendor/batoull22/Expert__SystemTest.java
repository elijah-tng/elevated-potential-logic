package tripleo.vendor.batoull22;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tripleo.elijah_fluffy.util.Mode;
import tripleo.elijah_fluffy.util.Operation;
import tripleo.elijah_fluffy.util.SimplePrintLoggerToRemoveSoon;

public class Expert__SystemTest {

	@Test
	//@Ignore
	public void testOpenfile() {
		final EK_ExpertSystem i = new EK_ExpertSystem();

		final Operation<EK_Reader> ovo2 = i.openfile_2();
		Assertions.assertNotSame(ovo2.mode(), Mode.FAILURE);

		final EK_Reader reader = ovo2.success();

		reader.readfile();
		// reader.print();
		reader.closefile();

		// SimplePrintLoggerToRemoveSoon.println_out/*_4*/("------------------------");
		boolean f = i.Forwardchaining();
		// SimplePrintLoggerToRemoveSoon.println_out/*_4*/(" ");
		SimplePrintLoggerToRemoveSoon.println_out/*_4*/("Result of Forwardchaining: " + f);

		// SimplePrintLoggerToRemoveSoon.println_out/*_4*/(" ");
		// i.print();

		// SimplePrintLoggerToRemoveSoon.println_out/*_4*/("------------------------");
		boolean b = i.Backwardchaining();
		SimplePrintLoggerToRemoveSoon.println_out/*_4*/("Result of Backwardchaining: " + b);
		SimplePrintLoggerToRemoveSoon.println_out/*_4*/(" ");
	}
}
