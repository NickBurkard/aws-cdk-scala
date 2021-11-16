package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceConfigurationProperty {

  def apply(
    volumeSizeInGb: Number,
    computeType: String
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.ResourceConfigurationProperty.Builder)
      .volumeSizeInGb(volumeSizeInGb)
      .computeType(computeType)
      .build()
}
