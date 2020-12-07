package week13;


import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;

/**
 * @ClassName crawl
 * @Description
 * @Author TYTTPE
 * @Date 2020/12/7
 **/
public class crawl {
    public static void main(String[] args) throws Exception{
        //创建httpClient客户端
        HttpClient hClient = new DefaultHttpClient();
        //创建http发送请求对象
        HttpPost hget = new HttpPost("http://www.doc88.com/p-0127694236957.html");
        //HttpGet hget = new HttpGet("http://www.doc88.com/p-0127694236957.html");
        //设置请求头
        hget.setHeader("Cookie", "cdb_sys_sid=2qjunoj05uq2ko4uh8bq1d31r1; cdb_RW_ID_300413615=1685; cdb_back[n]=6; Hm_lvt_eaa57ca47dacb4ad4f5a257001a3457c=1588766444; cdb_back[t]=1; cdb_back[pcode]=4952255792496; cdb_back[ajax]=1; cdb_back[tm]=1854; cdb_back[m]=1624719; cdb_back[page]=1; cdb_back[member_id]=1624719; cdb_RW_ID_357384551=860; cdb_back[group_id]=555amkheTyL3y%2BWYhdz145ZUy7ku6GCdBdsSpt3aBdmNP3mPCuWlGMg0aQGaJ3AUQKuo2tVh6le8MgRUp34s3xWheyXsI5gend0AW9aFjL60OAep28JF%2FwnJDQ; cdb_back[r_p_ids]=4fa7tAv%2BIunDmaxmonDKpYwYSx0RIUEXEqHHpbZoh1wwbYNXOsj8xAfpcdKzL8HmRaZGtSRKDWhY1sEXlp2I9%2BWpuXdV8OfTvNs8nBQ3rEj0u8ufsjBIqdMXE9l%2FWjQ7JtbymK%2B4fK0WIUuW0eJGCwQyWrsC4r%2BY%2FkB5XaaY3lDpKV%2FUogLU; cdb_back[pid]=0127694236957; PHPSESSID=2qjunoj05uq2ko4uh8bq1d31r1; cdb_RW_ID_849618457=4129; cdb_READED_PC_ID=%2C440; ShowSkinTip_1=1; cdb_H5R=1; cdb_back[doctype]=1; cdb_back[book_id]=0; cdb_back[p_name]=%E8%87%AA%E8%80%8303708%E4%B8%AD%E5%9B%BD%E8%BF%91%E4%BB%A3%E5%8F%B2%E7%BA%B2%E8%A6%81%E5%8E%86%E5%B9%B4%E8%AF%95%E9%A2%98%E7%9C%9F%E9%A2%98%E5%8F%8A%E7%AD%94%E6%A1%88; cdb_back[rel_p_id]=849618457; cdb_back[p_id]=849618457; cdb_back[act]=save_rl; cdb_back[srlid]=0f34h7y+c1BvI9A1M9tjU0XQ4JBBgPFOMmMCfVGjbKAbebL0zgRgpWVkPienVYXGjIncZUCkMKMyGW2CZbICpzOh0Ah21DiXbA+I1Srj; showAnnotateTipIf=1; Page_0127694236957=1");
        hget.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/85.0.4183.102 Safari/537.36");
        //设置连接超时，传递响应超时
        hClient.getParams()
                .setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT, 10000)
                .setParameter(CoreConnectionPNames.SO_TIMEOUT, 10000)
                .setParameter(ConnRouteParams.DEFAULT_PROXY, new HttpHost("121.31.71.63", 80));
        //发送请求
        HttpResponse response = hClient.execute(hget);
        //获取网页内容
        String content = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(content);
    }
}
