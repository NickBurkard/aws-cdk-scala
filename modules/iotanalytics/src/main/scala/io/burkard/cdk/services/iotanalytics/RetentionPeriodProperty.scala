package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RetentionPeriodProperty {

  def apply(
    numberOfDays: Option[Number] = None,
    unlimited: Option[Boolean] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder)
      .numberOfDays(numberOfDays.orNull)
      .unlimited(unlimited.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
