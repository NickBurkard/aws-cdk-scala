package io.burkard.cdk.services.greengrassv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaVolumeMountProperty {

  def apply(
    permission: Option[String] = None,
    addGroupOwner: Option[Boolean] = None,
    sourcePath: Option[String] = None,
    destinationPath: Option[String] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty.Builder)
      .permission(permission.orNull)
      .addGroupOwner(addGroupOwner.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourcePath(sourcePath.orNull)
      .destinationPath(destinationPath.orNull)
      .build()
}
