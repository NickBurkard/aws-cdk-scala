package io.burkard.cdk.services.certificatemanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccount {

  def apply(
    internalResourceId: String,
    expiryEventsConfiguration: software.amazon.awscdk.services.certificatemanager.CfnAccount.ExpiryEventsConfigurationProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.certificatemanager.CfnAccount =
    software.amazon.awscdk.services.certificatemanager.CfnAccount.Builder
      .create(stackCtx, internalResourceId)
      .expiryEventsConfiguration(expiryEventsConfiguration)
      .build()
}
