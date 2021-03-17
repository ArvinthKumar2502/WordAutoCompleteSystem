public class App {
    public static void main(String[] args) throws Exception {
        var trie=new Trie();
        trie.insert("cat");
        trie.insert("can");
        trie.insert("cabbage");
        trie.insert("canada");
        trie.insert("catostrophy");
        var res=trie.findWords("ca");
        System.out.println(res);
    }
}
