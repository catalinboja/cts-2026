package ro.ase.csie.cts.clean.code.good.containers;

import java.util.HashMap;
import java.util.Map;

public class DependencyContainer {
    private static final Map<Class<?>, Object> dependencies = 
    		new HashMap<>();

    // Register a dependency
    public static <T> void register(
    		Class<T> interfaceType, T implementation) {
        dependencies.put(interfaceType, implementation);
    }

    // Resolve a dependency
    public static <T> T resolve(Class<T> interfaceType) {
        return interfaceType.cast(dependencies.get(interfaceType));
    }
}
