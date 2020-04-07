package com.example.cirilomoney.api.repository.listener;

import javax.persistence.PostLoad;

import org.springframework.util.StringUtils;

import com.example.cirilomoney.api.CirilomoneyApiApplication;
import com.example.cirilomoney.api.model.Lancamento;
//import com.example.cirilomoney.api.storage.S3;

public class LancamentoAnexoListener {
	
//	@PostLoad
//	public void postLoad(Lancamento lancamento) {
//		if (StringUtils.hasText(lancamento.getAnexo())) {
//			S3 s3 = CirilomoneyApiApplication.getBean(S3.class);
//			lancamento.setUrlAnexo(s3.configurarUrl(lancamento.getAnexo()));
//		}
//	}

}
