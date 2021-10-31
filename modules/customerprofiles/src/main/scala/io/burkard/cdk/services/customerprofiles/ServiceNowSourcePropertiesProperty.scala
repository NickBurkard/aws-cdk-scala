package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ServiceNowSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.ServiceNowSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
