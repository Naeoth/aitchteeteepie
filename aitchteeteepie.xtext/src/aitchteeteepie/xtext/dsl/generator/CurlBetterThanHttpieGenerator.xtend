/*
 * generated by Xtext 2.12.0
 */
package aitchteeteepie.xtext.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import aitchteeteepie.RawJsonFieldItem
import aitchteeteepie.DataFieldItem
import aitchteeteepie.FormFileFieldItem
import aitchteeteepie.UrlParameterItem
import aitchteeteepie.HttpHeaderItem
import aitchteeteepie.ProxyFlag
import aitchteeteepie.AuthFlag
import aitchteeteepie.JsonFlag
import aitchteeteepie.FormFlag
import aitchteeteepie.Method
import aitchteeteepie.TimeoutFlag
import aitchteeteepie.VersionFlag
import aitchteeteepie.HelpFlag
import aitchteeteepie.BodyFlag
import aitchteeteepie.Flag
import aitchteeteepie.HeadersFlag
import aitchteeteepie.DownloadFlag
import aitchteeteepie.VerboseFlag
import aitchteeteepie.CommandLineInterface
import aitchteeteepie.JsonType
import aitchteeteepie.JsonObject
import aitchteeteepie.JsonString
import aitchteeteepie.JsonArray
import aitchteeteepie.JsonBoolean
import aitchteeteepie.JsonNull
import aitchteeteepie.JsonNumber
import aitchteeteepie.Member

class CurlBetterThanHttpieGenerator extends AbstractGenerator {
	private boolean formFlag=false;
	
	override void doGenerate(Resource res, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(res.URI.trimFileExtension.appendFileExtension("curl").lastSegment,
			res.allContents.filter(CommandLineInterface).toIterable.head.compile.toString)
	}
	
	def dispatch compile(CommandLineInterface req) {
		if(req.url === null)
			req.url="localhost";
		if (req.method === null)
			req.method=Method.GET;
	
		val flagsCmpl = req.flags.map[option | option.compile]
		
		val UrlParameterItem = req.items.filter[param | param.eClass.name.equals("UrlParameterItem")]
		val HttpHeaderItem = req.items.filter[param | param.eClass.name.equals("HttpHeaderItem")]
		val DataFieldItem = req.items.filter[param | param.eClass.name.equals("DataFieldItem")]
		val FormFileFieldItem = req.items.filter[param | param.eClass.name.equals("FormFileFieldItem")]
		val RawJsonFieldItem = req.items.filter[param | param.eClass.name.equals("RawJsonFieldItem")]
		
		val urlParametersCmpl = UrlParameterItem.map[param | param.compile]
		val httpHeadersCmpl = HttpHeaderItem.map[param | param.compile]
		val dataFieldsCmpl = DataFieldItem.map[param | param.compile]
		val formFieldsCmpl = FormFileFieldItem.map[param | param.compile]
		val rawJsonFieldCmpl = RawJsonFieldItem.map[param | param.compile]
		
		var dataFieldsString = ""
		if (dataFieldsCmpl.size > 0 && !formFlag)
			dataFieldsString = '-d "' + dataFieldsCmpl.join('&') + '"'
		else
			dataFieldsString = dataFieldsCmpl.join(' ')

		var urlParametersString = ""
		if (urlParametersCmpl.size > 0)
			urlParametersString = '?' + urlParametersCmpl.join('&')
		
		'''curl �req.method.compile� �httpHeadersCmpl.join(' ')� �flagsCmpl.join(' ')� �IF req.protocol !== null��req.protocol�://�ENDIF��req.url��IF req.port != 0�:�req.port��ENDIF��IF req.resource !== null�/�req.resource��ENDIF��urlParametersString� �dataFieldsString��formFieldsCmpl.join(' ')��rawJsonFieldCmpl.join(' ')�'''
	}
	
	def dispatch compile (Flag f) '''�f.compile�'''
	
	def dispatch compile(VerboseFlag vb) '''-v'''
	
	def dispatch compile(DownloadFlag dl) '''-O'''
	
	def dispatch compile(HeadersFlag hf) '''-D'''
	
	def dispatch compile(BodyFlag bf) '''-i'''
	
	def dispatch compile(HelpFlag hf) '''-h'''
	
	def dispatch compile(VersionFlag hf) '''--version'''
	
	def dispatch compile(TimeoutFlag tf) '''-m �tf.timeout�'''
	
	def dispatch compile(Method get) '''-X �get.getName()�'''
	
	def dispatch compile(FormFlag ff) {
		formFlag = true;
		'''Content-Type: application/x-www-form-urlencoded; charset=utf-8'''
	}
	
	def dispatch compile(JsonFlag jf) '''-H "Content-Type: application/json"'''
	
	def dispatch compile(AuthFlag af) '''--user �af.username��IF af.password !== null�:�af.password��ENDIF�'''
	
	def dispatch compile(ProxyFlag pf) {
		if (pf.proxyProtocol === null)
			pf.proxyProtocol = "http";
		'''--proxy �pf.proxyProtocol�://�IF pf.username !== null��pf.username�:�pf.password�@�ENDIF��pf.hostname��IF pf.port != 0��pf.port��ENDIF�'''
	}
	
	def dispatch compile(HttpHeaderItem http) '''-H "�http.field�: �http.value�"'''
	
	def dispatch compile(UrlParameterItem urlParam) '''�urlParam.field�=�urlParam.value�'''
	
	def dispatch compile(FormFileFieldItem formField)''' -d "@�formField.value�"'''
	
	def dispatch compile(DataFieldItem data) {
		if (formFlag)
			''' -F �data.field�=�data.value�'''
		else {
			'''�data.field�=�data.value�'''
		}
	}
	
	def dispatch compile(RawJsonFieldItem rawJsonField) '''-d '�rawJsonField.value.compile�' '''
	
	def dispatch compile(JsonType jsonType) '''�jsonType.compile�'''
	
	def dispatch compile(Member m) '''"�m.key�":�m.value.compile�'''
	
	def dispatch compile(JsonObject jsonObject) '''{�IF jsonObject.members.length == 1��jsonObject.members.get(0).compile��ELSEIF jsonObject.members.length != 0��val last = jsonObject.members.get(jsonObject.members.length - 1)��FOR Member m : jsonObject.members��m.compile��IF last !== m��','��ENDIF��ENDFOR��ENDIF�}'''
	
	def dispatch compile(JsonString jsonString) '''"�jsonString.value�"'''
	
	def dispatch compile(JsonArray jsonArray) '''[�IF jsonArray.values.length == 1��jsonArray.values.get(0).compile��ELSEIF jsonArray.values.length != 0��val last = jsonArray.values.get(jsonArray.values.length - 1)��FOR JsonType jt: jsonArray.values��jt.compile��IF last !== jt��','��ENDIF��ENDFOR��ENDIF�]'''
	
	def dispatch compile(JsonBoolean jsonBoolean) '''�jsonBoolean.value�'''
	
	def dispatch compile(JsonNull jsonNull) '''null'''
	
	def dispatch compile(JsonNumber jsonNumber) '''�jsonNumber.value�'''
}
