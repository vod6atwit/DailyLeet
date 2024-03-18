class BrowserHistory {
    private List<String> browserList;
    private String curPage;
    private int lastPage;

    public BrowserHistory(String homepage) {
        browserList = new ArrayList<>();
        browserList.add(homepage);
        lastPage = 0;
        curPage = homepage;
    }

    public void visit(String url) {
        int cur = browserList.lastIndexOf(curPage);
        if (browserList.size() > cur + 1) {
            browserList.set(cur + 1, url);
        } else {
            browserList.add(url);
        }
      

        curPage = url;
        lastPage = cur + 1;
        // System.out.println("here " + cur + " " + browserList.lastIndexOf(curPage));
    }

    public String back(int steps) {
        int cur = browserList.lastIndexOf(curPage);
        // System.out.println(cur);
        cur = Math.max(0, cur - steps);
        curPage = browserList.get(cur);
        // if ((cur - steps) > 0) {
        //     curPage = browserList.get(cur - steps);
        // } else {
        //     curPage = browserList.get(0);
        // }
        // System.out.println(curPage);
        return curPage;
    }

    public String forward(int steps) {
        int cur = browserList.lastIndexOf(curPage);
        cur = Math.min(lastPage, cur + steps);
        curPage = browserList.get(cur);
        // if ((cur + steps) < lastPage) {
        //     curPage = browserList.get(cur + steps);
        // } else {
        //     curPage = browserList.get(lastPage);
        // }
        // System.out.println(curPage);
        return curPage;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */