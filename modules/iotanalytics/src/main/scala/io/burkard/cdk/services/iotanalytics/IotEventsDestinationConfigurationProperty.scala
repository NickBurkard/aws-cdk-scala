package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IotEventsDestinationConfigurationProperty {

  def apply(
    inputName: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty.Builder)
      .inputName(inputName.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
