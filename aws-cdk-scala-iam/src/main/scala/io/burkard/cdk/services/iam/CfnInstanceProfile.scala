package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
