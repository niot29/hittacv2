package se.noidea.hittacv.entity;

import jakarta.persistence.*;

@Entity
@jakarta.persistence.Table(name = "migrations", schema = "screenwork_se_synos", catalog = "")
public class MigrationsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "migration")
    private String migration;

    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    @Basic
    @Column(name = "batch")
    private int batch;

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MigrationsEntity that = (MigrationsEntity) o;

        if (id != that.id) return false;
        if (batch != that.batch) return false;
        if (migration != null ? !migration.equals(that.migration) : that.migration != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (migration != null ? migration.hashCode() : 0);
        result = 31 * result + batch;
        return result;
    }
}
