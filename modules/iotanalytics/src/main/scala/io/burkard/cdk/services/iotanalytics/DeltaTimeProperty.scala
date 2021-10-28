package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeltaTimeProperty {

  def apply(
    timeExpression: Option[String] = None,
    offsetSeconds: Option[Number] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder)
      .timeExpression(timeExpression.orNull)
      .offsetSeconds(offsetSeconds.orNull)
      .build()
}
