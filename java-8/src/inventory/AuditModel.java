package inventory;

import java.util.Date;

public abstract class AuditModel {

	private Date createdAt;
	private Date updatedAt;

	public AuditModel() {
		super();
	}

	public AuditModel(Date createdAt, Date updatedAt) {
		super();
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "AuditModel [createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
