
package com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2
 * package.
 * <p>
 * An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups. Factory methods for each of these are
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IdentifiedStockMaintainCheckRequestMessage_QNAME = new QName(
            "http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainCheckRequestMessage");
    private final static QName _IdentifiedStockMaintainCheckResponseMessage_QNAME = new QName(
            "http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainCheckResponseMessage");
    private final static QName _IdentifiedStockMaintainRequestMessage_QNAME = new QName(
            "http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainRequestMessage");
    private final static QName _IdentifiedStockMaintainResponseMessage_QNAME = new QName(
            "http://sap.com/xi/SAPGlobal20/Global", "IdentifiedStockMaintainResponseMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package:
     * com.smart.focus.ceoapi.wsdl2.ManageIdentifiedStocksInBNHQA2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManageIdentifiedStockRequestMessage }
     * 
     */
    public ManageIdentifiedStockRequestMessage createManageIdentifiedStockRequestMessage() {
        return new ManageIdentifiedStockRequestMessage();
    }

    /**
     * Create an instance of {@link ManageIdentifiedStockResponseMessage }
     * 
     */
    public ManageIdentifiedStockResponseMessage createManageIdentifiedStockResponseMessage() {
        return new ManageIdentifiedStockResponseMessage();
    }

    /**
     * Create an instance of {@link StandardFaultMessage }
     * 
     */
    public StandardFaultMessage createStandardFaultMessage() {
        return new StandardFaultMessage();
    }

    /**
     * Create an instance of {@link ExchangeFaultData }
     * 
     */
    public ExchangeFaultData createExchangeFaultData() {
        return new ExchangeFaultData();
    }

    /**
     * Create an instance of {@link StandardFaultMessageExtension }
     * 
     */
    public StandardFaultMessageExtension createStandardFaultMessageExtension() {
        return new StandardFaultMessageExtension();
    }

    /**
     * Create an instance of {@link ExchangeLogData }
     * 
     */
    public ExchangeLogData createExchangeLogData() {
        return new ExchangeLogData();
    }

    /**
     * Create an instance of {@link PartyKey }
     * 
     */
    public PartyKey createPartyKey() {
        return new PartyKey();
    }

    /**
     * Create an instance of {@link RequirementSpecificationKey }
     * 
     */
    public RequirementSpecificationKey createRequirementSpecificationKey() {
        return new RequirementSpecificationKey();
    }

    /**
     * Create an instance of
     * {@link IdentifiedStockQuantityConversionMaintainRequestBundle }
     * 
     */
    public IdentifiedStockQuantityConversionMaintainRequestBundle createIdentifiedStockQuantityConversionMaintainRequestBundle() {
        return new IdentifiedStockQuantityConversionMaintainRequestBundle();
    }

    /**
     * Create an instance of {@link IdentifiedStocksDescriptionRequestBundle }
     * 
     */
    public IdentifiedStocksDescriptionRequestBundle createIdentifiedStocksDescriptionRequestBundle() {
        return new IdentifiedStocksDescriptionRequestBundle();
    }

    /**
     * Create an instance of {@link ManageIdentifiedStocksRequest }
     * 
     */
    public ManageIdentifiedStocksRequest createManageIdentifiedStocksRequest() {
        return new ManageIdentifiedStocksRequest();
    }

    /**
     * Create an instance of {@link ManageIdentifiedStocksResponse }
     * 
     */
    public ManageIdentifiedStocksResponse createManageIdentifiedStocksResponse() {
        return new ManageIdentifiedStocksResponse();
    }

    /**
     * Create an instance of {@link BusinessDocumentBasicMessageHeader }
     * 
     */
    public BusinessDocumentBasicMessageHeader createBusinessDocumentBasicMessageHeader() {
        return new BusinessDocumentBasicMessageHeader();
    }

    /**
     * Create an instance of {@link BusinessDocumentMessageID }
     * 
     */
    public BusinessDocumentMessageID createBusinessDocumentMessageID() {
        return new BusinessDocumentMessageID();
    }

    /**
     * Create an instance of {@link BusinessObjectTypeCode }
     * 
     */
    public BusinessObjectTypeCode createBusinessObjectTypeCode() {
        return new BusinessObjectTypeCode();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link DocumentTypeCode }
     * 
     */
    public DocumentTypeCode createDocumentTypeCode() {
        return new DocumentTypeCode();
    }

    /**
     * Create an instance of {@link IdentifiedStockID }
     * 
     */
    public IdentifiedStockID createIdentifiedStockID() {
        return new IdentifiedStockID();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link LogItem }
     * 
     */
    public LogItem createLogItem() {
        return new LogItem();
    }

    /**
     * Create an instance of {@link LogItemCategoryCode }
     * 
     */
    public LogItemCategoryCode createLogItemCategoryCode() {
        return new LogItemCategoryCode();
    }

    /**
     * Create an instance of {@link LogItemNotePlaceholderSubstitutionList }
     * 
     */
    public LogItemNotePlaceholderSubstitutionList createLogItemNotePlaceholderSubstitutionList() {
        return new LogItemNotePlaceholderSubstitutionList();
    }

    /**
     * Create an instance of {@link NamespaceURI }
     * 
     */
    public NamespaceURI createNamespaceURI() {
        return new NamespaceURI();
    }

    /**
     * Create an instance of {@link PartyID }
     * 
     */
    public PartyID createPartyID() {
        return new PartyID();
    }

    /**
     * Create an instance of {@link ProductID }
     * 
     */
    public ProductID createProductID() {
        return new ProductID();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link RequirementSpecificationID }
     * 
     */
    public RequirementSpecificationID createRequirementSpecificationID() {
        return new RequirementSpecificationID();
    }

    /**
     * Create an instance of {@link SHORTDescription }
     * 
     */
    public SHORTDescription createSHORTDescription() {
        return new SHORTDescription();
    }

    /**
     * Create an instance of {@link Text }
     * 
     */
    public Text createText() {
        return new Text();
    }

    /**
     * Create an instance of {@link TextCollectionTextTypeCode }
     * 
     */
    public TextCollectionTextTypeCode createTextCollectionTextTypeCode() {
        return new TextCollectionTextTypeCode();
    }

    /**
     * Create an instance of {@link UUID }
     * 
     */
    public UUID createUUID() {
        return new UUID();
    }

    /**
     * Create an instance of {@link BinaryObject }
     * 
     */
    public BinaryObject createBinaryObject() {
        return new BinaryObject();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolder }
     * 
     */
    public MaintenanceAttachmentFolder createMaintenanceAttachmentFolder() {
        return new MaintenanceAttachmentFolder();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolderDocument }
     * 
     */
    public MaintenanceAttachmentFolderDocument createMaintenanceAttachmentFolderDocument() {
        return new MaintenanceAttachmentFolderDocument();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolderDocumentFileContent }
     * 
     */
    public MaintenanceAttachmentFolderDocumentFileContent createMaintenanceAttachmentFolderDocumentFileContent() {
        return new MaintenanceAttachmentFolderDocumentFileContent();
    }

    /**
     * Create an instance of {@link MaintenanceAttachmentFolderDocumentProperty }
     * 
     */
    public MaintenanceAttachmentFolderDocumentProperty createMaintenanceAttachmentFolderDocumentProperty() {
        return new MaintenanceAttachmentFolderDocumentProperty();
    }

    /**
     * Create an instance of
     * {@link MaintenanceAttachmentFolderDocumentPropertyPropertyValue }
     * 
     */
    public MaintenanceAttachmentFolderDocumentPropertyPropertyValue createMaintenanceAttachmentFolderDocumentPropertyPropertyValue() {
        return new MaintenanceAttachmentFolderDocumentPropertyPropertyValue();
    }

    /**
     * Create an instance of {@link MaintenanceTextCollection }
     * 
     */
    public MaintenanceTextCollection createMaintenanceTextCollection() {
        return new MaintenanceTextCollection();
    }

    /**
     * Create an instance of {@link MaintenanceTextCollectionText }
     * 
     */
    public MaintenanceTextCollectionText createMaintenanceTextCollectionText() {
        return new MaintenanceTextCollectionText();
    }

    /**
     * Create an instance of {@link MaintenanceTextCollectionTextTextContent }
     * 
     */
    public MaintenanceTextCollectionTextTextContent createMaintenanceTextCollectionTextTextContent() {
        return new MaintenanceTextCollectionTextTextContent();
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ManageIdentifiedStockRequestMessage }{@code >}
     * 
     * @param value
     *              Java instance representing xml element's value.
     * @return
     *         the new instance of {@link JAXBElement
     *         }{@code <}{@link ManageIdentifiedStockRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "IdentifiedStockMaintainCheckRequestMessage")
    public JAXBElement<ManageIdentifiedStockRequestMessage> createIdentifiedStockMaintainCheckRequestMessage(
            ManageIdentifiedStockRequestMessage value) {
        return new JAXBElement<ManageIdentifiedStockRequestMessage>(_IdentifiedStockMaintainCheckRequestMessage_QNAME,
                ManageIdentifiedStockRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ManageIdentifiedStockResponseMessage }{@code >}
     * 
     * @param value
     *              Java instance representing xml element's value.
     * @return
     *         the new instance of {@link JAXBElement
     *         }{@code <}{@link ManageIdentifiedStockResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "IdentifiedStockMaintainCheckResponseMessage")
    public JAXBElement<ManageIdentifiedStockResponseMessage> createIdentifiedStockMaintainCheckResponseMessage(
            ManageIdentifiedStockResponseMessage value) {
        return new JAXBElement<ManageIdentifiedStockResponseMessage>(_IdentifiedStockMaintainCheckResponseMessage_QNAME,
                ManageIdentifiedStockResponseMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ManageIdentifiedStockRequestMessage }{@code >}
     * 
     * @param value
     *              Java instance representing xml element's value.
     * @return
     *         the new instance of {@link JAXBElement
     *         }{@code <}{@link ManageIdentifiedStockRequestMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "IdentifiedStockMaintainRequestMessage")
    public JAXBElement<ManageIdentifiedStockRequestMessage> createIdentifiedStockMaintainRequestMessage(
            ManageIdentifiedStockRequestMessage value) {
        return new JAXBElement<ManageIdentifiedStockRequestMessage>(_IdentifiedStockMaintainRequestMessage_QNAME,
                ManageIdentifiedStockRequestMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link ManageIdentifiedStockResponseMessage }{@code >}
     * 
     * @param value
     *              Java instance representing xml element's value.
     * @return
     *         the new instance of {@link JAXBElement
     *         }{@code <}{@link ManageIdentifiedStockResponseMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://sap.com/xi/SAPGlobal20/Global", name = "IdentifiedStockMaintainResponseMessage")
    public JAXBElement<ManageIdentifiedStockResponseMessage> createIdentifiedStockMaintainResponseMessage(
            ManageIdentifiedStockResponseMessage value) {
        return new JAXBElement<ManageIdentifiedStockResponseMessage>(_IdentifiedStockMaintainResponseMessage_QNAME,
                ManageIdentifiedStockResponseMessage.class, null, value);
    }

}
