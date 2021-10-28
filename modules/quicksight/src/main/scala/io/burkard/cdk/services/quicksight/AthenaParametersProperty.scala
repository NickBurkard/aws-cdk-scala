package io.burkard.cdk.services.quicksight

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AthenaParametersProperty {

  def apply(
    workGroup: Option[String] = None
  ): software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty =
    (new software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty.Builder)
      .workGroup(workGroup.orNull)
      .build()
}
