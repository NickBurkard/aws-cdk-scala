package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ServiceNowSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
