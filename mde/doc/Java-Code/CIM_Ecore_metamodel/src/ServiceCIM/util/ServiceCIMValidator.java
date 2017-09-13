/**
 */
package ServiceCIM.util;

import ServiceCIM.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see ServiceCIM.ServiceCIMPackage
 * @generated
 */
public class ServiceCIMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ServiceCIMValidator INSTANCE = new ServiceCIMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "ServiceCIM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCIMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ServiceCIMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ServiceCIMPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case ServiceCIMPackage.CRUD_ACTIVITY:
				return validateCRUDActivity((CRUDActivity)value, diagnostics, context);
			case ServiceCIMPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case ServiceCIMPackage.INPUT_REPRESENTATION:
				return validateInputRepresentation((InputRepresentation)value, diagnostics, context);
			case ServiceCIMPackage.OUTPUT_REPRESENTATION:
				return validateOutputRepresentation((OutputRepresentation)value, diagnostics, context);
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM:
				return validateRESTfulServiceCIM((RESTfulServiceCIM)value, diagnostics, context);
			case ServiceCIMPackage.MEDIA_TYPE:
				return validateMediaType((MediaType)value, diagnostics, context);
			case ServiceCIMPackage.CRUD_VERB:
				return validateCRUDVerb((CRUDVerb)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_UniqueCRUDVerbs(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_UniqueInputMediaTypes(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_UniqueOutputMediaTypes(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_UniqueNamingProperty(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_AlgoResHaveNoProperties(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_CRUDResHaveAtLeastOneProperty(resource, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueCRUDVerbs constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE__UNIQUE_CRUD_VERBS__EEXPRESSION = "self.hasCRUDActivity->isUnique(CRUDVerb)";

	/**
	 * Validates the UniqueCRUDVerbs constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_UniqueCRUDVerbs(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceCIMPackage.Literals.RESOURCE,
				 resource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueCRUDVerbs",
				 RESOURCE__UNIQUE_CRUD_VERBS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueInputMediaTypes constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE__UNIQUE_INPUT_MEDIA_TYPES__EEXPRESSION = "self.hasInputRepresentation->isUnique(MediaType)";

	/**
	 * Validates the UniqueInputMediaTypes constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_UniqueInputMediaTypes(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceCIMPackage.Literals.RESOURCE,
				 resource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueInputMediaTypes",
				 RESOURCE__UNIQUE_INPUT_MEDIA_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueOutputMediaTypes constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE__UNIQUE_OUTPUT_MEDIA_TYPES__EEXPRESSION = "self.hasOutputRepresentation->isUnique(MediaType)";

	/**
	 * Validates the UniqueOutputMediaTypes constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_UniqueOutputMediaTypes(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceCIMPackage.Literals.RESOURCE,
				 resource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueOutputMediaTypes",
				 RESOURCE__UNIQUE_OUTPUT_MEDIA_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the UniqueNamingProperty constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE__UNIQUE_NAMING_PROPERTY__EEXPRESSION = "self.hasProperty->notEmpty() implies self.hasProperty->one(isNamingProperty = true)";

	/**
	 * Validates the UniqueNamingProperty constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_UniqueNamingProperty(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceCIMPackage.Literals.RESOURCE,
				 resource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueNamingProperty",
				 RESOURCE__UNIQUE_NAMING_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AlgoResHaveNoProperties constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE__ALGO_RES_HAVE_NO_PROPERTIES__EEXPRESSION = "(self.isAlgorithmic = true) implies self.hasProperty->isEmpty()";

	/**
	 * Validates the AlgoResHaveNoProperties constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_AlgoResHaveNoProperties(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceCIMPackage.Literals.RESOURCE,
				 resource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AlgoResHaveNoProperties",
				 RESOURCE__ALGO_RES_HAVE_NO_PROPERTIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the CRUDResHaveAtLeastOneProperty constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESOURCE__CRUD_RES_HAVE_AT_LEAST_ONE_PROPERTY__EEXPRESSION = "(self.isAlgorithmic = false) implies self.hasProperty->notEmpty()";

	/**
	 * Validates the CRUDResHaveAtLeastOneProperty constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_CRUDResHaveAtLeastOneProperty(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceCIMPackage.Literals.RESOURCE,
				 resource,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "CRUDResHaveAtLeastOneProperty",
				 RESOURCE__CRUD_RES_HAVE_AT_LEAST_ONE_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUDActivity(CRUDActivity crudActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(crudActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputRepresentation(InputRepresentation inputRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputRepresentation(OutputRepresentation outputRepresentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputRepresentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServiceCIM(RESTfulServiceCIM resTfulServiceCIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resTfulServiceCIM, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resTfulServiceCIM, diagnostics, context);
		if (result || diagnostics != null) result &= validateRESTfulServiceCIM_UniqueResourceNames(resTfulServiceCIM, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the UniqueResourceNames constraint of '<em>RES Tful Service CIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RES_TFUL_SERVICE_CIM__UNIQUE_RESOURCE_NAMES__EEXPRESSION = "self.hasResources->isUnique(name)";

	/**
	 * Validates the UniqueResourceNames constraint of '<em>RES Tful Service CIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRESTfulServiceCIM_UniqueResourceNames(RESTfulServiceCIM resTfulServiceCIM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ServiceCIMPackage.Literals.RES_TFUL_SERVICE_CIM,
				 resTfulServiceCIM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "UniqueResourceNames",
				 RES_TFUL_SERVICE_CIM__UNIQUE_RESOURCE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaType(MediaType mediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCRUDVerb(CRUDVerb crudVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ServiceCIMValidator
