package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConfigurationIdProperty {

  def apply(
    revision: Option[Number] = None,
    id: Option[String] = None
  ): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder)
      .revision(revision.orNull)
      .id(id.orNull)
      .build()
}
