package com.deserve.snl;

import java.util.Objects;

public class Snake {

    private int start;

    private int end;

    public Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean validated() {
        return start < 100 && end > 0 && start > end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Snake snake = (Snake) o;
        return start == snake.start && end == snake.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
