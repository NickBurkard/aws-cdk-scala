package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EncryptionInTransitProperty {

  def apply(
    inCluster: Option[Boolean] = None,
    clientBroker: Option[String] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty.Builder)
      .inCluster(inCluster.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .clientBroker(clientBroker.orNull)
      .build()
}