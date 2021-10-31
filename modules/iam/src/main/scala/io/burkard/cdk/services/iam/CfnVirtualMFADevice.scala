package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
