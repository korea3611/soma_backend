package com.bizkicks.backend.api;

import com.bizkicks.backend.entity.Alarms;
import com.bizkicks.backend.entity.KickboardCompany;
import com.bizkicks.backend.entity.KickboardLocation;
import com.bizkicks.backend.entity.Price;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;



@Controller
public class KickboardCompanyApi {

    @RequestMapping(value = "/manage/products", produces = "application/json; charset=utf8")
    @ResponseBody
    public List<Object> restTest() {

        List<Object> kickboardcompany = new ArrayList<>();

        KickboardCompany kickboardCompany1 = new KickboardCompany();
        kickboardCompany1.setCompanyname("씽씽");
        kickboardCompany1.setPricePerHour(10000L);
        kickboardCompany1.setHelmet(false);
        kickboardCompany1.setLicense(true);

        List<String> serviceLocation = new ArrayList<>();
        serviceLocation.add("관악구");
        serviceLocation.add("서초구");
        serviceLocation.add("강남구");
        kickboardCompany1.setServicelocation(serviceLocation);

        KickboardCompany kickboardCompany2 = new KickboardCompany();
        kickboardCompany2.setCompanyname("킥고잉");
        kickboardCompany2.setPricePerHour(9000L);
        kickboardCompany2.setHelmet(true);
        kickboardCompany2.setLicense(true);

        List<String> serviceLocation2 = new ArrayList<>();
        serviceLocation2.add("관악구");
        serviceLocation2.add("서초구");
        serviceLocation2.add("강남구");
        kickboardCompany2.setServicelocation(serviceLocation2);

        kickboardcompany.add(kickboardCompany1);
        kickboardcompany.add(kickboardCompany2);

        return kickboardcompany;
    }

    @RequestMapping(value = "/kickboard/location", produces = "application/json; charset=utf8")
    @ResponseBody
    public List<Object> kickboardlocation() {

        List<Object> kickboardlocation = new ArrayList<>();

        KickboardLocation kickboardLocation1 = new KickboardLocation();
        kickboardLocation1.setCompany_name("씽씽");
        kickboardLocation1.setLat(37.55377475931086);
        kickboardLocation1.setLng(126.96435101606421);
        kickboardLocation1.setBattery(80L);
        kickboardLocation1.setModel("AAAAA");
        kickboardLocation1.setImg_url("http://****.jpg");

        KickboardLocation kickboardLocation2 = new KickboardLocation();
        kickboardLocation2.setCompany_name("킥고잉");
        kickboardLocation2.setLat(37.54994713018562);
        kickboardLocation2.setLng(126.96518786529317);
        kickboardLocation2.setBattery(90L);
        kickboardLocation2.setModel("CCCCC");
        kickboardLocation2.setImg_url("http://****.jpg");

        KickboardLocation kickboardLocation3 = new KickboardLocation();
        kickboardLocation3.setCompany_name("라임");
        kickboardLocation3.setLat(37.54887535880441);
        kickboardLocation3.setLng(126.97550900578369);
        kickboardLocation3.setBattery(100L);
        kickboardLocation3.setModel("BBBBB");
        kickboardLocation3.setImg_url("http://****.jpg");

        KickboardLocation kickboardLocation4 = new KickboardLocation();
        kickboardLocation4.setCompany_name("씽씽");
        kickboardLocation4.setLat(37.554063949968516);
        kickboardLocation4.setLng(126.97791226510789);
        kickboardLocation4.setBattery(70L);
        kickboardLocation4.setModel("DDDDD");
        kickboardLocation4.setImg_url("http://****.jpg");

        KickboardLocation kickboardLocation5 = new KickboardLocation();
        kickboardLocation5.setCompany_name("킥고잉");
        kickboardLocation5.setLat(37.55843569554293);
        kickboardLocation5.setLng(126.97276242369888);
        kickboardLocation5.setBattery(60L);
        kickboardLocation5.setModel("EEEEE");
        kickboardLocation5.setImg_url("http://****.jpg");

        kickboardlocation.add(kickboardLocation1);
        kickboardlocation.add(kickboardLocation2);
        kickboardlocation.add(kickboardLocation3);
        kickboardlocation.add(kickboardLocation4);
        kickboardlocation.add(kickboardLocation5);

        return kickboardlocation;

    }

    @RequestMapping(value = "/manage/measuredrate-price", produces = "application/json; charset=utf8")
    @ResponseBody
    public Price price(){

        Price price = new Price();
        price.setPrice(15000);

        return price;
    }

    @RequestMapping(value = "/manage/alarms", produces = "application/json; charset=utf8")
    @ResponseBody
    public List<Object> alarms(){

        List<Object> alarms = new ArrayList<>();

        Alarms alarm1 = new Alarms();
        alarm1.setType("cost");
        alarm1.setValue(15000);

        Alarms alarm2 = new Alarms();
        alarm2.setType("time");
        alarm2.setValue(15);

        alarms.add(alarm1);
        alarms.add(alarm2);

//        List<AlarmDto> collect = alarms.stream()
//                .map(m -> new AlarmDto()))
        return alarms;
    }

}