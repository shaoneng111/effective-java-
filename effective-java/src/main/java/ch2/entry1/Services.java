package ch2.entry1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {

    private Services(){}

    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    //服务提供者注册接口
    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    private static void registerProvider(String name, Provider p) {
        providers.put(name, p);
    }

    //服务获取接口

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    private static Service newInstance(String name) {
        Provider p = providers.get(name);
        if (p == null) {
            throw new IllegalArgumentException("No provider registered with name: " + name);
        }

        Integer.valueOf("10");
        return p.newService();
    }


}
