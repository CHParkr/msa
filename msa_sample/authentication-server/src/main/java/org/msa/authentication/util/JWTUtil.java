package org.msa.authentication.util;

import java.util.Date;

import org.apache.commons.lang.time.DateUtils;
import org.msa.authentication.dto.AccountDTO;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class JWTUtil {
	public static String generate(AccountDTO accountDTO) {
		Date now = new Date();
		return JWT.create()
				.withSubject(accountDTO.getAccountId())												// 토큰명
				.withExpiresAt(DateUtils.addSeconds(now, 10))										// 토큰 유효기간
				.withIssuedAt(now)																	// 토큰 발행일
				.sign(Algorithm.HMAC512("secretKey"));												// 토큰 암호화 알고리즘
	}
}