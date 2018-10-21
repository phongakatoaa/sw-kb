package toaa.node;

class BirthPlaceNode extends Node {
    private PersonNode personNode;
    private BirthDateNode birthDateNode;

    public BirthPlaceNode(String value) {
        super(value);
    }

    public void setBirthDateNode(BirthDateNode birthDateNode) {
        this.birthDateNode = birthDateNode;
    }

    public void setPersonNode(PersonNode personNode) {
        this.personNode = personNode;
    }

    public PersonNode getPersonNode() {
        return personNode;
    }

    public BirthDateNode getBirthDateNode() {
        return birthDateNode;
    }
}
