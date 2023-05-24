package com.smart.focus.ceoapi.dao;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataBaseConfig {

	@Bean(name = "smartFactory")
	public DataSource dataSource1() {
		String mHostName="";
		try {
			InetAddress addr = InetAddress.getLocalHost();
			mHostName = addr.getHostName();
			Log.Trace("HostName =  %s", mHostName);
		} catch (UnknownHostException e) {
			Log.Error(e.getMessage());
		}

		HikariConfig dataSourceConfig = new HikariConfig();
		dataSourceConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
		if (mHostName.equals(ConstDef.SERVICE_HOST_NAME)) {
			Log.Debug("mysql connect = %s", "127.0.0.1:3306");
			dataSourceConfig.setJdbcUrl(
					"jdbc:mysql://127.0.0.1:3306/?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull");
		} else {
			dataSourceConfig.setJdbcUrl(
						"jdbc:mysql://wms.landk.co.kr:3306/?characterEncoding=UTF-8&serverTimezone=Asia/Seoul&allowMultiQueries=true&useSSL=false&zeroDateTimeBehavior=convertToNull");
		}
		dataSourceConfig.setUsername("root");
		dataSourceConfig.setPassword("mantoman");
		// dataSourceConfig.setUsername("admin");
		// dataSourceConfig.setPassword("itm!6700");
		// 127.0.0.1 roor/.mantoman

		dataSourceConfig.setMaximumPoolSize(5);
		dataSourceConfig.setMinimumIdle(3);
		dataSourceConfig.setMaxLifetime(1200000);
		dataSourceConfig.setConnectionTimeout(20000);
		dataSourceConfig.setIdleTimeout(300000);
		dataSourceConfig.setConnectionTestQuery("select 1");
		return new HikariDataSource(dataSourceConfig);
	}

	@Bean(name = "JdbcTemplateSmart")
	public JdbcTemplate jdbcTemplate1(@Qualifier("smartFactory") DataSource ds) {
		return new JdbcTemplate(ds);
	}

}