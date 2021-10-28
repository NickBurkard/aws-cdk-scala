package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnVirtualMFADevice {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    users: Option[List[String]] = None,
    virtualMfaDeviceName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnVirtualMFADevice =
    software.amazon.awscdk.services.iam.CfnVirtualMFADevice.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .tags(tags.map(_.asJava).orNull)
      .users(users.map(_.asJava).orNull)
      .virtualMfaDeviceName(virtualMfaDeviceName.orNull)
      .build()
}
