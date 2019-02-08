package intfaceMap;
public interface Map<Key,Value> {

    /*添加
     * */
void add(Key key,Value value);

/*删除
 * 
 * */
void delete(Key key);

/*是否包含指定键的键值对
 * */
boolean contain(Key key);

/*修改
 * */
void set(Key key,Value value);

/*根据键获取值
 * */
Value get(Key key);


/*Map大小
 * */
int  getSize();


/*
* 判断Map是否为空
* */

boolean isEmpty();






}
