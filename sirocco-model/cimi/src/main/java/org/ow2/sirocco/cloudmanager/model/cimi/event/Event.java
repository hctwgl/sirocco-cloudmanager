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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307
 * USA
 *
 *  $Id: $
 *
 */

package org.ow2.sirocco.cloudmanager.model.cimi.event;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.ow2.sirocco.cloudmanager.model.cimi.CloudEntity;

@Entity
public class Event extends CloudEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    protected Date timestamp;

    protected String type;

    protected EventType content;

    public static enum Outcome {
        PENDING, UNKNOWN, STATUS, SUCCESS, WARNING, FAILURE
    }

    protected Outcome outcome;

    public static enum Severity {
        CRITICAL, HIGH, MEDIUM, LOW
    }

    protected Severity severity;

    protected String contact;

    @Temporal(TemporalType.TIMESTAMP)
    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return this.type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public EventType getContent() {
        return this.content;
    }

    public void setContent(final EventType content) {
        this.content = content;
    }

    public Outcome getOutcome() {
        return this.outcome;
    }

    public void setOutcome(final Outcome outcome) {
        this.outcome = outcome;
    }

    public Severity getSeverity() {
        return this.severity;
    }

    public void setSeverity(final Severity severity) {
        this.severity = severity;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(final String contact) {
        this.contact = contact;
    }

}
