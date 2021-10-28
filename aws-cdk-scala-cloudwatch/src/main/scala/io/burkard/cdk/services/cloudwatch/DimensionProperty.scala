package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DimensionProperty {

  def apply(
    name: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder)
      .name(name.orNull)
      .value(value.orNull)
      .build()
}
