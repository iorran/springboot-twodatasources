package com.lgc.ctps.pocoweb.transfer.domain.pocoweb.basicdata.drilling;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = "values")
@Builder
public class Column {
	private String bitSize;
	private String finalMd;
	private String initialMd;
	private String name;
	private String totalWeight;
	private String type;
	private List<ColumnValue> values;
}
