package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RangeProperty {

  def apply(
    startTime: String,
    endTime: String
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.RangeProperty.Builder)
      .startTime(startTime)
      .endTime(endTime)
      .build()
}
