package com.gvacharya.collections.entities;

import java.util.Objects;

public class Mails implements Comparable<Mails> {
	private String mailId;
	private String priority;

	public Mails() {
	}

	public Mails(String mailId, String priority) {
		this.mailId = mailId;
		this.priority = priority;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Mails o) {
		return this.priority.toLowerCase().compareTo(o.priority.toLowerCase());
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;

		Mails temp = (Mails) obj;

		return this.getMailId().equalsIgnoreCase(temp.mailId) && this.priority.equalsIgnoreCase(temp.priority);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mailId, priority);
	}

	@Override
	public String toString() {
		return "Mails [mailId=" + mailId + ", priority=" + priority + "]";
	}
}
