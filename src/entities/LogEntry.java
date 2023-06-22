/**
 * 
 */
package entities;

import java.time.Instant;
import java.util.Objects;

/**
 * Classe que contem as informacoes dos logs de acesso
 * 
 * @author Matos - 21.06.2023
 *
 */
public class LogEntry {

	private String username;
	private Instant dateTime;
	
	public LogEntry() {
	}

	public LogEntry(String username, Instant dateTime) {
		this.username = username;
		this.dateTime = dateTime;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public Instant getDateTime() {
		return dateTime;
	}

	public void setDateTime(Instant dateTime) {
		this.dateTime = dateTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(username, other.username);
	}
	
}
