package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DimensionProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector.DimensionProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
