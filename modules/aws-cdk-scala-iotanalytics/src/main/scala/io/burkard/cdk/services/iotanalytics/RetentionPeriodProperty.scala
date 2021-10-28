package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RetentionPeriodProperty {

  def apply(
    numberOfDays: Option[Number] = None,
    unlimited: Option[Boolean] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnChannel.RetentionPeriodProperty.Builder)
      .numberOfDays(numberOfDays.orNull)
      .unlimited(unlimited.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
