package com.milton.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Utils {
	public static String nameToTitle(String name) {
		return Arrays.stream(name.split("-")).map(StringUtils::capitalize).collect(Collectors.joining(" "));
	}
}
