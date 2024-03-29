/*
 * generated by Xtext 2.25.0
 */
package langageCompilation.concrete.syntax.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import langageCompilation.concrete.syntax.ide.contentassist.antlr.internal.InternalLegoLangParser;
import langageCompilation.concrete.syntax.services.LegoLangGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LegoLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LegoLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LegoLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getBinaryOperationAccess().getAlternatives(), "rule__BinaryOperation__Alternatives");
			builder.put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
			builder.put(grammarAccess.getComparaisonAccess().getAlternatives(), "rule__Comparaison__Alternatives");
			builder.put(grammarAccess.getEngineAccess().getAlternatives(), "rule__Engine__Alternatives");
			builder.put(grammarAccess.getSensorAccess().getAlternatives(), "rule__Sensor__Alternatives");
			builder.put(grammarAccess.getEngineOperationAccess().getAlternatives(), "rule__EngineOperation__Alternatives");
			builder.put(grammarAccess.getSensorOperationAccess().getAlternatives(), "rule__SensorOperation__Alternatives");
			builder.put(grammarAccess.getBooleanExpressionAccess().getAlternatives(), "rule__BooleanExpression__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
			builder.put(grammarAccess.getColorsAccess().getAlternatives(), "rule__Colors__Alternatives");
			builder.put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
			builder.put(grammarAccess.getPauseAccess().getGroup(), "rule__Pause__Group__0");
			builder.put(grammarAccess.getWheelEngineAccess().getGroup(), "rule__WheelEngine__Group__0");
			builder.put(grammarAccess.getMotorizedArmEngineAccess().getGroup(), "rule__MotorizedArmEngine__Group__0");
			builder.put(grammarAccess.getPaintballLauncherEngineAccess().getGroup(), "rule__PaintballLauncherEngine__Group__0");
			builder.put(grammarAccess.getColorSensorAccess().getGroup(), "rule__ColorSensor__Group__0");
			builder.put(grammarAccess.getLaserSensorAccess().getGroup(), "rule__LaserSensor__Group__0");
			builder.put(grammarAccess.getGPSSensorAccess().getGroup(), "rule__GPSSensor__Group__0");
			builder.put(grammarAccess.getGyroSensorAccess().getGroup(), "rule__GyroSensor__Group__0");
			builder.put(grammarAccess.getUltraSonicSensorAccess().getGroup(), "rule__UltraSonicSensor__Group__0");
			builder.put(grammarAccess.getCarAccess().getGroup(), "rule__Car__Group__0");
			builder.put(grammarAccess.getVitesseOperationAccess().getGroup(), "rule__VitesseOperation__Group__0");
			builder.put(grammarAccess.getBreakMotorAccess().getGroup(), "rule__BreakMotor__Group__0");
			builder.put(grammarAccess.getPositionOperationAccess().getGroup(), "rule__PositionOperation__Group__0");
			builder.put(grammarAccess.getForceOperationAccess().getGroup(), "rule__ForceOperation__Group__0");
			builder.put(grammarAccess.getColorOperationAccess().getGroup(), "rule__ColorOperation__Group__0");
			builder.put(grammarAccess.getIntensityOperationAccess().getGroup(), "rule__IntensityOperation__Group__0");
			builder.put(grammarAccess.getRangeOperationAccess().getGroup(), "rule__RangeOperation__Group__0");
			builder.put(grammarAccess.getXGPSOperationAccess().getGroup(), "rule__XGPSOperation__Group__0");
			builder.put(grammarAccess.getYGPSOperationAccess().getGroup(), "rule__YGPSOperation__Group__0");
			builder.put(grammarAccess.getAngleOperationAccess().getGroup(), "rule__AngleOperation__Group__0");
			builder.put(grammarAccess.getDistanceOperationAccess().getGroup(), "rule__DistanceOperation__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
			builder.put(grammarAccess.getAndAccess().getGroup_3(), "rule__And__Group_3__0");
			builder.put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
			builder.put(grammarAccess.getOrAccess().getGroup_3(), "rule__Or__Group_3__0");
			builder.put(grammarAccess.getConditionEtatAccess().getGroup(), "rule__ConditionEtat__Group__0");
			builder.put(grammarAccess.getConditionEtatAccess().getGroup_5(), "rule__ConditionEtat__Group_5__0");
			builder.put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
			builder.put(grammarAccess.getMethodePrintAccess().getGroup(), "rule__MethodePrint__Group__0");
			builder.put(grammarAccess.getMethodePrintAccess().getGroup_3(), "rule__MethodePrint__Group_3__0");
			builder.put(grammarAccess.getSubstractionAccess().getGroup(), "rule__Substraction__Group__0");
			builder.put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
			builder.put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
			builder.put(grammarAccess.getDivisionAccess().getGroup(), "rule__Division__Group__0");
			builder.put(grammarAccess.getGTAccess().getGroup(), "rule__GT__Group__0");
			builder.put(grammarAccess.getLTAccess().getGroup(), "rule__LT__Group__0");
			builder.put(grammarAccess.getEqualAccess().getGroup(), "rule__Equal__Group__0");
			builder.put(grammarAccess.getDifferentAccess().getGroup(), "rule__Different__Group__0");
			builder.put(grammarAccess.getLTorEqualAccess().getGroup(), "rule__LTorEqual__Group__0");
			builder.put(grammarAccess.getGTorEqualAccess().getGroup(), "rule__GTorEqual__Group__0");
			builder.put(grammarAccess.getAssignementAccess().getGroup(), "rule__Assignement__Group__0");
			builder.put(grammarAccess.getPlusEqualAccess().getGroup(), "rule__PlusEqual__Group__0");
			builder.put(grammarAccess.getMinusEqualAccess().getGroup(), "rule__MinusEqual__Group__0");
			builder.put(grammarAccess.getUnIntegerAccess().getGroup(), "rule__UnInteger__Group__0");
			builder.put(grammarAccess.getUnIntegerAccess().getGroup_4(), "rule__UnInteger__Group_4__0");
			builder.put(grammarAccess.getUnDoubleAccess().getGroup(), "rule__UnDouble__Group__0");
			builder.put(grammarAccess.getUnDoubleAccess().getGroup_4(), "rule__UnDouble__Group_4__0");
			builder.put(grammarAccess.getUnBooleanAccess().getGroup(), "rule__UnBoolean__Group__0");
			builder.put(grammarAccess.getUnBooleanAccess().getGroup_4(), "rule__UnBoolean__Group_4__0");
			builder.put(grammarAccess.getUnStringAccess().getGroup(), "rule__UnString__Group__0");
			builder.put(grammarAccess.getUnStringAccess().getGroup_4(), "rule__UnString__Group_4__0");
			builder.put(grammarAccess.getUnColorAccess().getGroup(), "rule__UnColor__Group__0");
			builder.put(grammarAccess.getUnColorAccess().getGroup_4(), "rule__UnColor__Group_4__0");
			builder.put(grammarAccess.getTheDoubleAccess().getGroup(), "rule__TheDouble__Group__0");
			builder.put(grammarAccess.getTheIntAccess().getGroup(), "rule__TheInt__Group__0");
			builder.put(grammarAccess.getTheBooleanAccess().getGroup(), "rule__TheBoolean__Group__0");
			builder.put(grammarAccess.getTheStringAccess().getGroup(), "rule__TheString__Group__0");
			builder.put(grammarAccess.getTheColorAccess().getGroup(), "rule__TheColor__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getProgramAccess().getNameAssignment_2(), "rule__Program__NameAssignment_2");
			builder.put(grammarAccess.getProgramAccess().getStatementAssignment_4(), "rule__Program__StatementAssignment_4");
			builder.put(grammarAccess.getPauseAccess().getExpressionAssignment_2(), "rule__Pause__ExpressionAssignment_2");
			builder.put(grammarAccess.getWheelEngineAccess().getNameAssignment_1(), "rule__WheelEngine__NameAssignment_1");
			builder.put(grammarAccess.getWheelEngineAccess().getPositionAssignment_3(), "rule__WheelEngine__PositionAssignment_3");
			builder.put(grammarAccess.getMotorizedArmEngineAccess().getNameAssignment_1(), "rule__MotorizedArmEngine__NameAssignment_1");
			builder.put(grammarAccess.getMotorizedArmEngineAccess().getPositionAssignment_3(), "rule__MotorizedArmEngine__PositionAssignment_3");
			builder.put(grammarAccess.getPaintballLauncherEngineAccess().getNameAssignment_1(), "rule__PaintballLauncherEngine__NameAssignment_1");
			builder.put(grammarAccess.getPaintballLauncherEngineAccess().getPositionAssignment_3(), "rule__PaintballLauncherEngine__PositionAssignment_3");
			builder.put(grammarAccess.getColorSensorAccess().getNameAssignment_1(), "rule__ColorSensor__NameAssignment_1");
			builder.put(grammarAccess.getColorSensorAccess().getPositionAssignment_3(), "rule__ColorSensor__PositionAssignment_3");
			builder.put(grammarAccess.getLaserSensorAccess().getNameAssignment_1(), "rule__LaserSensor__NameAssignment_1");
			builder.put(grammarAccess.getLaserSensorAccess().getPositionAssignment_3(), "rule__LaserSensor__PositionAssignment_3");
			builder.put(grammarAccess.getGPSSensorAccess().getNameAssignment_1(), "rule__GPSSensor__NameAssignment_1");
			builder.put(grammarAccess.getGPSSensorAccess().getPositionAssignment_3(), "rule__GPSSensor__PositionAssignment_3");
			builder.put(grammarAccess.getGyroSensorAccess().getNameAssignment_1(), "rule__GyroSensor__NameAssignment_1");
			builder.put(grammarAccess.getGyroSensorAccess().getPositionAssignment_3(), "rule__GyroSensor__PositionAssignment_3");
			builder.put(grammarAccess.getUltraSonicSensorAccess().getNameAssignment_1(), "rule__UltraSonicSensor__NameAssignment_1");
			builder.put(grammarAccess.getUltraSonicSensorAccess().getPositionAssignment_3(), "rule__UltraSonicSensor__PositionAssignment_3");
			builder.put(grammarAccess.getCarAccess().getNameAssignment_1(), "rule__Car__NameAssignment_1");
			builder.put(grammarAccess.getCarAccess().getSensorAssignment_3(), "rule__Car__SensorAssignment_3");
			builder.put(grammarAccess.getCarAccess().getEngineAssignment_4(), "rule__Car__EngineAssignment_4");
			builder.put(grammarAccess.getVitesseOperationAccess().getWheelengineAssignment_3(), "rule__VitesseOperation__WheelengineAssignment_3");
			builder.put(grammarAccess.getVitesseOperationAccess().getRightAssignment_6(), "rule__VitesseOperation__RightAssignment_6");
			builder.put(grammarAccess.getBreakMotorAccess().getEngineAssignment_3(), "rule__BreakMotor__EngineAssignment_3");
			builder.put(grammarAccess.getPositionOperationAccess().getMotorizedarmengineAssignment_3(), "rule__PositionOperation__MotorizedarmengineAssignment_3");
			builder.put(grammarAccess.getPositionOperationAccess().getRightAssignment_6(), "rule__PositionOperation__RightAssignment_6");
			builder.put(grammarAccess.getForceOperationAccess().getPaintballlauncherengineAssignment_3(), "rule__ForceOperation__PaintballlauncherengineAssignment_3");
			builder.put(grammarAccess.getForceOperationAccess().getRightAssignment_6(), "rule__ForceOperation__RightAssignment_6");
			builder.put(grammarAccess.getColorOperationAccess().getColorsensorAssignment_3(), "rule__ColorOperation__ColorsensorAssignment_3");
			builder.put(grammarAccess.getIntensityOperationAccess().getColorsensorAssignment_3(), "rule__IntensityOperation__ColorsensorAssignment_3");
			builder.put(grammarAccess.getRangeOperationAccess().getLasersensorAssignment_3(), "rule__RangeOperation__LasersensorAssignment_3");
			builder.put(grammarAccess.getXGPSOperationAccess().getGpssensorAssignment_3(), "rule__XGPSOperation__GpssensorAssignment_3");
			builder.put(grammarAccess.getYGPSOperationAccess().getGpssensorAssignment_3(), "rule__YGPSOperation__GpssensorAssignment_3");
			builder.put(grammarAccess.getAngleOperationAccess().getGyrosensorAssignment_3(), "rule__AngleOperation__GyrosensorAssignment_3");
			builder.put(grammarAccess.getDistanceOperationAccess().getUltrasonicsensorAssignment_3(), "rule__DistanceOperation__UltrasonicsensorAssignment_3");
			builder.put(grammarAccess.getAndAccess().getLeftAssignment_2(), "rule__And__LeftAssignment_2");
			builder.put(grammarAccess.getAndAccess().getRightAssignment_3_1(), "rule__And__RightAssignment_3_1");
			builder.put(grammarAccess.getOrAccess().getLeftAssignment_2(), "rule__Or__LeftAssignment_2");
			builder.put(grammarAccess.getOrAccess().getRightAssignment_3_1(), "rule__Or__RightAssignment_3_1");
			builder.put(grammarAccess.getConditionEtatAccess().getConditionAssignment_1(), "rule__ConditionEtat__ConditionAssignment_1");
			builder.put(grammarAccess.getConditionEtatAccess().getThenAssignment_3(), "rule__ConditionEtat__ThenAssignment_3");
			builder.put(grammarAccess.getConditionEtatAccess().getElseAssignment_5_1(), "rule__ConditionEtat__ElseAssignment_5_1");
			builder.put(grammarAccess.getWhileLoopAccess().getLoopConditionAssignment_1(), "rule__WhileLoop__LoopConditionAssignment_1");
			builder.put(grammarAccess.getWhileLoopAccess().getStatementAssignment_3(), "rule__WhileLoop__StatementAssignment_3");
			builder.put(grammarAccess.getMethodePrintAccess().getExpressionAssignment_2(), "rule__MethodePrint__ExpressionAssignment_2");
			builder.put(grammarAccess.getMethodePrintAccess().getExpressionAssignment_3_1(), "rule__MethodePrint__ExpressionAssignment_3_1");
			builder.put(grammarAccess.getVariableRefAccess().getVariableAssignment(), "rule__VariableRef__VariableAssignment");
			builder.put(grammarAccess.getSubstractionAccess().getLeftAssignment_1(), "rule__Substraction__LeftAssignment_1");
			builder.put(grammarAccess.getSubstractionAccess().getRightAssignment_3(), "rule__Substraction__RightAssignment_3");
			builder.put(grammarAccess.getAdditionAccess().getLeftAssignment_1(), "rule__Addition__LeftAssignment_1");
			builder.put(grammarAccess.getAdditionAccess().getRightAssignment_3(), "rule__Addition__RightAssignment_3");
			builder.put(grammarAccess.getMultiplicationAccess().getLeftAssignment_1(), "rule__Multiplication__LeftAssignment_1");
			builder.put(grammarAccess.getMultiplicationAccess().getRightAssignment_3(), "rule__Multiplication__RightAssignment_3");
			builder.put(grammarAccess.getDivisionAccess().getLeftAssignment_1(), "rule__Division__LeftAssignment_1");
			builder.put(grammarAccess.getDivisionAccess().getRightAssignment_3(), "rule__Division__RightAssignment_3");
			builder.put(grammarAccess.getGTAccess().getLeftAssignment_1(), "rule__GT__LeftAssignment_1");
			builder.put(grammarAccess.getGTAccess().getRightAssignment_3(), "rule__GT__RightAssignment_3");
			builder.put(grammarAccess.getLTAccess().getLeftAssignment_1(), "rule__LT__LeftAssignment_1");
			builder.put(grammarAccess.getLTAccess().getRightAssignment_3(), "rule__LT__RightAssignment_3");
			builder.put(grammarAccess.getEqualAccess().getLeftAssignment_1(), "rule__Equal__LeftAssignment_1");
			builder.put(grammarAccess.getEqualAccess().getRightAssignment_3(), "rule__Equal__RightAssignment_3");
			builder.put(grammarAccess.getDifferentAccess().getLeftAssignment_1(), "rule__Different__LeftAssignment_1");
			builder.put(grammarAccess.getDifferentAccess().getRightAssignment_3(), "rule__Different__RightAssignment_3");
			builder.put(grammarAccess.getLTorEqualAccess().getLeftAssignment_1(), "rule__LTorEqual__LeftAssignment_1");
			builder.put(grammarAccess.getLTorEqualAccess().getRightAssignment_3(), "rule__LTorEqual__RightAssignment_3");
			builder.put(grammarAccess.getGTorEqualAccess().getLeftAssignment_1(), "rule__GTorEqual__LeftAssignment_1");
			builder.put(grammarAccess.getGTorEqualAccess().getRightAssignment_3(), "rule__GTorEqual__RightAssignment_3");
			builder.put(grammarAccess.getAssignementAccess().getLeftAssignment_2(), "rule__Assignement__LeftAssignment_2");
			builder.put(grammarAccess.getAssignementAccess().getRightAssignment_4(), "rule__Assignement__RightAssignment_4");
			builder.put(grammarAccess.getPlusEqualAccess().getLeftAssignment_2(), "rule__PlusEqual__LeftAssignment_2");
			builder.put(grammarAccess.getPlusEqualAccess().getRightAssignment_4(), "rule__PlusEqual__RightAssignment_4");
			builder.put(grammarAccess.getMinusEqualAccess().getLeftAssignment_2(), "rule__MinusEqual__LeftAssignment_2");
			builder.put(grammarAccess.getMinusEqualAccess().getRightAssignment_4(), "rule__MinusEqual__RightAssignment_4");
			builder.put(grammarAccess.getUnIntegerAccess().getIsConstAssignment_1(), "rule__UnInteger__IsConstAssignment_1");
			builder.put(grammarAccess.getUnIntegerAccess().getNameAssignment_3(), "rule__UnInteger__NameAssignment_3");
			builder.put(grammarAccess.getUnIntegerAccess().getInitialeValueAssignment_4_1(), "rule__UnInteger__InitialeValueAssignment_4_1");
			builder.put(grammarAccess.getUnDoubleAccess().getIsConstAssignment_1(), "rule__UnDouble__IsConstAssignment_1");
			builder.put(grammarAccess.getUnDoubleAccess().getNameAssignment_3(), "rule__UnDouble__NameAssignment_3");
			builder.put(grammarAccess.getUnDoubleAccess().getInitialeValue1Assignment_4_1(), "rule__UnDouble__InitialeValue1Assignment_4_1");
			builder.put(grammarAccess.getUnDoubleAccess().getInitialeValue2Assignment_4_3(), "rule__UnDouble__InitialeValue2Assignment_4_3");
			builder.put(grammarAccess.getUnBooleanAccess().getIsConstAssignment_1(), "rule__UnBoolean__IsConstAssignment_1");
			builder.put(grammarAccess.getUnBooleanAccess().getNameAssignment_3(), "rule__UnBoolean__NameAssignment_3");
			builder.put(grammarAccess.getUnBooleanAccess().getInitialeValueAssignment_4_1(), "rule__UnBoolean__InitialeValueAssignment_4_1");
			builder.put(grammarAccess.getUnStringAccess().getIsConstAssignment_1(), "rule__UnString__IsConstAssignment_1");
			builder.put(grammarAccess.getUnStringAccess().getNameAssignment_3(), "rule__UnString__NameAssignment_3");
			builder.put(grammarAccess.getUnStringAccess().getInitialeValueAssignment_4_1(), "rule__UnString__InitialeValueAssignment_4_1");
			builder.put(grammarAccess.getUnColorAccess().getIsConstAssignment_1(), "rule__UnColor__IsConstAssignment_1");
			builder.put(grammarAccess.getUnColorAccess().getNameAssignment_3(), "rule__UnColor__NameAssignment_3");
			builder.put(grammarAccess.getUnColorAccess().getInitialValueAssignment_4_1(), "rule__UnColor__InitialValueAssignment_4_1");
			builder.put(grammarAccess.getTheDoubleAccess().getValue1Assignment_1(), "rule__TheDouble__Value1Assignment_1");
			builder.put(grammarAccess.getTheDoubleAccess().getValue2Assignment_3(), "rule__TheDouble__Value2Assignment_3");
			builder.put(grammarAccess.getTheIntAccess().getValueAssignment_1(), "rule__TheInt__ValueAssignment_1");
			builder.put(grammarAccess.getTheBooleanAccess().getValueAssignment_1(), "rule__TheBoolean__ValueAssignment_1");
			builder.put(grammarAccess.getTheStringAccess().getValueAssignment_1(), "rule__TheString__ValueAssignment_1");
			builder.put(grammarAccess.getTheColorAccess().getValueAssignment_1(), "rule__TheColor__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LegoLangGrammarAccess grammarAccess;

	@Override
	protected InternalLegoLangParser createParser() {
		InternalLegoLangParser result = new InternalLegoLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LegoLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LegoLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
