package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationAssociation {

  def apply(
    internalResourceId: String,
    broker: String,
    configuration: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation =
    software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.Builder
      .create(stackCtx, internalResourceId)
      .broker(broker)
      .configuration(configuration)
      .build()
}
