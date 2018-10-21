package toaa.node;

class PersonNode extends Node {
    private BirthDateNode birthDateNode;
    private BirthPlaceNode birthPlaceNode;

    public PersonNode(String value) {
        super(value);
    }

    public BirthPlaceNode getBirthPlaceNode() {
        return birthPlaceNode;
    }

    public BirthDateNode getBirthDateNode() {
        return birthDateNode;
    }
}
