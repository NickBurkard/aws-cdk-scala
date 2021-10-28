package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NumberAttributeConstraintsProperty {

  def apply(
    minValue: Option[String] = None,
    maxValue: Option[String] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.NumberAttributeConstraintsProperty.Builder)
      .minValue(minValue.orNull)
      .maxValue(maxValue.orNull)
      .build()
}
