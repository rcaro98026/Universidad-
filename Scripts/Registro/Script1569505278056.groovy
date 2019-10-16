import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod-urosario.cs41.force.com/registro')

WebUI.waitForPageLoad(3)

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Rosario/select_FacultadPrograma'), facultad)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rosario/select_PregradoPosgrado'), 'Posgrado', true)

WebUI.waitForElementPresent(findTestObject('Object Repository/Rosario/select_Programa'), 2)

WebUI.sendKeys(findTestObject('Rosario/select_Programa'), programa)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/Rosario/select_NUEVODOBLE PROGRAMATRASLADOTRANSFERENCIA'), 'NUEVO', 
    true)

WebUI.setText(findTestObject('Object Repository/Rosario/txtPrimerNombre'), primerNombre)

WebUI.setText(findTestObject('Object Repository/Rosario/txt_Segundo nombre'), segundoNombre)

WebUI.setText(findTestObject('Object Repository/Rosario/txt__Primer apellido'), primerApellido)

WebUI.setText(findTestObject('Object Repository/Rosario/txt_Segundo apellido'), segundoApellido)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rosario/select_CategoriaInscripcion'), 'NUEVO', true)

WebUI.sendKeys(findTestObject('Rosario/select_TipoDocumento'), documento)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Rosario/txt__NumeroDoc'), '1019138651')

WebUI.sendKeys(findTestObject('Rosario/select_ALEMANIACOLOMBIA'), pais)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Rosario/select_Ciudad'), 2)

WebUI.sendKeys(findTestObject('Rosario/select_Ciudad'), ciudad)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Rosario/div_ALEMANIA()49COLOMBIA()57'))

WebUI.click(findTestObject('Object Repository/Rosario/td_()49_trid'))

WebUI.setText(findTestObject('Rosario/txt_IndicativoCiudad'), '1100')

WebUI.setText(findTestObject('Rosario/txt__Telefono fijo'), telefonoFijo)

WebUI.click(findTestObject('Rosario/div_ALEMANIA()49COLOMBIA()57 - Copy'))

WebUI.click(findTestObject('Rosario/td_COLOMBIA'))

WebUI.setText(findTestObject('Rosario/txt__Telefono fijo-copy'), celular)

WebUI.setText(findTestObject('Rosario/txt__Correo electrnico'), correo)

