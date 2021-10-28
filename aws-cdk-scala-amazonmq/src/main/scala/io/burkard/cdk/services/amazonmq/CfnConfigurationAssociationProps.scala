package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConfigurationAssociationProps {

  def apply(
    broker: Option[String] = None,
    configuration: Option[software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty] = None
  ): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps =
    (new software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps.Builder)
      .broker(broker.orNull)
      .configuration(configuration.orNull)
      .build()
}
