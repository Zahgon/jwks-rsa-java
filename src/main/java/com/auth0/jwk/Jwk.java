package com.auth0.jwk;

import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Represents a JSON Web Key (JWK) used to verify the signature of JWTs
 */
@SuppressWarnings("WeakerAccess")
public class Jwk {

    private static final String ALGORITHM_RSA = "RSA";

    private static final String ALGORITHM_ELLIPTIC_CURVE = "EC";

    private static final String ELLIPTIC_CURVE_TYPE_P256 = "P-256";

    private static final String ELLIPTIC_CURVE_TYPE_P384 = "P-384";

    private static final String ELLIPTIC_CURVE_TYPE_P521 = "P-521";

    private final String id;

    private final String type;

    private final String algorithm;

    private final String usage;

    private final List<String> operations;

    private final String certificateUrl;

    private final List<String> certificateChain;

    private final String certificateThumbprint;

    private final Map<String, Object> additionalAttributes;

    /**
     * Creates a new Jwk
     *
     * @param id                    kid
     * @param type                  kty
     * @param algorithm             alg
     * @param usage                 use
     * @param operations            key_ops
     * @param certificateUrl        x5u
     * @param certificateChain      x5c
     * @param certificateThumbprint x5t
     * @param additionalAttributes  additional attributes not part of the standard ones
     */
    @SuppressWarnings("WeakerAccess")
    public Jwk(String id, String type, String algorithm, String usage, List<String> operations, String certificateUrl, List<String> certificateChain, String certificateThumbprint, Map<String, Object> additionalAttributes) {
        this.id = id;
        this.type = type;
        this.algorithm = algorithm;
        this.usage = usage;
        this.operations = operations;
        this.certificateUrl = certificateUrl;
        this.certificateChain = certificateChain;
        this.certificateThumbprint = certificateThumbprint;
        this.additionalAttributes = additionalAttributes;
    }

    /**
     * Creates a new Jwk
     *
     * @param id
     * @param type
     * @param algorithm
     * @param usage
     * @param operations
     * @param certificateUrl
     * @param certificateChain
     * @param certificateThumbprint
     * @param additionalAttributes
     * @deprecated The specification states that the 'key_ops' (operations) parameter contains an array value.
     * Use {@link #Jwk(String, String, String, String, List, String, List, String, Map)}
     */
    @Deprecated
    @SuppressWarnings("WeakerAccess")
    public Jwk(String id, String type, String algorithm, String usage, String operations, String certificateUrl, List<String> certificateChain, String certificateThumbprint, Map<String, Object> additionalAttributes) {
        this(id, type, algorithm, usage, Collections.singletonList(operations), certificateUrl, certificateChain, certificateThumbprint, additionalAttributes);
    }

    @SuppressWarnings("unchecked")
    public static Jwk fromValues(Map<String, Object> map) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public String getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public String getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public String getAlgorithm() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public String getUsage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public String getOperations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public List<String> getOperationsAsList() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public String getCertificateUrl() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public List<String> getCertificateChain() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("WeakerAccess")
    public String getCertificateThumbprint() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Map<String, Object> getAdditionalAttributes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a {@link PublicKey} if the {@code 'alg'} is {@code 'RSA'} or {@code 'EC'}
     *
     * @return a public key
     * @throws InvalidPublicKeyException if the key cannot be built or the key type is not a supported type of RSA or EC
     */
    @SuppressWarnings("WeakerAccess")
    public PublicKey getPublicKey() throws InvalidPublicKeyException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private String stringValue(String key) {
        return (String) additionalAttributes.get(key);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
