package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConfigurationAssociationProps {

  def apply(
    broker: String,
    configuration: software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty
  ): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps =
    (new software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder)
      .broker(broker)
      .configuration(configuration)
      .build()
}
