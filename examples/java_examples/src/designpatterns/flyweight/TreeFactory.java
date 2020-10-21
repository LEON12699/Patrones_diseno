package designpatterns.flyweight;

public class TreeFactory {
	Tree d, c = null;
	public TreeFactory() {
		this.d = new DeciduousTree();
		this.c = new ConiferTree();
	}
	public Tree getTree(String type) throws Exception {
            switch (type) {
                case "deciduous":
                    return this.d;
                case "conifer":
                    return this.c;
                default:
                    throw new Exception("Invalid kind of tree");
            }
	}
}