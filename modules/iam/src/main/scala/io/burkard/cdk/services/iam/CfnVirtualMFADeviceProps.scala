package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualMFADeviceProps {

  def apply(
    path: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    users: Option[List[String]] = None,
    virtualMfaDeviceName: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps =
    (new software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps.Builder)
      .path(path.orNull)
      .tags(tags.map(_.asJava).orNull)
      .users(users.map(_.asJava).orNull)
      .virtualMfaDeviceName(virtualMfaDeviceName.orNull)
      .build()
}
