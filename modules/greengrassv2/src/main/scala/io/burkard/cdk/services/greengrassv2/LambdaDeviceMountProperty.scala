package io.burkard.cdk.services.greengrassv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaDeviceMountProperty {

  def apply(
    path: Option[String] = None,
    permission: Option[String] = None,
    addGroupOwner: Option[Boolean] = None
  ): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty =
    (new software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty.Builder)
      .path(path.orNull)
      .permission(permission.orNull)
      .addGroupOwner(addGroupOwner.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
