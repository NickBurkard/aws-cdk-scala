package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NodeToNodeEncryptionOptionsProperty {

  def apply(
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
