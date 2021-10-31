package io.burkard.cdk.services.msk

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object EBSStorageInfoProperty {

  def apply(
    volumeSize: Option[Number] = None
  ): software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty =
    (new software.amazon.awscdk.services.msk.CfnCluster.EBSStorageInfoProperty.Builder)
      .volumeSize(volumeSize.orNull)
      .build()
}
