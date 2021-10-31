package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessPointAttributes {

  def apply(
    accessPointArn: Option[String] = None,
    fileSystem: Option[software.amazon.awscdk.services.efs.IFileSystem] = None,
    accessPointId: Option[String] = None
  ): software.amazon.awscdk.services.efs.AccessPointAttributes =
    (new software.amazon.awscdk.services.efs.AccessPointAttributes.Builder)
      .accessPointArn(accessPointArn.orNull)
      .fileSystem(fileSystem.orNull)
      .accessPointId(accessPointId.orNull)
      .build()
}
