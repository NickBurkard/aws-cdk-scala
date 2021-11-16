package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnVirtualMFADeviceProps {

  def apply(
    users: List[String],
    path: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    virtualMfaDeviceName: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps =
    (new software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps.Builder)
      .users(users.asJava)
      .path(path.orNull)
      .tags(tags.map(_.asJava).orNull)
      .virtualMfaDeviceName(virtualMfaDeviceName.orNull)
      .build()
}
