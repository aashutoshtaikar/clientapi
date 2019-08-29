package com.trade.clientapi.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class JsonToPojo {

	public static void main(String[] args) throws IOException {
		String packageName = "com.cooltrickshome";
		File inputJson = new File("/Account.json");
		File outputPojoDirectory = new File("." + File.separator + "convertedPojo");
		outputPojoDirectory.mkdirs();
		
		try {
			new JsonToPojo().convert2JSON(inputJson.toURI().toURL(), outputPojoDirectory, packageName,
					inputJson.getName().replace(".json", ""));
		} catch (IOException e) {
			System.out.println("Encountered issue while converting to pojo: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void convert2JSON(URL inputJson, File outputPojoDirectory, String packageName, String className)
			throws IOException {
//		System.out.println(Paths.get("").toAbsolutePath().toString());
//		System.out.println("src/main/java/"+ this.getClass().getPackage().getName().replace(".", "/") + "/Account.json");
		
		File inp = new File("src/main/java/"+ this.getClass().getPackage().getName().replace(".", "/") + "/Account.json");
		inputJson = inp.toURI().toURL();
		
		JCodeModel codeModel = new JCodeModel();
		URL source = inputJson;
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() { // set config option by overriding method
				return true;
			}

			@Override
			public SourceType getSourceType() {
				return SourceType.JSON;
			}
		};
		SchemaMapper mapper = new SchemaMapper(
				new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, className, packageName, source);
		codeModel.build(outputPojoDirectory);
	}
}

/* for future: 
 * build a logic to dynamically get a Json and convert it to POJO
 * */

//try {
//	 Class.forName( "your.fqdn.class.name" );
//	} catch( ClassNotFoundException e ) {
//	 	//my class isn't there!
//		
//	 	//create a POJO using Json
//	}
