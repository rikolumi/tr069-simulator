
package org.dslforum.cwmp_1_0;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://schemas.xmlsoap.org/soap/encoding/" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="double">
 *   &lt;xs:simpleContent>
 *     &lt;xs:extension base="xs:double">
 *       &lt;xs:attributeGroup ref="ns:commonAttributes"/>
 *     &lt;/xs:extension>
 *   &lt;/xs:simpleContent>
 * &lt;/xs:complexType>
 * </pre>
 */
public class _Double
{
    private Double _double;
    private CommonAttributes commonAttributes;

    /** 
     * Get the extension value.
     * 
     * @return value
     */
    public Double getDouble() {
        return _double;
    }

    /** 
     * Set the extension value.
     * 
     * @param _double
     */
    public void setDouble(Double _double) {
        this._double = _double;
    }

    /** 
     * Get the 'commonAttributes' attributeGroup value.
     * 
     * @return value
     */
    public CommonAttributes getCommonAttributes() {
        return commonAttributes;
    }

    /** 
     * Set the 'commonAttributes' attributeGroup value.
     * 
     * @param commonAttributes
     */
    public void setCommonAttributes(CommonAttributes commonAttributes) {
        this.commonAttributes = commonAttributes;
    }
}