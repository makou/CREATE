/**
 *
 * $Id$
 */
package ServicePIM.validation;

import ServicePIM.RDBMSTable;
import ServicePIM.RDBMSVerb;

/**
 * A sample validator interface for {@link ServicePIM.RDBMSActivity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RDBMSActivityValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateRdbmsVerb(RDBMSVerb value);
	boolean validateAltersRDBMSTable(RDBMSTable value);
}
