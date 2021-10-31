package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceProfile {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    instanceProfileName: Option[String] = None,
    roles: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnInstanceProfile =
    software.amazon.awscdk.services.iam.CfnInstanceProfile.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .instanceProfileName(instanceProfileName.orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
