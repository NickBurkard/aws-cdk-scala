package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EncryptionInfoProperty {

  def apply(
    encryptionInTransit: Option[software.amazon.awscdk.services.msk.CfnCluster.EncryptionInTransitProperty] = None,
    encryptionAtRest: Option[software.amazon.awscdk.services.msk.CfnCluster.EncryptionAtRestProperty] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.EncryptionInfoProperty.Builder)
      .encryptionInTransit(encryptionInTransit.orNull)
      .encryptionAtRest(encryptionAtRest.orNull)
      .build()
}
