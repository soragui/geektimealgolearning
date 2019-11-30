## [合并排序好的数组](https://leetcode-cn.com/problems/merge-two-sorted-lists/)

#### 出错代码 1
```java
        class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head;
        ListNode tail;

        if (l1.val <= l2.val) {
            head = l1;
        } else {
            head = l2;
        }

        tail = head;

        while(l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                tail = tail.next;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = tail.next;
                l2 = l2.next;
            }
        }

        if (l1 == null) {
            tail.next = l2;
        } else {
            tail.next = l1;
        }

        return head;

    }
 }
```

## CPP 解决方案
#### 思路

首先把数组1后移n位，然后逐一和数组2进行比较并按顺序插入数组1即可。

容易出错的地方是后移数组1。

```cpp
class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        
        int i, j, k;
        for (i = m - 1; i >= 0; i --)
            nums1[i + n] = nums1[i];

        for (i = n, j = 0, k = 0; i < m+n && j < n;) {
            if (nums1[i] <= nums2[j])
                nums1[k++] = nums1[i++];
            else
                nums1[k++] = nums2[j++];
        }

        while(j < n) nums1[k++] = nums2[j++];

    }
};
```