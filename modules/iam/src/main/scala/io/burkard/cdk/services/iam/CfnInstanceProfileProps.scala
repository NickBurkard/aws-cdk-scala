package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnInstanceProfileProps {

  def apply(
    path: Option[String] = None,
    instanceProfileName: Option[String] = None,
    roles: Option[List[String]] = None
  ): software.amazon.awscdk.services.iam.CfnInstanceProfileProps =
    (new software.amazon.awscdk.services.iam.CfnInstanceProfileProps.Builder)
      .path(path.orNull)
      .instanceProfileName(instanceProfileName.orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}
