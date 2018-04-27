package com.atguigu.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class MyFileUpload {

	public static List<String> image_uploaf(MultipartFile[] files) {

		String path = MyPropertyUtil.getProperty("myUpload.properties", "window_path");

		List<String> list_image = new ArrayList<String>();
		for (int i = 0; i < files.length; i++) {

			String originalFilename = files[i].getOriginalFilename();

			String name = System.currentTimeMillis() + originalFilename;

			String upload_name = path + "/" + name;

			try {
				files[i].transferTo(new File(upload_name));
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			list_image.add(name);

		}
		return list_image;
	}

}
