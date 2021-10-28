package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogicalTableSourceProperty {

  def apply(
    joinInstruction: Option[software.amazon.awscdk.services.quicksight.CfnDataSet.JoinInstructionProperty] = None,
    physicalTableId: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSet.LogicalTableSourceProperty.Builder)
      .joinInstruction(joinInstruction.orNull)
      .physicalTableId(physicalTableId.orNull)
      .build()
}
