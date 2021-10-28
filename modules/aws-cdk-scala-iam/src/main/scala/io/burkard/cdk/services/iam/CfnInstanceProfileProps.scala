package io.burkard.cdk.services.iam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
