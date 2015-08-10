
package com.github.kalu44i.slownews.jaxbModels;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxbModels package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Rss_QNAME = new QName("", "rss");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxbModels
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RssType }
     * 
     */
    public RssType createRssType() {
        return new RssType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link ChannelType }
     * 
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link ImageType }
     * 
     */
    public ImageType createImageType() {
        return new ImageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RssType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rss")
    public JAXBElement<RssType> createRss(RssType value) {
        return new JAXBElement<RssType>(_Rss_QNAME, RssType.class, null, value);
    }

}
