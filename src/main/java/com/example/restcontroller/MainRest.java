package com.example.restcontroller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.DataVietNam;
import com.example.model.NewsCovid;
@CrossOrigin
@RestController
public class MainRest {
	@GetMapping("/covid-19-vietnam")
	public DataVietNam welcome() throws IOException {
		Connection conn = Jsoup.connect("https://gadgets.dantri.com.vn/corona/vietnam");
		Document doc = conn.get();
		Elements es = doc.select(".ant-table-tbody");
		String html = es.get(0).html();
		Elements cases = doc.select(".dantri-corona .ant-statistic-content-value-int");
		DataVietNam result = new DataVietNam();
		result.setCaNhiem(cases.get(0).html().trim());
		result.setTuVong(cases.get(1).html().trim());
		result.setHoiPhuc(cases.get(2).html().trim());
		result.setContentHtml(html);
		return result;
	}
	@GetMapping("/news-covid-19")
	public List<NewsCovid> tintuc() throws IOException {
		List<NewsCovid> data = new ArrayList<NewsCovid>();
		Connection conn = Jsoup.connect("https://baomoi.com/phong-chong-dich-covid-19/top/328.epi");
		Document doc = conn.get();
		Elements es = doc.select(".story");
		es.forEach(element -> {
			String title = element.select(".story__heading").text();
	        String link = "https://baomoi.com"+element.select(".story__heading a").attr("href");
	        String source = element.select(".story__meta .source").text();
	        String imgSource = element.select(".story__thumb img").attr("src");
	        if(element.select(".story__thumb img").hasAttr("data-src")) {
	        	imgSource = element.select(".story__thumb img").attr("data-src");
	        }
	        if(imgSource.isEmpty()) {
	        	imgSource = "https://p10grp.com/wp-content/uploads/2020/03/video.png";
	        }
	        if(!title.isEmpty()) {
	        	data.add(new NewsCovid(title, link, imgSource, source));
	        }
		});
		return data;
	}
	
}
