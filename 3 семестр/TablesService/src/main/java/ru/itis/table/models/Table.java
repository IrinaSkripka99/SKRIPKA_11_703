package ru.itis.table.models;


import lombok.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private Long id;
    private Integer countOfPerson;
    private Boolean smoking;

   /* public Table(Builder builder) {
        this.id =builder. id;
        this.countOfPerson = builder.countOfPerson;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCountOfPerson() {
        return countOfPerson;
    }

    public void setCountOfPerson(Integer countOfPerson) {
        this.countOfPerson = countOfPerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        if (id != null ? !id.equals(table.id) : table.id != null) return false;
        return countOfPerson != null ? countOfPerson.equals(table.countOfPerson) : table.countOfPerson == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (countOfPerson != null ? countOfPerson.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", countOfPerson=" + countOfPerson +
                '}';
    }

    public static class Builder {
        private Long id;
        private Integer countOfPerson;


        public Builder countOfPerson(Integer countOfPerson) {
            this.countOfPerson = countOfPerson;
            return this;
        }

        public Table build() {
            return new Table(this);
        }


    }*/
}
