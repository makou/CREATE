/**
 *
 * $Id$
 */
package ExternalServiceLayerCIM.validation;

import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.OutputDataModel;
import ExternalServiceLayerCIM.QueryParam;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ExternalServiceLayerCIM.TargetRESTService}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TargetRESTServiceValidator {
	boolean validate();

	boolean validateHasQueryParam(EList<QueryParam> value);
	boolean validateHasInputDataModel(InputDataModel value);
	boolean validateHasOutputDataModel(OutputDataModel value);
	boolean validateTargetURL(String value);
	boolean validateCRUDVerb(String value);
}
