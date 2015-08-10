
package com.github.kalu44i.slownews.jaxbModels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for channelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="copyright" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="docs" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="managingEditor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="webMaster" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ttl" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="image" type="{}imageType"/>
 *         &lt;element name="lastBuildDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item" type="{}itemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channelType", propOrder = {
    "title",
    "link",
    "description",
    "language",
    "copyright",
    "docs",
    "generator",
    "managingEditor",
    "webMaster",
    "ttl",
    "image",
    "lastBuildDate",
    "item"
})
public class ChannelType {

    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String link;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String language;
    @XmlElement(required = true)
    protected String copyright;
    @XmlElement(required = true)
    protected String docs;
    @XmlElement(required = true)
    protected String generator;
    @XmlElement(required = true)
    protected String managingEditor;
    @XmlElement(required = true)
    protected String webMaster;
    protected byte ttl;
    @XmlElement(required = true)
    protected ImageType image;
    @XmlElement(required = true)
    protected String lastBuildDate;
    protected List<ItemType> item;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the docs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocs() {
        return docs;
    }

    /**
     * Sets the value of the docs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocs(String value) {
        this.docs = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Gets the value of the managingEditor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagingEditor() {
        return managingEditor;
    }

    /**
     * Sets the value of the managingEditor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagingEditor(String value) {
        this.managingEditor = value;
    }

    /**
     * Gets the value of the webMaster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebMaster() {
        return webMaster;
    }

    /**
     * Sets the value of the webMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebMaster(String value) {
        this.webMaster = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     */
    public byte getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     */
    public void setTtl(byte value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImage(ImageType value) {
        this.image = value;
    }

    /**
     * Gets the value of the lastBuildDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastBuildDate() {
        return lastBuildDate;
    }

    /**
     * Sets the value of the lastBuildDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastBuildDate(String value) {
        this.lastBuildDate = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemType }
     * 
     * 
     */
    public List<ItemType> getItem() {
        if (item == null) {
            item = new ArrayList<ItemType>();
        }
        return this.item;
    }

}
