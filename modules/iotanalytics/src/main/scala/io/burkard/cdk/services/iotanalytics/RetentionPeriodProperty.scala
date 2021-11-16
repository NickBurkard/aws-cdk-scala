package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RetentionPeriodProperty {

  def apply(
    numberOfDays: Number,
    unlimited: Boolean
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.RetentionPeriodProperty.Builder)
      .numberOfDays(numberOfDays)
      .unlimited(unlimited)
      .build()
}
