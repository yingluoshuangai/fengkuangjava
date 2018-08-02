1. `public char charAt(int index)`：返回在索引处的字符
`public int codePointAt(int index)`: 返回在索引处的代码点
`public int codePointBefore(int index)`
`public int codePointCount(int beginIndex, int endIndex)`
charAt方法和codePoint方法区别就是因为处理编码问题。
如果String中没有超过utf-16的字符，那么他们两个的方法是一样。但是如果有，那就需要使用codePoint方法
参考：[深入学习Java中的字符串,代码点和代码单元](https://www.cnblogs.com/vinozly/p/5155304.html) 

2. `public int compareTo(String anotherString)`
```
Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. The character sequence represented by this String object is compared lexicographically to the character sequence represented by the argument string. The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
This is the definition of lexicographic ordering. If two strings are different, then either they have different characters at some index that is a valid index for both strings, or their lengths are different, or both. If they have different characters at one or more index positions, let k be the smallest such index; then the string whose character at position k has the smaller value, as determined by using the < operator, lexicographically precedes the other string. In this case, compareTo returns the difference of the two character values at position k in the two string -- that is, the value:

 this.charAt(k)-anotherString.charAt(k)
 
If there is no index position at which they differ, then the shorter string lexicographically precedes the longer string. In this case, compareTo returns the difference of the lengths of the strings -- that is, the value:
 this.length()-anotherString.length()
```
```
使用‘字典排序’比较两个String。这个比较是基于String中每个character的unicode编码。这个String对象所表示的character序列和参数String所表示的character序列使用‘字典排序’进行比较。
如果在‘字典排序‘中这个String对象小于参数String对象，则返回负的integer。
如果在’字典排序‘中这个String对象大于参数String对象，则返回正的integer。
如果两个String相等，则返回0.
当equals(Object)方法返回true时，compareTo方法返回0.

这是’字典排序‘的定义。
如果两个String不同，那么他们要么在某个索引处有不同的character（这个索引对两个String都是有效的），要么长度不同，或者两者都。
如果他们在一至多个索引处有不同的character，假设k是这些索引的最小值；在k位置上有较小character值的String（使用<操作符确定），在’字典排序‘就小于另一个String。
在这种情况下，compareTo方法返回的是两个String在k位置上两个charcater值的差。
如果他们没有字符不同的索引位置，则较短字符串的字典顺序在较长字符串之前。在这种情况下， compareTo 返回这两个字符串长度的差。
```
3. `public int compareToIgnoreCase(String str)`
```
Compares two strings lexicographically, ignoring case differences. This method returns an integer whose sign is that of calling compareTo with normalized versions of the strings where case differences have been eliminated by calling Character.toLowerCase(Character.toUpperCase(character)) on each character.
Note that this method does not take locale into account, and will result in an unsatisfactory ordering for certain locales. The java.text package provides collators to allow locale-sensitive ordering.
```
```
通过‘字典排序‘比较两个String，忽略大小写的不同。
这个方法返回一个integer,它的符号与使用’规范化String‘调用compareTo的结果一样。
’规范化String‘是通过对每个character调用Character.toLowerCase(Character.toUpperCase(character))来消除大小写差异。
注意，此方法不 考虑语言环境，因此可能导致在某些语言环境中的排序效果不理想。java.text 包提供 Collators 完成与语言环境有关的排序。
```

4. public String concat(String str)
```angular2html
Concatenates the specified string to the end of this string.
If the length of the argument string is 0, then this String object is returned. Otherwise, a String object is returned that represents a character sequence that is the concatenation of the character sequence represented by this String object and the character sequence represented by the argument string.
```
在String后面连接指定String。
如果参数String的长度为0，则返回原来的String对象。
否则，返回一个String对象，该String对象表示的字符序列是由这个String对象代表的字符序列连接参数String代表的字符序列形成的。

5. public boolean contains(CharSequence s)
Returns true if and only if this string contains the specified sequence of char values.
当且仅当这个字符串包含指定char序列，返回true
