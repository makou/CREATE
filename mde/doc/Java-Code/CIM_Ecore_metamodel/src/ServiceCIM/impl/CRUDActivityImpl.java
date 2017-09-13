/**
 */
package ServiceCIM.impl;

import ServiceCIM.CRUDActivity;
import ServiceCIM.CRUDVerb;
import ServiceCIM.ServiceCIMPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServiceCIM.impl.CRUDActivityImpl#getCRUDVerb <em>CRUD Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CRUDActivityImpl extends MinimalEObjectImpl.Container implements CRUDActivity {
	/**
	 * The default value of the '{@link #getCRUDVerb() <em>CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRUDVerb()
	 * @generated
	 * @ordered
	 */
	protected static final CRUDVerb CRUD_VERB_EDEFAULT = CRUDVerb.CREATE;

	/**
	 * The cached value of the '{@link #getCRUDVerb() <em>CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRUDVerb()
	 * @generated
	 * @ordered
	 */
	protected CRUDVerb crudVerb = CRUD_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRUDActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceCIMPackage.Literals.CRUD_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDVerb getCRUDVerb() {
		return crudVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCRUDVerb(CRUDVerb newCRUDVerb) {
		CRUDVerb oldCRUDVerb = crudVerb;
		crudVerb = newCRUDVerb == null ? CRUD_VERB_EDEFAULT : newCRUDVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.CRUD_ACTIVITY__CRUD_VERB, oldCRUDVerb, crudVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceCIMPackage.CRUD_ACTIVITY__CRUD_VERB:
				return getCRUDVerb();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServiceCIMPackage.CRUD_ACTIVITY__CRUD_VERB:
				setCRUDVerb((CRUDVerb)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServiceCIMPackage.CRUD_ACTIVITY__CRUD_VERB:
				setCRUDVerb(CRUD_VERB_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServiceCIMPackage.CRUD_ACTIVITY__CRUD_VERB:
				return crudVerb != CRUD_VERB_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (CRUDVerb: ");
		result.append(crudVerb);
		result.append(')');
		return result.toString();
	}

} //CRUDActivityImpl
