package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeltaTimeSessionWindowConfigurationProperty {

  def apply(
    timeoutInMinutes: Option[Number] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty.Builder)
      .timeoutInMinutes(timeoutInMinutes.orNull)
      .build()
}
