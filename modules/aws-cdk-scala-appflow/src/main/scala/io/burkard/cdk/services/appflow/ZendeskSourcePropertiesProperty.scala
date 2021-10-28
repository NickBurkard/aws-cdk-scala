package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ZendeskSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ZendeskSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
