/**
 *
 * $Id$
 */
package ServicePSM.validation;

import ServicePSM.HTTPVerb;

/**
 * A sample validator interface for {@link ServicePSM.HibernateActivity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HibernateActivityValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateHibernateActivityHTTPVerb(HTTPVerb value);
}
