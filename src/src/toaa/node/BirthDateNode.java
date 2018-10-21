package toaa.node;

class BirthDateNode extends Node {
    private PersonNode personNode;
    private BirthPlaceNode birthPlaceNode;

    public BirthDateNode(String value) {
        super(value);
    }

    public void setBirthPlaceNode(BirthPlaceNode birthPlaceNode) {
        this.birthPlaceNode = birthPlaceNode;
    }

    public void setPersonNode(PersonNode personNode) {
        this.personNode = personNode;
    }

    public BirthPlaceNode getBirthPlaceNode() {
        return birthPlaceNode;
    }

    public PersonNode getPersonNode() {
        return personNode;
    }
}
