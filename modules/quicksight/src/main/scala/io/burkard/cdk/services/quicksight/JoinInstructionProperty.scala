package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JoinInstructionProperty {

  def apply(
    rightOperand: Option[String] = None,
    leftOperand: Option[String] = None,
    onClause: Option[String] = None,
    leftJoinKeyProperties: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty] = None,
    rightJoinKeyProperties: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.JoinKeyPropertiesProperty] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty.Builder)
      .rightOperand(rightOperand.orNull)
      .leftOperand(leftOperand.orNull)
      .onClause(onClause.orNull)
      .leftJoinKeyProperties(leftJoinKeyProperties.orNull)
      .rightJoinKeyProperties(rightJoinKeyProperties.orNull)
      .`type`(`type`.orNull)
      .build()
}
