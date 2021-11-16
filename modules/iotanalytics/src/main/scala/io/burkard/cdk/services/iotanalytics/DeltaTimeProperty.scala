package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DeltaTimeProperty {

  def apply(
    timeExpression: String,
    offsetSeconds: Number
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeProperty.Builder)
      .timeExpression(timeExpression)
      .offsetSeconds(offsetSeconds)
      .build()
}
