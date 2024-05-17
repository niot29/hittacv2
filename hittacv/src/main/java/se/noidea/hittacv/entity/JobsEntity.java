package se.noidea.hittacv.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "jobs", schema = "screenwork_se_synos", catalog = "")
public class JobsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "user_id")
    private String userId;
    @Basic
    @Column(name = "partner_id")
    private String partnerId;
    @Basic
    @Column(name = "annons_id")
    private String annonsId;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "headline")
    private String headline;
    @Basic
    @Column(name = "slug")
    private String slug;
    @Basic
    @Column(name = "occupation")
    private String occupation;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "external_type")
    private byte externalType;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "location")
    private String location;
    @Basic
    @Column(name = "publication_date")
    private String publicationDate;
    @Basic
    @Column(name = "application_deadline")
    private String applicationDeadline;
    @Basic
    @Column(name = "jobs_contacts_id")
    private Integer jobsContactsId;
    @Basic
    @Column(name = "number_of_vacancies")
    private Integer numberOfVacancies;
    @Basic
    @Column(name = "specifications")
    private String specifications;
    @Basic
    @Column(name = "benefits")
    private String benefits;
    @Basic
    @Column(name = "status")
    private byte status;
    @Basic
    @Column(name = "reported")
    private byte reported;
    @Basic
    @Column(name = "reported_message")
    private String reportedMessage;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getAnnonsId() {
        return annonsId;
    }

    public void setAnnonsId(String annonsId) {
        this.annonsId = annonsId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getExternalType() {
        return externalType;
    }

    public void setExternalType(byte externalType) {
        this.externalType = externalType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getApplicationDeadline() {
        return applicationDeadline;
    }

    public void setApplicationDeadline(String applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }

    public Integer getJobsContactsId() {
        return jobsContactsId;
    }

    public void setJobsContactsId(Integer jobsContactsId) {
        this.jobsContactsId = jobsContactsId;
    }

    public Integer getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public void setNumberOfVacancies(Integer numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public byte getReported() {
        return reported;
    }

    public void setReported(byte reported) {
        this.reported = reported;
    }

    public String getReportedMessage() {
        return reportedMessage;
    }

    public void setReportedMessage(String reportedMessage) {
        this.reportedMessage = reportedMessage;
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

        JobsEntity that = (JobsEntity) o;

        if (id != that.id) return false;
        if (externalType != that.externalType) return false;
        if (status != that.status) return false;
        if (reported != that.reported) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (partnerId != null ? !partnerId.equals(that.partnerId) : that.partnerId != null) return false;
        if (annonsId != null ? !annonsId.equals(that.annonsId) : that.annonsId != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (headline != null ? !headline.equals(that.headline) : that.headline != null) return false;
        if (slug != null ? !slug.equals(that.slug) : that.slug != null) return false;
        if (occupation != null ? !occupation.equals(that.occupation) : that.occupation != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (publicationDate != null ? !publicationDate.equals(that.publicationDate) : that.publicationDate != null)
            return false;
        if (applicationDeadline != null ? !applicationDeadline.equals(that.applicationDeadline) : that.applicationDeadline != null)
            return false;
        if (jobsContactsId != null ? !jobsContactsId.equals(that.jobsContactsId) : that.jobsContactsId != null)
            return false;
        if (numberOfVacancies != null ? !numberOfVacancies.equals(that.numberOfVacancies) : that.numberOfVacancies != null)
            return false;
        if (specifications != null ? !specifications.equals(that.specifications) : that.specifications != null)
            return false;
        if (benefits != null ? !benefits.equals(that.benefits) : that.benefits != null) return false;
        if (reportedMessage != null ? !reportedMessage.equals(that.reportedMessage) : that.reportedMessage != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (partnerId != null ? partnerId.hashCode() : 0);
        result = 31 * result + (annonsId != null ? annonsId.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (headline != null ? headline.hashCode() : 0);
        result = 31 * result + (slug != null ? slug.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) externalType;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (publicationDate != null ? publicationDate.hashCode() : 0);
        result = 31 * result + (applicationDeadline != null ? applicationDeadline.hashCode() : 0);
        result = 31 * result + (jobsContactsId != null ? jobsContactsId.hashCode() : 0);
        result = 31 * result + (numberOfVacancies != null ? numberOfVacancies.hashCode() : 0);
        result = 31 * result + (specifications != null ? specifications.hashCode() : 0);
        result = 31 * result + (benefits != null ? benefits.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (int) reported;
        result = 31 * result + (reportedMessage != null ? reportedMessage.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
