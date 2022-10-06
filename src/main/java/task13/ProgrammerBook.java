package main.java.task13;

import main.java.task12and14and15.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProgrammerBook that = (ProgrammerBook) o;
        return level == that.level && language.equals(that.language);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (language == null ? 0 : language.hashCode());
        result = 31 * result + level;
        return result;
    }
}
