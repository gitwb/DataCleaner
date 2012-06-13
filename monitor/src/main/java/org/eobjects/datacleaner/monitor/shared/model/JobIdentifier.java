/**
 * eobjects.org DataCleaner
 * Copyright (C) 2010 eobjects.org
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.eobjects.datacleaner.monitor.shared.model;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Identifies a job in the repository.
 */
public class JobIdentifier implements IsSerializable, Comparable<JobIdentifier> {

    private String _name;

    public JobIdentifier(String name) {
        _name = name;
    }
    
    public JobIdentifier() {
        this(null);
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    @Override
    public String toString() {
        return "JobIdentifier[name=" + _name + "]";
    }

    @Override
    public int compareTo(JobIdentifier o) {
        return getName().compareTo(o.getName());
    }

}
