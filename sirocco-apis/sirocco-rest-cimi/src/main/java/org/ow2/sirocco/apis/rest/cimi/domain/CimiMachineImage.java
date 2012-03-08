/**
 *
 * SIROCCO
 * Copyright (C) 2011 France Telecom
 * Contact: sirocco@ow2.org
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 *
 * $Id: CimiMachineImage.java 126 2012-03-07 17:25:59Z antonma $
 *
 */
package org.ow2.sirocco.apis.rest.cimi.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * Class MachineImage. <p> </p>
 */
@XmlRootElement(name = "machineImage")
@JsonSerialize(include = Inclusion.NON_NULL)
public class CimiMachineImage extends CimiCommon implements Serializable {

    /** Serial number */
    private static final long serialVersionUID = 1L;

    /**
     * Field "href". <p> </p>
     */
    private String href;

    /**
     * Field "state". <p> </p>
     */
    private String state;

    /**
     * Field "imageLocation". <p> </p>
     */
    private ImageLocation imageLocation;

    /**
     * Field "type". <p> </p>
     */
    private String type;

    /**
     * Default constructor.
     */
    public CimiMachineImage() {
        super();
    }

    /**
     * Return the value of field "state".
     * @return The value
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the value of field "state".
     * @param state The value
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Return the value of field "imageLocation".
     * @return The value
     */
    public ImageLocation getImageLocation() {
        return this.imageLocation;
    }

    /**
     * Set the value of field "imageLocation".
     * @param imageLocation The value
     */
    public void setImageLocation(ImageLocation imageLocation) {
        this.imageLocation = imageLocation;
    }

    /**
     * @return the href
     */
    @XmlAttribute
    public String getHref() {
        return href;
    }

    /**
     * @param href the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}