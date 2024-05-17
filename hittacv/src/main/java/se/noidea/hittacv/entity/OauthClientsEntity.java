package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "oauth_clients", schema = "screenwork_se_synos", catalog = "")
public class OauthClientsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "secret")
    private String secret;
    @Basic
    @Column(name = "provider")
    private String provider;
    @Basic
    @Column(name = "redirect")
    private String redirect;
    @Basic
    @Column(name = "personal_access_client")
    private byte personalAccessClient;
    @Basic
    @Column(name = "password_client")
    private byte passwordClient;
    @Basic
    @Column(name = "revoked")
    private byte revoked;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public byte getPersonalAccessClient() {
        return personalAccessClient;
    }

    public void setPersonalAccessClient(byte personalAccessClient) {
        this.personalAccessClient = personalAccessClient;
    }

    public byte getPasswordClient() {
        return passwordClient;
    }

    public void setPasswordClient(byte passwordClient) {
        this.passwordClient = passwordClient;
    }

    public byte getRevoked() {
        return revoked;
    }

    public void setRevoked(byte revoked) {
        this.revoked = revoked;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OauthClientsEntity that = (OauthClientsEntity) o;

        if (id != that.id) return false;
        if (personalAccessClient != that.personalAccessClient) return false;
        if (passwordClient != that.passwordClient) return false;
        if (revoked != that.revoked) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (secret != null ? !secret.equals(that.secret) : that.secret != null) return false;
        if (provider != null ? !provider.equals(that.provider) : that.provider != null) return false;
        if (redirect != null ? !redirect.equals(that.redirect) : that.redirect != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secret != null ? secret.hashCode() : 0);
        result = 31 * result + (provider != null ? provider.hashCode() : 0);
        result = 31 * result + (redirect != null ? redirect.hashCode() : 0);
        result = 31 * result + (int) personalAccessClient;
        result = 31 * result + (int) passwordClient;
        result = 31 * result + (int) revoked;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
