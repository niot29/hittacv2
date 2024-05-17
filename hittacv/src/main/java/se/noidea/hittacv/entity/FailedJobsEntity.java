package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "failed_jobs", schema = "screenwork_se_synos", catalog = "")
public class FailedJobsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "uuid")
    private String uuid;
    @Basic
    @Column(name = "connection")
    private String connection;
    @Basic
    @Column(name = "queue")
    private String queue;
    @Basic
    @Column(name = "payload")
    private String payload;
    @Basic
    @Column(name = "exception")
    private String exception;
    @Basic
    @Column(name = "failed_at")
    private Timestamp failedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Timestamp getFailedAt() {
        return failedAt;
    }

    public void setFailedAt(Timestamp failedAt) {
        this.failedAt = failedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FailedJobsEntity that = (FailedJobsEntity) o;

        if (id != that.id) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;
        if (connection != null ? !connection.equals(that.connection) : that.connection != null) return false;
        if (queue != null ? !queue.equals(that.queue) : that.queue != null) return false;
        if (payload != null ? !payload.equals(that.payload) : that.payload != null) return false;
        if (exception != null ? !exception.equals(that.exception) : that.exception != null) return false;
        if (failedAt != null ? !failedAt.equals(that.failedAt) : that.failedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (connection != null ? connection.hashCode() : 0);
        result = 31 * result + (queue != null ? queue.hashCode() : 0);
        result = 31 * result + (payload != null ? payload.hashCode() : 0);
        result = 31 * result + (exception != null ? exception.hashCode() : 0);
        result = 31 * result + (failedAt != null ? failedAt.hashCode() : 0);
        return result;
    }
}
