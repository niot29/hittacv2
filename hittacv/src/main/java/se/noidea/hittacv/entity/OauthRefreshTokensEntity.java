package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "oauth_refresh_tokens", schema = "screenwork_se_synos", catalog = "")
public class OauthRefreshTokensEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "access_token_id")
    private String accessTokenId;
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

    public String getAccessTokenId() {
        return accessTokenId;
    }

    public void setAccessTokenId(String accessTokenId) {
        this.accessTokenId = accessTokenId;
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

        OauthRefreshTokensEntity that = (OauthRefreshTokensEntity) o;

        if (revoked != that.revoked) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (accessTokenId != null ? !accessTokenId.equals(that.accessTokenId) : that.accessTokenId != null)
            return false;
        if (expiresAt != null ? !expiresAt.equals(that.expiresAt) : that.expiresAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (accessTokenId != null ? accessTokenId.hashCode() : 0);
        result = 31 * result + (int) revoked;
        result = 31 * result + (expiresAt != null ? expiresAt.hashCode() : 0);
        return result;
    }
}
