class Pair<T, S> {

    private T first;
    private S second;

    public static <T, S> Pair<T, S> of(T field, S field2) {
        return new Pair<>(field, field2);
    }

    private Pair(T field1, S field2) {
        this.first = field1;
        this.second = field2;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair<?, ?> pair = (Pair<?, ?>) o;
        if (getFirst() != null ? !getFirst().equals(pair.getFirst())
                : pair.getFirst() != null) {
            return false;
        }
        return getSecond() != null ? getSecond().equals(pair.getSecond()) : pair.getSecond() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirst() != null ? getFirst().hashCode() : 0;
        result = 31 * result + (getSecond() != null ? getSecond().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pair {field1=" + first + ", field2=" + second + '}';
    }
}

