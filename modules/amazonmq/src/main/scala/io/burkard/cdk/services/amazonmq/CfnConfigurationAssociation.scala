package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationAssociation {

  def apply(
    internalResourceId: String,
    broker: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation =
    software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.Builder
      .create(stackCtx, internalResourceId)
      .broker(broker.orNull)
      .configuration(configuration.orNull)
      .build()
}
