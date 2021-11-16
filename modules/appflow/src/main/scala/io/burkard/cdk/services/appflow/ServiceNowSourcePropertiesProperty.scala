package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceNowSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ServiceNowSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
