package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DimensionProperty {

  def apply(
    name: String,
    value: String
  ): software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty =
    (new software.amazon.awscdk.services.cloudwatch.CfnAlarm.DimensionProperty.Builder)
      .name(name)
      .value(value)
      .build()
}
