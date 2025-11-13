package test.client;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class MockInitialContextFactory implements InitialContextFactory, Context {
    private static final MockInitialContextFactory MOCK_CONTEXT = new MockInitialContextFactory();
    private final ConcurrentHashMap<String, Object> bindings = new ConcurrentHashMap<>();

    @Override
    public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
        return MOCK_CONTEXT;
    }

    public static void reinit() {
        MOCK_CONTEXT.bindings.clear();
    }

    public static final String[] INVALID_JNDI_NAMES = {
        "invalid jndi name"
    };

    @Override
    public Object lookup(String name) throws NamingException {
        for (String invalidName : INVALID_JNDI_NAMES) {
            if (invalidName.equals(name)) {
                throw new NamingException("Invalid JNDI name: " + name);
            }
        }
        Object result = bindings.get(name);
        if (result == null) {
            throw new NamingException("Name not found: " + name);
        }
        return result;
    }

    @Override
    public void bind(String name, Object obj) throws NamingException {
        for (String invalidName : INVALID_JNDI_NAMES) {
            if (invalidName.equals(name)) {
                throw new NamingException("Invalid JNDI name: " + name);
            }
        }
        if (bindings.putIfAbsent(name, obj) != null) {
            throw new NamingException("Name already bound: " + name);
        }
    }

    // All other methods are not needed for this test and are left unimplemented.

    @Override
    public Object lookup(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void bind(Name name, Object obj) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void rebind(Name name, Object obj) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void rebind(String name, Object obj) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unbind(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unbind(String name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void rename(Name oldName, Name newName) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void rename(String oldName, String newName) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public NamingEnumeration<NameClassPair> list(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public NamingEnumeration<NameClassPair> list(String name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public NamingEnumeration<Binding> listBindings(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public NamingEnumeration<Binding> listBindings(String name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void destroySubcontext(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void destroySubcontext(String name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Context createSubcontext(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Context createSubcontext(String name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object lookupLink(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object lookupLink(String name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public NameParser getNameParser(Name name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public NameParser getNameParser(String name) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Name composeName(Name name, Name prefix) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String composeName(String name, String prefix) throws NamingException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object addToEnvironment(String propName, Object propVal) throws NamingException {
        return null;
    }

    @Override
    public Object removeFromEnvironment(String propName) throws NamingException {
        return null;
    }

    @Override
    public Hashtable<?, ?> getEnvironment() throws NamingException {
        return new Hashtable<>();
    }

    @Override
    public void close() throws NamingException {}

    @Override
    public String getNameInNamespace() throws NamingException {
        return "";
    }
}
