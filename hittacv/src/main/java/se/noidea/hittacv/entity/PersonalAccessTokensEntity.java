package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "personal_access_tokens", schema = "screenwork_se_synos", catalog = "")
public class PersonalAccessTokensEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "tokenable_type")
    private String tokenableType;
    @Basic
    @Column(name = "tokenable_id")
    private long tokenableId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "token")
    private String token;
    @Basic
    @Column(name = "abilities")
    private String abilities;
    @Basic
    @Column(name = "last_used_at")
    private Timestamp lastUsedAt;
    @Basic
    @Column(name = "expires_at")
    private Timestamp expiresAt;
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

    public String getTokenableType() {
        return tokenableType;
    }

    public void setTokenableType(String tokenableType) {
        this.tokenableType = tokenableType;
    }

    public long getTokenableId() {
        return tokenableId;
    }

    public void setTokenableId(long tokenableId) {
        this.tokenableId = tokenableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public Timestamp getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(Timestamp lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public Timestamp getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Timestamp expiresAt) {
        this.expiresAt = expiresAt;
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

        PersonalAccessTokensEntity that = (PersonalAccessTokensEntity) o;

        if (id != that.id) return false;
        if (tokenableId != that.tokenableId) return false;
        if (tokenableType != null ? !tokenableType.equals(that.tokenableType) : that.tokenableType != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (abilities != null ? !abilities.equals(that.abilities) : that.abilities != null) return false;
        if (lastUsedAt != null ? !lastUsedAt.equals(that.lastUsedAt) : that.lastUsedAt != null) return false;
        if (expiresAt != null ? !expiresAt.equals(that.expiresAt) : that.expiresAt != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tokenableType != null ? tokenableType.hashCode() : 0);
        result = 31 * result + (int) (tokenableId ^ (tokenableId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (abilities != null ? abilities.hashCode() : 0);
        result = 31 * result + (lastUsedAt != null ? lastUsedAt.hashCode() : 0);
        result = 31 * result + (expiresAt != null ? expiresAt.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
