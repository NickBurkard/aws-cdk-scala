package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RootDirectoryProperty {

  def apply(
    path: Option[String] = None,
    creationInfo: Option[software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty] = None
  ): software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty =
    (new software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty.Builder)
      .path(path.orNull)
      .creationInfo(creationInfo.orNull)
      .build()
}
