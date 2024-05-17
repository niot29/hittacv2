package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "oauth_auth_codes", schema = "screenwork_se_synos", catalog = "")
public class OauthAuthCodesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "user_id")
    private long userId;
    @Basic
    @Column(name = "client_id")
    private long clientId;
    @Basic
    @Column(name = "scopes")
    private String scopes;
    @Basic
    @Column(name = "revoked")
    private byte revoked;
    @Basic
    @Column(name = "expires_at")
    private Timestamp expiresAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getScopes() {
        return scopes;
    }

    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public byte getRevoked() {
        return revoked;
    }

    public void setRevoked(byte revoked) {
        this.revoked = revoked;
    }

    public Timestamp getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Timestamp expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OauthAuthCodesEntity that = (OauthAuthCodesEntity) o;

        if (userId != that.userId) return false;
        if (clientId != that.clientId) return false;
        if (revoked != that.revoked) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (scopes != null ? !scopes.equals(that.scopes) : that.scopes != null) return false;
        if (expiresAt != null ? !expiresAt.equals(that.expiresAt) : that.expiresAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (int) (clientId ^ (clientId >>> 32));
        result = 31 * result + (scopes != null ? scopes.hashCode() : 0);
        result = 31 * result + (int) revoked;
        result = 31 * result + (expiresAt != null ? expiresAt.hashCode() : 0);
        return result;
    }
}
