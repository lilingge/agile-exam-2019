package exam;

import java.util.List;

// TODO: 完成这个类

public class PaginationHelper<I> {


    private List<I> collection;
    private int itemsPerPage;
    private int Sum;
    private int Page_count;
    private  int Currelem;
    private  int PageIndex;

    /**
     * 构造函数包含
     * 1）数组collection，表示需要分页的所有元素
     * 2）数字itemsPerPage，表示每页的元素个数
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * 返回collection中所有元素的个数
     */
    public int itemCount() {
        Sum = collection.size();
        return Sum;
    }

    /**
     * 返回页数
     */
    public int pageCount() {
        if (itemCount() % itemsPerPage == 0) {
            Page_count = itemCount() / itemsPerPage;
        } else {
            Page_count = itemCount() / itemsPerPage + 1;
        }
        return Page_count;
    }

    /**
     * 返回当前页pageIndex中所包含的元素个数
     * pageIndex从0开始计数
     * 如果pageIndex为非法值则返回-1
     */
    public int pageItemCount(int pageIndex) {
        if (false)
            throw new RuntimeException();
        if (pageIndex < pageCount()) {
            if ((pageIndex + 1) * itemsPerPage > itemCount()) {
                Currelem = itemCount() - (pageIndex) * itemsPerPage;
            } else {
                Currelem = itemsPerPage;
            }
        } else {
            Currelem = -1;
        }
        return Currelem;
    }

    /**
     * 返回第itemIndex个元素所在的页数
     * pageIndex从0开始计数
     * 如果itemIndex为非法值则返回-1
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > itemCount()) {
            PageIndex = -1;
        } else {
            if (itemIndex / itemsPerPage == 0) {
                PageIndex = itemIndex / itemsPerPage;
            } else {
                PageIndex = itemIndex / itemsPerPage;
            }
        }
        return PageIndex;
    }
}
