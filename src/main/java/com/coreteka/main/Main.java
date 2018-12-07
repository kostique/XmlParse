package com.coreteka.main;

import com.coreteka.main.generated.Resources;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;




public class Main {
    public static void main(String[] args) throws IOException, JAXBException {

        JAXBContext jc = JAXBContext.newInstance(Resources.class);  //com.coreteka.main.generated

        Unmarshaller unmarshaller = jc.createUnmarshaller();

        //Resources resources = (src.main.resources.Resources) unmarshaller.unmarshal(new File( "/home/kostique/IdeaProjects/XmlParse/src/main/generated&/for_parse.xml"));

        Resources resources = (Resources) unmarshaller.unmarshal(new File( "/home/kostique/IdeaProjects/XmlParse/src/main/resources/for_parse.xml"));

//        String schemaPath = "/home/kostique/IdeaProjects/XmlParse/src/main/generated&/for_parse.xsd";
//        String outputDirectory = "/home/kostique/IdeaProjects/XmlParse/src/main/generated&/XmlBeans/";
//
//// Setup schema compiler
//        SchemaCompiler sc = XJC.createSchemaCompiler();
//        sc.forcePackageName("com.xyz.schema.generated&");
//
//// Setup SAX InputSource
//        File schemaFile = new File(schemaPath);
//        InputSource is = new InputSource(new FileInputStream(schemaFile));
//        is.setSystemId(schemaFile.getAbsolutePath());
//
//// Parse & build
//        sc.parseSchema(is);
//        S2JJAXBModel model = sc.bind();
//        JCodeModel jCodeModel = model.generateCode(null, null);
//        jCodeModel.build(new File(outputDirectory));



    }
}
