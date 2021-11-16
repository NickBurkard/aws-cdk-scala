package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ZendeskSourcePropertiesProperty {

  def apply(
    `object`: String
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.ZendeskSourcePropertiesProperty.Builder)
      .`object`(`object`)
      .build()
}
