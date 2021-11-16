package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotEventsDestinationConfigurationProperty {

  def apply(
    inputName: String,
    roleArn: String
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty.Builder)
      .inputName(inputName)
      .roleArn(roleArn)
      .build()
}
