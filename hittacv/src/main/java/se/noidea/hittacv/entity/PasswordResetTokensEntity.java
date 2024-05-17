package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "password_reset_tokens", schema = "screenwork_se_synos", catalog = "")
public class PasswordResetTokensEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "token")
    private String token;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PasswordResetTokensEntity that = (PasswordResetTokensEntity) o;

        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        return result;
    }
}
