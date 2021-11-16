package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JoinInstructionProperty {

  def apply(
    rightOperand: String,
    leftOperand: String,
    onClause: String,
    `type`: String,
    leftJoinKeyProperties: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty] = None,
    rightJoinKeyProperties: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty.Builder)
      .rightOperand(rightOperand)
      .leftOperand(leftOperand)
      .onClause(onClause)
      .`type`(`type`)
      .leftJoinKeyProperties(leftJoinKeyProperties.orNull)
      .rightJoinKeyProperties(rightJoinKeyProperties.orNull)
      .build()
}
