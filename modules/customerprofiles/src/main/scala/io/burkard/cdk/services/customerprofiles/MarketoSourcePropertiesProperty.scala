package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MarketoSourcePropertiesProperty {

  def apply(
    `object`: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.MarketoSourcePropertiesProperty.Builder)
      .`object`(`object`.orNull)
      .build()
}
