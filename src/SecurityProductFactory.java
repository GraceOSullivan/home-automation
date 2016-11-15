interface SecurityProductFactory {
    SecurityProduct createProduct(ProductType productType);
    enum ProductType {
        BOX, DOME, IP, THERMAL,
        BEAM, CEILING, CONTACT, DOOR, GLASS, SMOKE, VIBRATION
    }
}
