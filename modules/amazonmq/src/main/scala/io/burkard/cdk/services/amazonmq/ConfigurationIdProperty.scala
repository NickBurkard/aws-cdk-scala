package io.burkard.cdk.services.amazonmq

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConfigurationIdProperty {

  def apply(
    revision: Number,
    id: String
  ): software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation.ConfigurationIdProperty.Builder)
      .revision(revision)
      .id(id)
      .build()
}
