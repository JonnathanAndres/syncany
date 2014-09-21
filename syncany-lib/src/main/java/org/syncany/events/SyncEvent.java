/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2014 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.events;

public class SyncEvent {
	public enum Type { DOWNLOAD_START, DOWNLOAD_FILE, DOWNLOAD_END, INDEXING, UPLOAD_FILE, OPERATION_DONE_DOWN };
	
	private Type type;
	private Object[] subjects;
	
	public SyncEvent(Type type, Object... subjects) {
		this.type = type;
		this.subjects = subjects;
	}

	public Type getType() {
		return type;
	}

	public Object[] getSubjects() {
		return subjects;
	}
}
