package edu.ccrm.io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface Persistable<T> {
    void save(List<T> items, Path filePath) throws IOException;
    List<T> load(Path filePath) throws IOException;

    // Default method demonstrating interface default methods
    default boolean isValidPath(Path path) {
        return path != null && !path.toString().isEmpty();
    }

    // Static method in interface
    static String getDefaultExtension() {
        return ".csv";
    }
}

